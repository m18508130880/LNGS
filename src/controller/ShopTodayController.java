package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import pojo.custom.ShopTodayCustom;
import service.impl.ShopTodayServiceImpl;

import com.alibaba.fastjson.JSON;

@Controller
@RequestMapping("shopToday")
public class ShopTodayController {
	
	@Autowired
	private ShopTodayServiceImpl shopTodayServiceImpl;
	
	@RequestMapping("Text.action")
	public ModelAndView select() throws Exception {
		
		List<ShopTodayCustom> shopTodayList = shopTodayServiceImpl.selectList(null);
				
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("shopTodayList", JSON.toJSONString(shopTodayList));
		modelAndView.setViewName("index");
		
		System.out.println(shopTodayList.size());
		
		return modelAndView;
	}

}
