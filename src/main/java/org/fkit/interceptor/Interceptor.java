package org.fkit.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class Interceptor implements HandlerInterceptor {
	private static final String[] IGNORE_URI={"/loginForm","/login"};
	@Override
	public boolean preHandle(HttpServletRequest request,HttpServletResponse response,Object handler)throws Exception{
		HttpSession session=request.getSession(); 
		Object user=session.getAttribute("user");
		if(user==null){
			System.out.println("尚未登陆，跳转到登录页面");
			response.sendRedirect("/SpringMVCMyBatisGradle/loginForm");
			return false;
		}
		return true;
		
		
	}
	@Override
	public void postHandle(HttpServletRequest request,HttpServletResponse response,Object handler,ModelAndView modelAndView)throws Exception{
		System.out.println("postHandle");
	}
	@Override
	public void afterCompletion(HttpServletRequest request,HttpServletResponse response,Object handler,Exception ex){
		System.out.println("afterCompletion");
	}
}
