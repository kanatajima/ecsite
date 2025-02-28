package jp.co.internous.ecsite.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import jp.co.internous.ecsite.model.domain.MstGoods;
import jp.co.internous.ecsite.model.domain.MstUser;
import jp.co.internous.ecsite.model.form.GoodsForm;
import jp.co.internous.ecsite.model.form.LoginForm;
import jp.co.internous.ecsite.model.mapper.MstGoodsMapper;
import jp.co.internous.ecsite.model.mapper.MstUserMapper;

@Controller
@RequestMapping("/ecsite/admin")

public class AdminController {
	
	
	//メソッドを呼び出すためにインスタンス化する←フィールドはprivateで定義されているので、他では使えない。
	@Autowired
	private MstUserMapper userMapper;
	
	@Autowired
	private MstGoodsMapper goodsMapper;
	
	@RequestMapping("/")
	public String index() {
		return "admintop";
	}
	
	@PostMapping("/welcome")
	public String welcome(LoginForm form, Model model) {
		//ログインは画面→java、ModelはJave→画面にデータを送る
		
		MstUser user = userMapper.findByUserNameAndPassword(form);
		
		if (user == null) {
			model.addAttribute("errMessage", "ユーザー名またはパスワードが違います。");
			return "forward:/ecsite/admin/";
		}
		
		if (user.getIsAdmin() == 0) {
			model.addAttribute("errMessage","管理者ではありません。");
			return "forward:/ecsite/admin/";
		}
		
		List<MstGoods> goods = goodsMapper.findAll();
		                /*
		                 * addAttributeはキーと値で設定するルール。
		                 * なので、左はキー（変数。だから何でも良い！）、右は値（getterで取得した値）)
		                 */
		model.addAttribute("userName", user.getUserName());
		model.addAttribute("password", user.getPassword());
		model.addAttribute("goods", goods);
		
		return "welcome";
	}

	
	@PostMapping("/goodsMst")
	public String goodsMst(LoginForm f, Model m) {
		m.addAttribute("userName", f.getUserName());
		m.addAttribute("password", f.getPassword());
		
		//遷移する↓HTMLなので小文字で書く
		return "goodsmst";
	}
	
	
	//新規商品情報をデータベースに登録する
	@PostMapping("/addGoods")
	public String addGoods(GoodsForm goodsForm, LoginForm loginForm, Model m) {
		m.addAttribute("userName",loginForm.getUserName());
		m.addAttribute("password",loginForm.getPassword());
		
		MstGoods goods = new MstGoods();
		goods.setGoodsName(goodsForm.getGoodsName());
		goods.setPrice(goodsForm.getPrice());
		
		goodsMapper.insert(goods);
		
		return "forward:/ecsite/admin/welcome";
	}
	
	
	//商品データベースから商品を削除する
	@ResponseBody
	@PostMapping("/api/deleteGoods")
	public String deleteApi(@RequestBody GoodsForm f, Model m) {
		try {
			goodsMapper.deleteById(f.getId());
		} catch (IllegalArgumentException e) {
			return "-1";   //例外がキャッチされた場合には、「処理失敗」印として「－1」を返却
		}
		
		return "1";        //例外が起きず、ここまで来れれば「処理成功」印として「1」を返却
	}
	
	
}
