package org.fkit.mapper;

import java.sql.Timestamp;
import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.fkit.domain.Order;

public interface OrderMapper {
	@Insert("insert into user_order(user_id,user_name,ordernum)values (#{user_id},#{user_name},#{ordernum})")
	void insertUser_order(@Param("user_id")String user_id,
			@Param("user_name")String user_name,
			@Param("ordernum")String ordernum);
	@Insert("insert into order_info(ordernum,ordertime,ordergood,address,telephone,recipient,orderstate)"
			+ "values(#{ordernum},#{ordertime},#{ordergood},#{address},#{telephone},#{recipient},#{orderstate})")
	void insertOrder_info(@Param("ordernum")String ordernum,
			@Param("ordertime")Timestamp ordertime,
			@Param("ordergood")String ordergood,
			@Param("address")String address,
			@Param("telephone")String telephone,
			@Param("recipient")String recipient,
			@Param("orderstate")String orderstate);
	@Update("update good_info set stock=stock-#{quantity},sale=#{quantity} where suk=#{suk}")
	void updateStock(@Param("quantity")Integer quantity,
			@Param("suk")String suk);
	@Update("update order_info set orderstate='等待发货' where ordernum=#{ordernum}")
	void updateState(@Param("ordernum")String ordernum);
	@Select("select * from user_order,order_info where user_name=#{user_name} and user_order.ordernum=order_info.ordernum")
	List<Order> showOrder(@Param("user_name")String user_name);
}
