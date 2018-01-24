package mapper;

import java.util.List;

import pojo.custom.OderCustom;
import pojo.queryVo.OderQueryVo;

public interface OderMapper {

	public List<OderCustom> selectList (OderQueryVo oderQueryVo) throws Exception;
	
}
