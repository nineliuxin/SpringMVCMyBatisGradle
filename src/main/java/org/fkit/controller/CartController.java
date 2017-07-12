package org.fkit.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpSession;


import org.fkit.domain.Cart;
import org.fkit.domain.User;
import org.fkit.service.CartService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
@Controller
@SessionAttributes({"Save","User"})


public class CartController {
	private static Logger logger=LoggerFactory.getLogger(CartController.class);
	@Autowired
	@Qualifier("cartService")
	
	
	private CartService cartService;
	@RequestMapping(value="/successadd")
	
	public String Cart(@ModelAttribute("Save")User user,Integer quantity,String suk,HttpSession session,RedirectAttributes at) throws IOException{
		String user_id=user.getUser_id();
		String user_name=user.getUser_name();
		System.out.println(user_name);
		session.setAttribute("user1", user);
		int cart=cartService.findWithUser_name(user_name);
		Cart cart2=cartService.findWithUser_nameAndSuk(user_name, suk);
		if(cart==0){
		cartService.Cart(user_id, user_name, suk, quantity);
		logger.info("用户"+user_name+"首次添加购物车,商品为"+suk+",数量为"+quantity);
		}else{
			if(cart2==null){
				cartService.Cart(user_id, user_name, suk, quantity);
				logger.info("用户"+user_name+"将"+suk+"添加至购物车,数量为"+quantity);
			}else{
				cartService.Cart2(quantity,user_name, suk);
				logger.info("用户"+user_name+"将"+suk+"添加至购物车,数量为"+quantity);
			}
		}
	    at.addAttribute("suk", suk);
	    at.addAttribute("user_name", user_name);
		return "redirect:page1-1";
		
	}
	@RequestMapping(value="/mycart")
	public String mycart(String user_name,Model model,HttpSession session){
			List<Cart> cartlist=cartService.selectWithUser_name(user_name);
			model.addAttribute("cartlist", cartlist);
			return "mycart";
	}
	@RequestMapping(value="mycartfinish")
	public String mycartfinish(@ModelAttribute("User")User user1,String []suklist,Integer quantity,RedirectAttributes attr){
		int i;
		String user_id=user1.getUser_id();
		String user_name=user1.getUser_name();
		int cart=cartService.findWithUser_name(user_name);
		for(i=0;i<suklist.length;i++){
		String suk=suklist[i];
		Cart cart2=cartService.findWithUser_nameAndSuk(user_name, suk);
		if(cart==0){
		cartService.Cart(user_id, user_name, suk,quantity );
		logger.info("用户"+user_name+"首次添加购物车,商品为"+suk);
		}else{
			if(cart2==null){
				cartService.Cart(user_id, user_name, suk, quantity);
				logger.info("用户"+user_name+"将购物车商品"+suk+"的数量修改为"+quantity);
			}else{
				cartService.Cart3(quantity,user_name, suk);
				logger.info("用户"+user_name+"将购物车商品"+suk+"的数量修改为"+quantity);
			}
		}
		}
		attr.addAttribute("user_name", user_name);
		return "redirect:mycart";
	}
	@RequestMapping(value="mycartdelete")
	public String mycartdelete(@RequestParam("box")String[] boxlist,@ModelAttribute("Save")User user2,RedirectAttributes attr){
		int i;
		String user_id=user2.getUser_id();
		String user_name=user2.getUser_name();
		for(i=0;i<boxlist.length;i++){
			String suk=boxlist[i];
			cartService.deleteCart(user_name, suk);
			logger.info("用户"+user_name+"将购物车中的商品"+suk+"删除");
			
		}
		attr.addAttribute("user_name", user_name);
		return  "redirect:mycart";
	}
}
