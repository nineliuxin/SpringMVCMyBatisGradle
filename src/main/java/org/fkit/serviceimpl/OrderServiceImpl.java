package org.fkit.serviceimpl;

import java.sql.Timestamp;
import java.util.List;

import org.fkit.domain.Order;
import org.fkit.mapper.OrderMapper;
import org.fkit.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service("orderService")
@Transactional(propagation=Propagation.REQUIRED)
public class OrderServiceImpl implements OrderService{
	@Autowired
	private OrderMapper orderMapper;
	@Transactional(rollbackFor=Exception.class)
	@Override
	
		public void insertUser_order(String user_id,String user_name,String ordernum){
			orderMapper.insertUser_order(user_id, user_name, ordernum);
		}
	@Transactional(rollbackFor=Exception.class)
	@Override
	public void insertOrder_info(String ordernum,Timestamp ordertime,String ordergood,
			String address,String telephone,String recipient,String orderstate){
		orderMapper.insertOrder_info(ordernum, ordertime, ordergood, address, telephone, recipient, orderstate);
	}
	public void updateStock(Integer quantity,String suk){
		orderMapper.updateStock(quantity, suk);
	}
	public void updateState(String ordernum){
		orderMapper.updateState(ordernum);
	}
	public List<Order> showOrder(String user_name){
		return orderMapper.showOrder(user_name);
	}
}
