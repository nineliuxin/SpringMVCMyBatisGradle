package org.fkit.service;

import java.sql.Timestamp;

import org.fkit.domain.User;
import org.fkit.domain.Users;

public interface UserService {
	
	/**
	 * 判断用户登录
	 * @param String loginname
	 * @param String password
	 * @return 找到返回User对象，没有找到返回null
	 * */
	User login(String loginname,String password);
	void register(String loginname,String password,String adress,String email,String telnumber);
	//邮箱发送链接
	void addusers(String loginname,String email);
	Users findWithUser_name(String user_name);
	void update(String user_name,String validatacode,Timestamp registerdate);
	void reset_pwd(String user_name,String reset_pwd);
}