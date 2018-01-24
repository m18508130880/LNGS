package service.impl;

import java.util.List;

import org.springframework.stereotype.Controller;

import pojo.custom.FruitCustom;
import pojo.queryVo.FruitQueryVo;
import service.FruitService;

@Controller
public class FruitServiceImpl implements FruitService {

	@Override
	public List<FruitCustom> selectList(FruitQueryVo fruitQueryVo)
			throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

    
}
