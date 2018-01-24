package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import pojo.custom.VegetablesCustom;
import service.impl.VegetablesServiceImpl;

import com.alibaba.fastjson.JSON;

@Controller
@RequestMapping("vegetables")
public class VegetablesController {
	
	@Autowired
	private VegetablesServiceImpl vegetablesServiceImpl;
	
	@RequestMapping("-list")
	public ModelAndView select() throws Exception {
		
		List<VegetablesCustom> vegetablesList = vegetablesServiceImpl.selectList(null);
				
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("vegetablesList", JSON.toJSONString(vegetablesList));
		modelAndView.setViewName("index");
		
		System.out.println(vegetablesList.size());
		
		return modelAndView;
	}

}
