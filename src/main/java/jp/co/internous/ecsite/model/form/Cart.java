package jp.co.internous.ecsite.model.form;

import java.io.Serializable;

public class Cart implements Serializable{
	
	private int id;
    private String goodsName;
    private int price;
    private int count;

    
    //
    public void setId(int id) {
    	this.id = id;
    }
    
    public void setGoodsName(String goodsName) {
    	this.goodsName = goodsName;
    }
    
    public void setPrice(int price) {
    	this.price = price;
    }
    
    public void setCount(int count) {
    	this.count = count;
    }
    
    
    //
    public int getId() {
    	return id;
    }
    
    public String getGoodsName(){
    	return goodsName;
    }
    
    public int getPrice() {
    	return price;
    }
    
    public int getCount() {
    	return count;
    }
}
