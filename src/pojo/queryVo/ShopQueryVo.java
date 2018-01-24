package pojo.queryVo;

import pojo.Shop;
import pojo.custom.ShopCustom;


/**
 * 出货量封装
 * @author ASUS
 *
 */
public class ShopQueryVo {

	private Shop shop;
	private ShopCustom shopCustom;
	
	public Shop getShop() {
		return shop;
	}
	public void setShop(Shop shop) {
		this.shop = shop;
	}
	public ShopCustom getShopCustom() {
		return shopCustom;
	}
	public void setShopCustom(ShopCustom shopCustom) {
		this.shopCustom = shopCustom;
	}
}
