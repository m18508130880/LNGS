package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import pojo.custom.MarketCustom;
import service.impl.MarketServiceImpl;

import com.alibaba.fastjson.JSON;

@Controller
@RequestMapping("market")
public class MarketController {
	
	@Autowired
	private MarketServiceImpl marketServiceImpl;
	
	@RequestMapping("-list")
	public ModelAndView select() throws Exception {
		
		List<MarketCustom> marketList = marketServiceImpl.selectList(null);
				
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("marketList", JSON.toJSONString(marketList));
		modelAndView.setViewName("index");
		
		System.out.println(marketList.size());
		
		return modelAndView;
	}

}
