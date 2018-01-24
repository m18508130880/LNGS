package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import pojo.custom.OderTodayCustom;
import service.impl.OderTodayServiceImpl;

import com.alibaba.fastjson.JSON;

@Controller
@RequestMapping("oderToday")
public class OderTodayController {
	
	@Autowired
	private OderTodayServiceImpl oderTodayServiceImpl;
	
	@RequestMapping("-list")
	public ModelAndView select() throws Exception {
		
		List<OderTodayCustom> oderTodayList = oderTodayServiceImpl.selectList(null);
				
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("oderTodayList", JSON.toJSONString(oderTodayList));
		modelAndView.setViewName("index");
		
		System.out.println(oderTodayList.size());
		
		return modelAndView;
	}

}
