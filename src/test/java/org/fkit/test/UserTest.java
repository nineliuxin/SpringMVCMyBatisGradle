package org.fkit.test;


import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.*;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;


public class UserTest extends BaseJunitTest{
	@Autowired
	protected WebApplicationContext wac;
	
	
	protected MockMvc mockMvc;
		@Before
		public void SetUp(){
			mockMvc=MockMvcBuilders.webAppContextSetup(wac).build();
		}
		@Test
		public void testLogin()throws Exception{
			String  responseString=mockMvc.perform(post("/loginForm")
					.contentType(MediaType.APPLICATION_FORM_URLENCODED)
					.param("loginname","罗周丽")
					.param("password","luozhouli"))
					.andExpect(status().isOk())
					.andDo(print())
					.andReturn().getResponse().getContentAsString();
			System.out.println(responseString);
		}
		@Test
		public void testRegister()throws Exception{
			String responseString=mockMvc.perform(post("/registerForm")
					.contentType(MediaType.APPLICATION_FORM_URLENCODED)
					.param("loginname", "罗周丽")
					.param("password", "luozhouli")
					.param("adress", "中国矿业大学")
					.param("email", "3034024565@qq.com")
					.param("telnumber", "13270366375"))
					.andExpect(status().isOk())
					.andDo(print())
					.andReturn().getResponse().getContentAsString();
			System.out.println(responseString);
		}
}
