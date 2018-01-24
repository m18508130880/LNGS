package test;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.ModelAndView;

import pojo.custom.UserCustom;
import pojo.queryVo.UserQueryVo;

import com.alibaba.fastjson.JSON;

import service.impl.UserServiceImpl;

public class TestUserMapper {

	//@Autowired
	private UserServiceImpl userServiceImpl;
	
	@Test
	public void testUser() throws Exception{
		userServiceImpl = new UserServiceImpl();
		List<UserCustom> userList = userServiceImpl.selectList(new UserQueryVo());
		
		//ModelAndView modelAndView = new ModelAndView();
		//modelAndView.addObject("userList", JSON.toJSONString(userList));
		String json = JSON.toJSONString(userList);
		System.out.println(userList.size()+"["+json+"]");
	}
	
}
