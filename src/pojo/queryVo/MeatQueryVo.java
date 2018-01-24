package pojo.queryVo;

import pojo.Meat;
import pojo.custom.MeatCustom;


/**
 * ÉÌÆ·-Èâ·â×°
 * @author ASUS
 *
 */
public class MeatQueryVo {

	private Meat meat;
	private MeatCustom meatCustom;
	
	public Meat getMeat() {
		return meat;
	}
	public void setMeat(Meat meat) {
		this.meat = meat;
	}
	public MeatCustom getMeatCustom() {
		return meatCustom;
	}
	public void setMeatCustom(MeatCustom meatCustom) {
		this.meatCustom = meatCustom;
	}
}
