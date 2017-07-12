package org.fkit.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.fkit.domain.Good;
import org.fkit.service.GoodService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

@SessionAttributes({"Savequan","Savegood"})
@Controller
public class GoodController {
	private static Logger logger=LoggerFactory.getLogger(GoodController.class);
	@Autowired
	@Qualifier("goodService")
	
	private GoodService goodService;
	@RequestMapping(value="/page1")
	public String page1(String num,Model model){

		List<Good> goods =goodService.show(num);
	
	model.addAttribute("goods", goods);
		
		return "page1";
	}

	@RequestMapping(value="/buy")

	public String main(Integer quantity,String suk,Model model2,HttpSession session,ModelMap m){
		
	Good goods2=goodService.show2(suk);
	session.setAttribute("quantity", quantity);
	model2.addAttribute("goods2",goods2);
	m.addAttribute("Savegood", goods2);
	m.addAttribute("Savequan", quantity);
	return"buy";
}
	@RequestMapping(value="/page1-1")
	public String main1(HttpServletRequest request,String suk,HttpSession session){
		Good goods=goodService.show2(suk);
		session.setAttribute("goods", goods);
		request.setAttribute("suk", suk);
		return "page1-1";
	}
}	