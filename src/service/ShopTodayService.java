package service;

import java.util.List;

import pojo.custom.ShopTodayCustom;
import pojo.queryVo.ShopTodayQueryVo;

public interface ShopTodayService {

	public List<ShopTodayCustom> selectList(ShopTodayQueryVo shopTodayQueryVo) throws Exception;
	
}
