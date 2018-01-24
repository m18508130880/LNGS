package service;

import java.util.List;

import pojo.custom.OderTodayCustom;
import pojo.queryVo.OderTodayQueryVo;

public interface OderTodayService {

	public List<OderTodayCustom> selectList(OderTodayQueryVo oderTodayQueryVo) throws Exception;
	
}
