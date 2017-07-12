package org.fkit.domain;

import java.io.Serializable;
import java.sql.Timestamp;

public class Users implements Serializable{
	private Integer id;			// id
	private String user_name;	// 用户名
	private String email;		// 邮箱
	private String validatacode;//密钥
	private Timestamp registerdate;//过期时间
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getValidatacode() {
		return validatacode;
	}
	public void setValidatacode(String validatacode) {
		this.validatacode = validatacode;
	}
	public Timestamp getRegisterdate() {
		return registerdate;
	}
	public void setRegisterdate(Timestamp registerdate) {
		this.registerdate = registerdate;
	}
	@Override
	public String toString() {
		return "Users [id=" + id + ", user_name="+ user_name + ",email=" + email + ", validatacode=" + validatacode + ", registerdate=" + registerdate + "]";
	}
	
}