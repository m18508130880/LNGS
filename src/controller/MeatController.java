package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import pojo.custom.MeatCustom;
import service.impl.MeatServiceImpl;

import com.alibaba.fastjson.JSON;

@Controller
@RequestMapping("meat")
public class MeatController {
	
	@Autowired
	private MeatServiceImpl meatServiceImpl;
	
	@RequestMapping("Text.action")
	public ModelAndView select() throws Exception {
		
		List<MeatCustom> meatList = meatServiceImpl.selectList(null);
				
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("meatList", JSON.toJSONString(meatList));
		modelAndView.setViewName("index");
		
		System.out.println(meatList.size());
		
		return modelAndView;
	}

}
