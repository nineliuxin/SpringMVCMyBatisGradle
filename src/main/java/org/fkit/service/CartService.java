package org.fkit.service;
import java.util.List;

import org.fkit.domain.Cart;
public interface  CartService {
	void Cart(String user_id,String user_name,String suk,Integer quantity);
	void Cart2(Integer quantity,String user_name,String suk);
	void Cart3(Integer quantity,String user_name,String suk);
	Integer findWithUser_name(String user_name);
	Cart findWithUser_nameAndSuk(String user_name,String suk);
	List<Cart> selectWithUser_name(String user_name);
	void deleteCart(String user_name,String suk);
}
