package service.impl;

import java.util.List;

import org.springframework.stereotype.Controller;

import pojo.custom.ShopTodayCustom;
import pojo.queryVo.ShopTodayQueryVo;
import service.ShopTodayService;

@Controller
public class ShopTodayServiceImpl implements ShopTodayService {

	@Override
	public List<ShopTodayCustom> selectList(ShopTodayQueryVo shopTodayQueryVo)
			throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
}
