package service;

import java.util.List;

import pojo.custom.VegetablesCustom;
import pojo.queryVo.VegetablesQueryVo;

public interface VegetablesService {

	public List<VegetablesCustom> selectList(VegetablesQueryVo vegetablesQueryVo) throws Exception;
	
}
