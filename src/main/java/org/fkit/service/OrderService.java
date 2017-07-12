package org.fkit.service;

import java.sql.Timestamp;
import java.util.List;

import org.fkit.domain.Order;

public interface OrderService {
		void insertUser_order(String user_id,String user_name,String ordernum);
		void insertOrder_info(String ordernum,Timestamp ordertime,String ordergood,
				String address,String telephone,String recipient,String orderstate);
		void updateStock(Integer quantity,String suk);
		void updateState(String ordernum);
		List<Order> showOrder(String user_name);
}
