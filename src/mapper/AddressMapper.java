package mapper;

import java.util.List;

import pojo.custom.AddressCustom;
import pojo.queryVo.AddressQueryVo;

public interface AddressMapper {

	public List<AddressCustom> selectList (AddressQueryVo addressQueryVo) throws Exception;
	
}
