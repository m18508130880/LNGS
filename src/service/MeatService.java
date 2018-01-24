package service;

import java.util.List;

import pojo.custom.MeatCustom;
import pojo.queryVo.MeatQueryVo;

public interface MeatService {

	public List<MeatCustom> selectList(MeatQueryVo meatQueryVo) throws Exception;
	
}
