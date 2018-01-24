package mapper;

import java.util.List;

import pojo.custom.OderTodayCustom;
import pojo.queryVo.OderTodayQueryVo;

public interface OderTodayMapper {

	public List<OderTodayCustom> selectList (OderTodayQueryVo oderTodayQueryVo) throws Exception;
	
}
