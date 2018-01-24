package mapper;

import java.util.List;

import pojo.custom.FruitCustom;
import pojo.queryVo.FruitQueryVo;

public interface FruitMapper {

	public List<FruitCustom> selectList (FruitQueryVo fruitQueryVo) throws Exception;
	
}
