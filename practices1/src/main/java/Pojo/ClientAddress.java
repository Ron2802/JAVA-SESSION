package Pojo;

public class ClientAddress {
	
	private int MobileNo;
	/**
	 * @return the mobileNo
	 */
	public int getMobileNo() {
		return MobileNo;
	}

	/**
	 * @return the city
	 */
	public String getCity() {
		return City;
	}

	/**
	 * @return the pincode
	 */
	public int getPincode() {
		return Pincode;
	}

	private String City;
	private int Pincode;
	
	public ClientAddress() {
	}

	@Override
	public String toString() {
		return "ClientAddress [MobileNo=" + MobileNo + ", City=" + City + ", Pincode=" + Pincode + "]";
	}

	/**
	 * @param mobileNo the mobileNo to set
	 */
	public void setMobileNo(int mobileNo) {
		MobileNo = mobileNo;
	}

	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		City = city;
	}

	/**
	 * @param pincode the pincode to set
	 */
	public void setPincode(int pincode) {
		Pincode = pincode;
	}
	
	
	
}
