package mapper;

import java.util.List;

import pojo.custom.MeatCustom;
import pojo.queryVo.MeatQueryVo;

public interface MeatMapper {

	public List<MeatCustom> selectList (MeatQueryVo meatQueryVo) throws Exception;
	
}
