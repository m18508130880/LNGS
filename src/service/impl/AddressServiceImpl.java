package service.impl;

import java.util.List;

import javax.annotation.Resource;

import mapper.AddressMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import pojo.custom.AddressCustom;
import pojo.queryVo.AddressQueryVo;
import service.AddressService;

@Controller
public class AddressServiceImpl implements AddressService {

	@Autowired
	private AddressMapper addressMapper;
	
	@Override
	public List<AddressCustom> selectList(AddressQueryVo addressQueryVo)
			throws Exception {
		// TODO Auto-generated method stub
		return addressMapper.selectList(addressQueryVo);
	}


    
}
