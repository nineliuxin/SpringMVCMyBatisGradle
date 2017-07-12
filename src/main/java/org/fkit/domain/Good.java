package org.fkit.domain;

import java.io.Serializable;

public class Good implements Serializable{
	private Integer id;			// id
	private String suk;	// 商品编号
	private String goodname;	// 商品名
	private Integer stock ;	// 库存
	private Integer sale;//销量
	private  Double price ;		// 价格
	private  String image ;		// 图片
	private  String description ;		// 描述
	public Good(){
		super();
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getSuk() {
		return suk;
	}
	public void setSuk(String suk) {
		this.suk = suk;
	}
	public Integer getStock() {
		return stock;
	}
	public void setStock(Integer stock) {
		this.stock = stock;
	}
	
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public String getGoodname() {
		return goodname;
	}
	public void setGoodname(String goodname) {
		this.goodname = goodname;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	@Override
	public String toString() {
		return "Good [id=" + id + ", suk=" + suk + ", goodname="
				+ goodname + ", stock=" + stock + ",sale=" + sale + ", price=" + price
				+ "，image=" + image + ",description="+description+"]";
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Integer getSale() {
		return sale;
	}
	public void setSale(Integer sale) {
		this.sale = sale;
	}

}