package jp.co.internous.ecsite.model.dto;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;

import jp.co.internous.ecsite.model.domain.TblPurchase;

public class HistoryDto {
	
	private int id;
	private int userId;
	private int goodsId;
	private String goodsName;
	private int itemCount;
	private int total;
	private String createdAt;
	
	/*
	 * コンストラクタ（デフォルトコンストラクタ）。
	 * コンストラクタを2つ以上書く場合は、デフォルトコンストラクタを書くルールがある。
	 */
	
	public HistoryDto() {}
	
	//2パターンある（コンストラクタでフィールドに格納と、setterで格納）
	public HistoryDto(TblPurchase entity) {
		this.id = entity.getId();
		this.userId = entity.getUserId();
		this.goodsId = entity.getGoodsId();
		this.goodsName = entity.getGoodsName();
		this.itemCount = entity.getItemCount();
		this.total = entity.getTotal();
		
		//String型になるように、Timestamp型を直す(？)
		Timestamp d = entity.getCreatedAt();
		SimpleDateFormat f = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		this.createdAt = f.format(d);
		
	}
			
		//2パターン目	
	public void setId(int id) {
		this.goodsId = id;
	}
	
	public int getId() {
		return id;
	}
	
	public void setUserId(int userId) {
		this.userId = userId;
	}
	
	public int getUserId() {
		return userId;
	}
	
	public void setGoodsId(int goodsId) {
		this.goodsId = goodsId;
	}
	
	public int getGoodsId() {
		return goodsId;
	}
	
	public void setgoodsName(String goodsName) {
		this.goodsName = goodsName;
	}

	public String getGoodsName() {
		return goodsName;
	}
	
	public void setItemCount(int itemCount) {
		this.itemCount = itemCount;
	}
	
	public int getItemCount() {
		return itemCount;
	}
	
	public void setTotal(int total) {
		this.total = total;
	}
	
	public int getTotal() {
		return total;
	}
	
	public void setCreatedAt(String createdAt) {
		this.createdAt = createdAt;
	}
	
	public String getCreatedAt() {
		return createdAt;
	}
	
}
