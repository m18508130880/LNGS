package service;

import java.util.List;

import pojo.custom.AddressCustom;
import pojo.queryVo.AddressQueryVo;

public interface AddressService {

	public List<AddressCustom> selectList(AddressQueryVo addressQueryVo) throws Exception;
	
}
