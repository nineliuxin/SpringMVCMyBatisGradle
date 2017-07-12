package org.fkit.serviceimpl;

import org.fkit.mapper.CartMapper;
import org.fkit.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import org.fkit.domain.Cart;
@Service("cartService")
public class CartServiceImpl implements CartService{
	@Autowired
	private CartMapper cartMapper;
	@Transactional(propagation=Propagation.REQUIRED,isolation=Isolation.DEFAULT)
	@Override
	public void Cart(String user_id,String user_name,String suk,Integer quantity){
		cartMapper.addCart(user_id,user_name,suk,quantity);
}
	public void Cart2(Integer quantity,String user_name,String suk){
		cartMapper.addCart2(quantity,user_name,suk);
}
	public void Cart3(Integer quantity,String user_name,String suk){
		cartMapper.addCart3(quantity,user_name,suk);
	}
	public Integer findWithUser_name(String user_name){
		return cartMapper.findWithUser_name(user_name);
	}
	public Cart findWithUser_nameAndSuk(String user_name,String suk){
		return cartMapper.findWithUser_nameAndSuk(user_name, suk);
	}
	public List<Cart> selectWithUser_name(String user_name){
		return cartMapper.selectWithUser_name(user_name);
	}
	public void deleteCart(String user_name,String suk){
		cartMapper.deleteCart(user_name, suk);
	}
}
