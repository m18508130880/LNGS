package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import pojo.custom.FruitCustom;
import service.impl.FruitServiceImpl;

import com.alibaba.fastjson.JSON;

@Controller
@RequestMapping("fruit")
public class FruitController {
	
	@Autowired
	private FruitServiceImpl fruitServiceImpl;
	
	@RequestMapping("-list.action")
	public ModelAndView select() throws Exception {
		
		List<FruitCustom> fruitList = fruitServiceImpl.selectList(null);
				
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("fruitList", JSON.toJSONString(fruitList));
		modelAndView.setViewName("index");
		
		System.out.println(fruitList.size());
		
		return modelAndView;
	}

}
