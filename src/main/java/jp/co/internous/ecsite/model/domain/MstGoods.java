package jp.co.internous.ecsite.model.domain;

import java.sql.Timestamp;

public class MstGoods {
	
	private int id;
	private String goodsName;
	private int price;
	private Timestamp createdAt;
	private Timestamp updatedAt;
	
	
	public void setId(int id) {
		this.id = id;
	}
	
	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	public void setCreatedAt(Timestamp createdAt) {
		this.createdAt = createdAt;
	}
	
	public void setUpdatedAt(Timestamp updatedAt) {
		this.updatedAt = updatedAt;
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
	
	public Timestamp getCreatedAt() {
		return createdAt;
	}
	
	public Timestamp getUpdatedAt() {
		return updatedAt;
	}
	
	
}

