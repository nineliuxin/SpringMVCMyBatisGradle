package org.fkit.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.fkit.domain.Cart;

public  interface CartMapper {
	@Insert("insert into user_cart (user_id,user_name,suk,quantity)values(#{user_id},#{user_name},#{suk},#{quantity})")
	void addCart(@Param("user_id")String user_id,
			@Param("user_name") String user_name,
			@Param("suk")String suk,
			@Param("quantity")Integer quantity);
	@Update("update user_cart set quantity=quantity+#{quantity} where user_name=#{user_name} and suk=#{suk}")
	void addCart2(@Param("quantity")Integer quantity,
			@Param("user_name") String user_name,
			@Param("suk")String suk);
	@Update("update user_cart set quantity=#{quantity} where user_name=#{user_name}and suk=#{suk}")
	void addCart3(@Param("quantity")Integer quantity,
			@Param("user_name") String user_name,
			@Param("suk")String suk);
	@Select("select count(user_name) from user_cart where user_name=#{user_name}")
	Integer findWithUser_name(@Param("user_name")String user_name);
	@Select("select * from user_cart where user_name=#{user_name} and suk=#{suk}")
	Cart findWithUser_nameAndSuk(@Param("user_name")String user_name,
			@Param("suk")String suk);
	@Select("select * from user_cart,good_info where user_name=#{user_name} and user_cart.suk=good_info.suk")
	List<Cart> selectWithUser_name(@Param("user_name")String user_name);
	@Delete("delete from user_cart where user_name=#{user_name} and suk=#{suk}")
	void deleteCart(@Param("user_name")String user_name,
			@Param("suk")String suk);
}

