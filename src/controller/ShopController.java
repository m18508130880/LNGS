package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import pojo.custom.ShopCustom;
import service.impl.ShopServiceImpl;

import com.alibaba.fastjson.JSON;

@Controller
@RequestMapping("shop")
public class ShopController {
	
	@Autowired
	private ShopServiceImpl shopServiceImpl;
	
	@RequestMapping("Text.action")
	public ModelAndView select() throws Exception {
		
		List<ShopCustom> shopList = shopServiceImpl.selectList(null);
				
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("shopList", JSON.toJSONString(shopList));
		modelAndView.setViewName("index");
		
		System.out.println(shopList.size());
		
		return modelAndView;
	}

}
