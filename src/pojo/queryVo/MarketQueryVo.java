package pojo.queryVo;

import pojo.Market;
import pojo.custom.MarketCustom;


/**
 * µêÆÌ·â×°
 * @author ASUS
 *
 */
public class MarketQueryVo {

	private Market market;
	private MarketCustom marketCustom;
	
	public Market getMarket() {
		return market;
	}
	public void setMarket(Market market) {
		this.market = market;
	}
	public MarketCustom getMarketCustom() {
		return marketCustom;
	}
	public void setMarketCustom(MarketCustom marketCustom) {
		this.marketCustom = marketCustom;
	}
}
