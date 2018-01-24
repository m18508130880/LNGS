package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import pojo.custom.AddressCustom;
import service.impl.AddressServiceImpl;

import com.alibaba.fastjson.JSON;

@Controller
@RequestMapping("address")
public class AddressController {
	
	@Autowired
	private AddressServiceImpl addressServiceImpl;
	
	@RequestMapping("-list.action")
	public ModelAndView select() throws Exception {
		
		List<AddressCustom> addressList = addressServiceImpl.selectList(null);
				
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("addressList", JSON.toJSONString(addressList));
		modelAndView.setViewName("index");
		
		System.out.println(addressList.size());
		
		return modelAndView;
	}

}
