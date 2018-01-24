package pojo.queryVo;

import pojo.Address;
import pojo.custom.AddressCustom;


/**
 * µØÖ··â×°
 * @author ASUS
 *
 */
public class AddressQueryVo {

	private Address address;
	private AddressCustom addressCustom;
	
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public AddressCustom getAddressCustom() {
		return addressCustom;
	}
	public void setAddressCustom(AddressCustom addressCustom) {
		this.addressCustom = addressCustom;
	}
}
