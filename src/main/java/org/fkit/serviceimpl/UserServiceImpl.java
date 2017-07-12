package org.fkit.serviceimpl;

import java.sql.Timestamp;

import org.fkit.domain.User;
import org.fkit.domain.Users;
import org.fkit.mapper.UserMapper;
import org.fkit.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * User服务层接口实现类
 * @Service("userService")用于将当前类注释为一个Spring的bean，名为userService
 * */

@Service("userService")
public class UserServiceImpl implements UserService {
	
	/**
	 * 自动注入UserMapper
	 * */
	@Autowired
	private UserMapper userMapper;

	/**
	 * UserService接口login方法实现
	 * @see { UserService }
	 * */
	@Transactional(propagation=Propagation.REQUIRED,isolation=Isolation.DEFAULT)
	@Override
	public User login(String loginname, String password) {
		return userMapper.findWithLoginnameAndPassword(loginname, password);
	}



@Override
	public void register(String loginname,String password,String adress,String email,String telnumber){
		userMapper.addUser(loginname, password, adress, email, telnumber);
}
//邮箱发送连接
@Override
public void addusers(String loginname,String email){
	userMapper.addusers(loginname,email);
}
@Override
public Users findWithUser_name(String user_name){
	return userMapper.findWithUser_name(user_name);
}
@Override
public void update(String user_name,String validatacode,Timestamp registerdate){
	userMapper.update(user_name,validatacode,registerdate);
}
@Override
public void reset_pwd(String user_name,String reset_pwd){
	 userMapper.reset_pwd(user_name, reset_pwd);
}
}