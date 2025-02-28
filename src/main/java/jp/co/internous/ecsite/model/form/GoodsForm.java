package jp.co.internous.ecsite.model.form;

import java.io.Serializable;

public class GoodsForm implements Serializable {
	
	
	//ユーザーがブラウザかで入力した新規商品情報を受け取るためのクラス
	private int id;
	private String goodsName;
	private int price;
	
	public void setId(int id) {
		this.id = id;
	}
	
	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}

	
	public int getId() {
		return id;
	}
	
	public String getGoodsName() {
		return goodsName;
	}
	
	public int getPrice() {
		return price;
	}
	
	
	
}
