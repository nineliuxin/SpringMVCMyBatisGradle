package org.fkit.domain;

import java.io.Serializable;

public class Collection implements Serializable {
	private Integer id;
	private String user_name;
	private String goodname;
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
	public String getGoodname() {
		return goodname;
	}
	public void setGoodname(String goodname) {
		this.goodname = goodname;
	}
	@Override
	public String toString() {
		return "Collection [id=" + id + ", user_name=" + user_name+ ",goodname="+goodname+"]";
	}
}
