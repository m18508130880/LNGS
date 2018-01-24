package service;

import java.util.List;

import pojo.custom.UserCustom;
import pojo.queryVo.UserQueryVo;

public interface UserService {

	public List<UserCustom> selectList(UserQueryVo userQueryVo) throws Exception;
	
}
