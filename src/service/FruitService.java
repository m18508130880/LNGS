package service;

import java.util.List;

import pojo.custom.FruitCustom;
import pojo.queryVo.FruitQueryVo;

public interface FruitService {

	public List<FruitCustom> selectList(FruitQueryVo fruitQueryVo) throws Exception;
	
}
