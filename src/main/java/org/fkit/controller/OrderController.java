package org.fkit.controller;

import java.sql.Timestamp;
import java.util.List;
import java.util.Random;

import javax.servlet.http.HttpSession;

import org.fkit.domain.Good;
import org.fkit.domain.Order;
import org.fkit.domain.User;
import org.fkit.service.OrderService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

@Controller
@SessionAttributes({"Savequan","Savegood","Save"})

public class OrderController {
	private static Logger logger=LoggerFactory.getLogger(OrderController.class);
	@Autowired
	@Qualifier("orderService")
	
	private OrderService orderService;
	
	@RequestMapping(value="/pay")
	

	public String addOrder(@ModelAttribute("Savegood")Good good,@ModelAttribute("Savequan")Integer quantity,
			@ModelAttribute("Save")User user,String recipient,String address,String telephone,HttpSession session){
		String user_id=user.getUser_id();
		String user_name=user.getUser_name();
		String suk=good.getSuk();
		String goodname=good.getGoodname();
		String ordergood=goodname+"×"+quantity;
		Timestamp ordertime=new Timestamp(System.currentTimeMillis());
		long totalMilliSeconds=System.currentTimeMillis();
		int a=new Random().nextInt(100)+1;
		String ordernum=totalMilliSeconds+user_id+suk+a;
		String orderstate="待支付";
		session.setAttribute("ordernum", ordernum);
		
		orderService.insertUser_order(user_id, user_name, ordernum);
		
		//String b=null;
		//if(b.equals("1")){
		orderService.insertOrder_info(ordernum, ordertime, ordergood, address, telephone, recipient, orderstate);
		//}
		
		orderService.updateStock(quantity, suk);
		logger.info("用户"+user_name+"下单成功");
		return "pay";
	}
	@RequestMapping(value="/successpay")
	public ModelAndView successpay(String ordernum,ModelAndView mv,@ModelAttribute("Save")User user){
		orderService.updateState(ordernum);
		String user_name=user.getUser_name();
		logger.info("用户"+user_name+"支付成功");
		mv.setView(new RedirectView("./index"));
		 return mv;
	}
	@RequestMapping(value="/myorder")
	public String myorder(String user_name,Model model){
		List<Order> orderlist=orderService.showOrder(user_name);
		model.addAttribute("orderlist", orderlist);
		return "mycart";
	}
	
}
