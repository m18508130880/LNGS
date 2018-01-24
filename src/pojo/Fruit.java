package pojo;


/**
 * 商品-水果
 * @author ASUS
 *
 */
public class Fruit {
	
	private int id;
	private String name;
	private String type;
	private float price;
	private float stock;
	private float single;
	private int stockS;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public float getStock() {
		return stock;
	}
	public void setStock(float stock) {
		this.stock = stock;
	}
	public float getSingle() {
		return single;
	}
	public void setSingle(float single) {
		this.single = single;
	}
	public int getStockS() {
		return stockS;
	}
	public void setStockS(int stockS) {
		this.stockS = stockS;
	}

}
