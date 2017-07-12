package org.fkit.mapper;

import java.sql.Timestamp;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.fkit.domain.User;
import org.fkit.domain.Users;

public interface UserMapper {
	
	/**
	 * 根据登录名和密码查询用户
	 * @param String loginname
	 * @param String password
	 * @return 找到返回User对象，没有找到返回null
	 * */
	@Select("select * from user_info where user_name= #{loginname} and user_pwd= #{password}")
	User findWithLoginnameAndPassword(@Param("loginname")String loginname,
			@Param("password") String password);
	@Insert("insert into user_info (user_name,user_pwd,adress,email,telnumber)values(#{loginname},#{password},#{adress},#{email},#{telnumber})")
	void addUser(@Param("loginname")String loginname,
			@Param("password") String password,
			@Param("adress")String adress,
			@Param("email") String email,
			@Param("telnumber")String telnumber);
	//邮箱发送链接
	@Insert("insert into user_key(user_name,email)values(#{loginname},#{email})")
	void addusers(@Param("loginname")String loginname,
			@Param("email") String email);
	@Select("select * from user_key where user_name= #{user_name}")
	Users findWithUser_name(@Param("user_name")String user_name);
	@Update("update user_key set validatacode=#{validatacode},registerdate=#{registerdate} where user_name=#{user_name}")
	void update(@Param("user_name")String user_name,
			@Param("validatacode")String validatacode,
			@Param("registerdate")Timestamp registerdate);
	@Update("update user_info set user_pwd=#{reset_pwd} where user_name=#{user_name}")
	void  reset_pwd(@Param("reset_pwd")String reset_pwd,
			@Param("user_name")String user_name);
}