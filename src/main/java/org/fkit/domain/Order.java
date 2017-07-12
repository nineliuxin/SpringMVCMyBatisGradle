package org.fkit.domain;

public class Order {
	private Integer id;			// id
	private String user_id;	// 用户编号
	private String user_name;	// 用户名
	private String ordernum;	// 订单号
	private String ordertime;		// 下单时间
	private String ordergood;		// 下单商品
	private String address;//地址
	private String telephone;//电话
	private String recipient;//收件人
	private String orderstate;// 下单状态
	
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
	public String getOrdernum() {
		return ordernum;
	}
	public void setOrdernum(String ordernum) {
		this.ordernum = ordernum;
	}
	public String getOrdertime() {
		return ordertime;
	}
	public void setOrdertime(String ordertime) {
		this.ordertime = ordertime;
	}
	public String getOrdergood() {
		return ordergood;
	}
	public void setOrdergood(String ordergood) {
		this.ordergood = ordergood;
	}
	public String getOrderstate() {
		return orderstate;
	}
	public void setOrderstate(String orderstate) {
		this.orderstate = orderstate;
	}
	@Override
	public String toString() {
		return "Order [id=" + id + ", user_id=" + user_id + ", user_name="
				+ user_name + ", ordernum=" + ordernum + ", ordertime=" + ordertime
				+ ", ordergood=" + ordergood + ", address=" + address + ","
				+ "telephone=" + telephone + ",recipient=" + recipient + ",orderstate=" + orderstate + "]";
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public String getRecipient() {
		return recipient;
	}
	public void setRecipient(String recipient) {
		this.recipient = recipient;
	}
}
