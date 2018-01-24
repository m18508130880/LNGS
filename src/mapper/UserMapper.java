package mapper;

import java.util.List;

import pojo.custom.UserCustom;
import pojo.queryVo.UserQueryVo;

public interface UserMapper {

	public List<UserCustom> selectList (UserQueryVo userQueryVo) throws Exception;
	
}
