package mapper;

import java.util.List;

import pojo.custom.MarketCustom;
import pojo.queryVo.MarketQueryVo;

public interface MarketMapper {

	public List<MarketCustom> selectList (MarketQueryVo marketQueryVo) throws Exception;
	
}
