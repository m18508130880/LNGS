package service;

import java.util.List;

import pojo.custom.MarketCustom;
import pojo.queryVo.MarketQueryVo;

public interface MarketService {

	public List<MarketCustom> selectList(MarketQueryVo marketQueryVo) throws Exception;
	
}
