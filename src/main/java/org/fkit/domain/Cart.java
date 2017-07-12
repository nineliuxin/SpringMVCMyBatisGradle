package org.fkit.domain;

import java.io.Serializable;

public class Cart implements Serializable {
	private Integer id;			// id
	private String user_id;	// 用户编号
	private String user_name;	// 用户名
	private String suk;	// 商品编号
	private Integer quantity ;		// 数量
	private String goodname ;		// 商品名称
	private String image;//商品图片
	private Double price;//商品价格
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
	public String getSuk() {
		return suk;
	}
	public void setSuk(String suk) {
		this.suk = suk;
	}
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	@Override
	public String toString() {
		return "Good [id=" + id + ", user_id="
				+ user_id + ", user_name=" + user_name+ ", suk=" + suk
				+ "，quantity=" + quantity + "]";
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public String getGoodname() {
		return goodname;
	}
	public void setGoodname(String goodname) {
		this.goodname = goodname;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	
}
