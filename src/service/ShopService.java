package service;

import java.util.List;

import pojo.custom.ShopCustom;
import pojo.queryVo.ShopQueryVo;

public interface ShopService {

	public List<ShopCustom> selectList(ShopQueryVo shopQueryVo) throws Exception;
	
}
