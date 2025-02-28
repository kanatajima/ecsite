package jp.co.internous.ecsite.model.form;

import java.io.Serializable;
import java.util.List;

public class CartForm implements Serializable {
	
	private int userId;
	
	//「Cart型」のCartListという変数
	private List<Cart> cartList;
	
	public void setUserId(int userId) {
		this.userId =userId;
	}
	
	public void setCartList(List<Cart> cartList) {
		this.cartList = cartList;
	}
	
	public int getUserId() {
		return userId;
	}
	
	public List<Cart> getCartList(){
		return cartList;
	}
	

}
