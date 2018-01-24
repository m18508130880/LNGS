package pojo;


/**
 * 商品购物车-具体出货量
 * @author ASUS
 *
 */
public class Shop {

	private int id;
	private int oderId;
	private String type;
	private int foodId;
	private String footType;
	private String footNumber;
	private float total;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getOderId() {
		return oderId;
	}
	public void setOderId(int oderId) {
		this.oderId = oderId;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getFoodId() {
		return foodId;
	}
	public void setFoodId(int foodId) {
		this.foodId = foodId;
	}
	public String getFootType() {
		return footType;
	}
	public void setFootType(String footType) {
		this.footType = footType;
	}
	public String getFootNumber() {
		return footNumber;
	}
	public void setFootNumber(String footNumber) {
		this.footNumber = footNumber;
	}
	public float getTotal() {
		return total;
	}
	public void setTotal(float total) {
		this.total = total;
	}
}
