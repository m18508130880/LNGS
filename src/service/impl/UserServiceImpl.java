package service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import mapper.UserMapper;
import pojo.custom.UserCustom;
import pojo.queryVo.UserQueryVo;
import service.UserService;

@Controller
public class UserServiceImpl implements UserService {

	@Autowired
	private UserMapper userMapper;
	
	@Override
	public List<UserCustom> selectList(UserQueryVo userQueryVo) throws Exception {
		// TODO Auto-generated method stub
		return userMapper.selectList(userQueryVo);  
	}
    
}
