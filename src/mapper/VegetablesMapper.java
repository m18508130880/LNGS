package mapper;

import java.util.List;

import pojo.custom.VegetablesCustom;
import pojo.queryVo.VegetablesQueryVo;

public interface VegetablesMapper {

	public List<VegetablesCustom> selectList (VegetablesQueryVo vegetablesQueryVo) throws Exception;
	
}
