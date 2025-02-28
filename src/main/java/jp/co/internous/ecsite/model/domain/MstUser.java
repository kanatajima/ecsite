package jp.co.internous.ecsite.model.domain;

public class MstUser {
	
	private int id;
	
	private String userName;
	
	private String password;
	
	private String fullName;
	
	private int isAdmin;

	
	//setメソッド
	public void setId(int id) {
		this.id = id;
   }
	
	public void setUserName(String userName) {
	    this.userName = userName;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	
	public void setIsAdmin(int isAdmin) {
		this.isAdmin = isAdmin;
	}
	
	
	//getメソッド
	public int getId() {
		return id;
	}
	
	public String getUserName() {
		return userName;
	}
	
	public String getPassword() {
		return password;
	}
	
	public String getFullName() {
		return fullName;
	}
	
	public int getIsAdmin() {
		return isAdmin;
	}
	
}
