package org.fkit.test;
import static org.junit.Assert.assertEquals;
import org.fkit.domain.Users;
import org.fkit.service.UserService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;


public class test extends BaseJunitTest {
	
	@Autowired
	private UserService userService;
	@Test
	
	public void testFindWithUser_name()throws Exception{
		String user_name="罗周丽";
		Users user=userService.findWithUser_name(user_name);
		assertEquals("b087d480-8a01-4e1c-a7fe-ccaa22c3dfa8",user.getValidatacode());
		System.out.println(user.getValidatacode());
	}
	@Test
	public void testReset_pwd(){
		String user_name="罗周丽";
		String reset_pwd="123";
		userService.reset_pwd(user_name, reset_pwd);
		
	}
}
