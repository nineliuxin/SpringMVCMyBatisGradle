package org.fkit.test;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

public class CartTest extends BaseJunitTest{
	@Autowired
	protected WebApplicationContext wac;
	
	
	protected MockMvc mockMvc;
		@Before
		public void SetUp(){
			mockMvc=MockMvcBuilders.webAppContextSetup(wac).build();
		}
		@Test
		public void testAddCart()throws Exception{
			String  responseString=mockMvc.perform(post("/index")
					.contentType(MediaType.APPLICATION_FORM_URLENCODED)
					.param("user_id","00001")
					.param("user_name","张瑜")
					.param("suk", "10001")
					.param("quantity", "2"))
					.andExpect(status().isOk())
					.andDo(print())
					.andReturn().getResponse().getContentAsString();
			System.out.println(responseString);
		}
		@Test
		public void testMycart()throws Exception{
			String responseString=mockMvc.perform(post("/index")
					.contentType(MediaType.APPLICATION_FORM_URLENCODED)
					.param("user_name", "罗周丽"))
					.andExpect(status().isOk())
					.andDo(print())
					.andReturn().getResponse().getContentAsString();
			System.out.println(responseString);
		}
}

