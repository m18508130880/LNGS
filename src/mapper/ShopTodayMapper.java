package mapper;

import java.util.List;

import pojo.custom.ShopTodayCustom;
import pojo.queryVo.ShopTodayQueryVo;

public interface ShopTodayMapper {

	public List<ShopTodayCustom> selectList (ShopTodayQueryVo shopTodayQueryVo) throws Exception;
	
}
