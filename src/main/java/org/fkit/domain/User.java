package org.fkit.domain;

import java.io.Serializable;

public class User implements Serializable{

	private Integer id;			// id
	private String user_id;	// 用户编号
	private String user_name;	// 用户名
	private String user_pwd;	// 密码
	private String adress;		// 地址
	private String email;		// 邮箱
	private String telnumber;// 电话
	public User(){
		super();
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public String getUser_pwd() {
		return user_pwd;
	}
	public void setUser_pwd(String user_pwd) {
		this.user_pwd = user_pwd;
	}
	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTelnumber() {
		return telnumber;
	}
	public void setTelnumber(String telnumber) {
		this.telnumber = telnumber;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", user_id=" + user_id + ", user_name="
				+ user_name + ", user_pwd=" + user_pwd + ", adress=" + adress
				+ ", email=" + email + ", telnumber=" + telnumber + "]";
	}
	
	
}
