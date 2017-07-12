package org.fkit.controller;

import javax.servlet.http.HttpSession;

import org.fkit.domain.User;
import org.fkit.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;




@Controller
@SessionAttributes({"Save","User"})
public class UserController {
	
	private static Logger logger=LoggerFactory.getLogger(UserController.class);
	/**
	 * 自动注入UserService
	 * */
	@Autowired
	@Qualifier("userService")
	
	private UserService userService;
	@RequestMapping(value="/register")
	public String register(
		String loginname,String password,String adress,String email,String telnumber,
		 Model model,
		 HttpSession session){
		userService.register(loginname, password, adress, email, telnumber);
		userService.addusers(loginname,email);
		return "loginForm";
	}

	/**
	 * 处理/login请求
	 * */
	
	@RequestMapping(value="/login", method=RequestMethod.POST)
	 public ModelAndView login(
			 String loginname,String password,
			 ModelAndView mv,
			 HttpSession session,ModelMap model){
		// 根据登录名和密码查找用户，判断用户登录
		User user = userService.login(loginname, password);
		
		
		if(user != null){
			// 登录成功，将user对象设置到HttpSession作用范围域
			session.setAttribute("user", user);
			model.addAttribute("Save", user);
			model.addAttribute("User", user);
			logger.info("用户"+loginname+"登陆成功");
			// 转发到main请求
			mv.setView(new RedirectView("./index"));
		}else{
			// 登录失败，设置失败提示信息，并跳转到登录页面
			logger.info("用户"+loginname+"登陆失败");
			mv.addObject("message", "登录名或密码错误，请重新输入!");
			mv.setViewName("loginForm");
		}
		return mv;
	}
	
	
}