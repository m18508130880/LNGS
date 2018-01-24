package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.alibaba.fastjson.JSON;

import pojo.custom.UserCustom;
import service.impl.UserServiceImpl;

@Controller
@RequestMapping("user")
public class UserController {
	
	@Autowired
	private UserServiceImpl userServiceImpl;
	
	@RequestMapping("-list.action")
	public ModelAndView select() throws Exception {
		
		List<UserCustom> userList = userServiceImpl.selectList(null);
				
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("userList", JSON.toJSONString(userList));
		modelAndView.setViewName("index");
		
		System.out.println(userList.size());
		
		return modelAndView;
	}

}
