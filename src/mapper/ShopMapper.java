package mapper;

import java.util.List;

import pojo.custom.ShopCustom;
import pojo.queryVo.ShopQueryVo;

public interface ShopMapper {

	public List<ShopCustom> selectList (ShopQueryVo shopQueryVo) throws Exception;
	
}
