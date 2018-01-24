package pojo.queryVo;

import pojo.Fruit;
import pojo.custom.FruitCustom;


/**
 * 商品-水果封装
 * @author ASUS
 *
 */
public class FruitQueryVo {

	private Fruit fruit;
	private FruitCustom fruitCustom;
	
	public Fruit getFruit() {
		return fruit;
	}
	public void setFruit(Fruit fruit) {
		this.fruit = fruit;
	}
	public FruitCustom getFruitCustom() {
		return fruitCustom;
	}
	public void setFruitCustom(FruitCustom fruitCustom) {
		this.fruitCustom = fruitCustom;
	}
}
