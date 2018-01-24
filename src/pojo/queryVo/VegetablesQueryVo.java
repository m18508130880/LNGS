package pojo.queryVo;

import pojo.Vegetables;
import pojo.custom.VegetablesCustom;

public class VegetablesQueryVo {

	private Vegetables vegetables;
	private VegetablesCustom vegetablesCustom;
	
	public Vegetables getVegetables() {
		return vegetables;
	}
	public void setVegetables(Vegetables vegetables) {
		this.vegetables = vegetables;
	}
	public VegetablesCustom getVegetablesCustom() {
		return vegetablesCustom;
	}
	public void setVegetablesCustom(VegetablesCustom vegetablesCustom) {
		this.vegetablesCustom = vegetablesCustom;
	}
}
