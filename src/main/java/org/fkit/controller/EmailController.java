package org.fkit.controller;

import java.sql.Timestamp;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;

import org.fkit.Email.MD5;
import org.fkit.Email.SendMail;
import org.fkit.domain.Users;
import org.fkit.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

@Controller
@SessionAttributes("User_name")
public class EmailController {
	private static Logger logger=LoggerFactory.getLogger(EmailController.class);
	@Autowired
	@Qualifier("userService")
	
	private UserService userService;
	@RequestMapping(value="/findpwd")
	@ResponseBody
	public Map forgetPass(HttpServletRequest request,String user_name){
		Users users=userService.findWithUser_name(user_name);
		Map map=new HashMap<String,String>();
		String msg="";
		if(users==null){
			msg="用户名不存在,你不会忘记用户名了吧?";
			map.put("msg", msg);
			return map;
		}try{
			String secretKey=UUID.randomUUID().toString();
			Timestamp outDate=new Timestamp(System.currentTimeMillis()+30*60*1000);
			long date=outDate.getTime()/1000*1000;
			
			users.setValidatacode(secretKey);
			String validatacode=users.getValidatacode();
			users.setRegisterdate(outDate);
			Timestamp registerdate=users.getRegisterdate();
			userService.update(user_name,validatacode,registerdate);
			String key=users.getUser_name()+"$"+date+"$"+secretKey;
			String digitalSignature=MD5.getMD5(key);
			String emailTitle="bennycake密码找回";
			String path=request.getContextPath();
			String basePath=request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
			
			String resetPassHref=basePath+"reset_password?sid="+digitalSignature+"&user_name="+users.getUser_name();
			
			String emailContent="请勿回复本邮件.点击下面的链接,重设密码<br/><a href="+resetPassHref+"target='_BLANK'>点击我重新设置密码</a>"+
			"<br/>tips:本邮件超过30分钟,链接将会失效，需要重新申请'找回密码'"+key+"\t"+digitalSignature;
			System.out.println(resetPassHref);
			SendMail sendMail=new SendMail();
			sendMail.sendHtmlMail(emailTitle,emailContent,users.getEmail());
			msg="操作成功,已经发送找回密码链接到您邮箱。请在30分钟内重置密码";
			
		}catch(Exception e){
			e.printStackTrace();
			msg="邮箱不存在？未知错误,联系管理员吧。";
			
		}
		map.put("msg", msg);
		return map;
	}
	@RequestMapping(value = "/reset_password",method = RequestMethod.GET)
	     public ModelAndView checkResetLink(String sid,String user_name,ModelAndView model,ModelMap m){
	          
	          
	          String msg = "";
	          m.addAttribute("User_name", user_name);
	          System.out.println(user_name);
	          if(sid.equals("") || user_name.equals("")){
	              msg="链接不完整,请重新生成";
	              model.addObject("msg",msg) ;
	             logger.info(user_name,"找回密码链接失效");
	              return model;
         }
	         Users users = userService.findWithUser_name(user_name);
	         if(users == null){
	             msg = "链接错误,无法找到匹配用户,请重新申请找回密码.";
	             model.addObject("msg",msg) ;
	             logger.info(user_name,"找回密码链接失效");
	             return model;
         }
	         Timestamp outDate = users.getRegisterdate();
	        
	         if(outDate.getTime() <= System.currentTimeMillis()){         //表示已经过期
	             msg = "链接已经过期,请重新申请找回密码.";
	             model.addObject("msg",msg) ;
	             logger.info(user_name,"找回密码链接失效");
	             return model;
	     }
         String key = users.getUser_name()+"$"+outDate.getTime()/1000*1000+"$"+users.getValidatacode(); //数字签名
         
	         String digitalSignature = MD5.getMD5(key);
	         System.out.println(key+"\t"+digitalSignature);
	         if(!digitalSignature.equals(sid)) {
	             msg = "链接不正确,是否已经过期了?重新申请吧";
	             model.addObject("msg",msg) ;
	             logger.info(user_name,"找回密码链接失效");
	             return model;
         }
	         model.setViewName("reset_password");  //返回到修改密码的界面
	         model.addObject("user_name",user_name);
	         return model;
	     }
	@RequestMapping(value="/successreset_pwd")
	public String successreset_pwd(@ModelAttribute("User_name")String user_name,String reset_pwd){
		 userService.reset_pwd(user_name, reset_pwd);
		 logger.info("用户"+user_name+"重置密码成功");
		 return "loginForm";
	}
}
