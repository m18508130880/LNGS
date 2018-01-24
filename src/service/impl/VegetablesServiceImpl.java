package service.impl;

import java.util.List;

import org.springframework.stereotype.Controller;

import pojo.custom.VegetablesCustom;
import pojo.queryVo.VegetablesQueryVo;
import service.VegetablesService;

@Controller
public class VegetablesServiceImpl implements VegetablesService {

	@Override
	public List<VegetablesCustom> selectList(VegetablesQueryVo vegetablesQueryVo)
			throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
    
}
