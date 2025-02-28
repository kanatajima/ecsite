package jp.co.internous.ecsite.model.form;

import java.io.Serializable;

public class LoginForm implements Serializable {
	
	
	//ログイン後、ユーザー情報を受け取るためのフィールド
	private String userName;
	private String password;
	
	//情報を受け取ってセット、また返す
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}

	public String getUserName() {
		return userName;
	}
	
	public String getPassword() {
		return password;
	}
}
