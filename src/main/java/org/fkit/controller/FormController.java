package org.fkit.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FormController{
	private static Logger logger=LoggerFactory.getLogger(FormController.class);
	@RequestMapping(value="/{formName}")
	 public String loginForm(@PathVariable String formName){
	
		return formName;
	}
}