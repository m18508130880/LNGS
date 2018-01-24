package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import pojo.custom.OderCustom;
import service.impl.OderServiceImpl;

import com.alibaba.fastjson.JSON;

@Controller
@RequestMapping("oder")
public class OderController {
	
	@Autowired
	private OderServiceImpl oderServiceImpl;
	
	@RequestMapping("-list")
	public ModelAndView select() throws Exception {
		
		List<OderCustom> oderList = oderServiceImpl.selectList(null);
				
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("oderList", JSON.toJSONString(oderList));
		modelAndView.setViewName("index");
		
		System.out.println(oderList.size());
		
		return modelAndView;
	}

}
