package service;

import java.util.List;

import pojo.custom.OderCustom;
import pojo.queryVo.OderQueryVo;

public interface OderService {

	public List<OderCustom> selectList(OderQueryVo oderQueryVo) throws Exception;
	
}
