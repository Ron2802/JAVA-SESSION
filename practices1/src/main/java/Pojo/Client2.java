package Pojo;

/**
 * @author chaud
 *
 */
public class Client2 {
	private String Name;
	private String Gender;
	private String Address;
	
	public Client2() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		Name = name;
	}

	/**
	 * @param gender the gender to set
	 */
	public void setGender(String gender) {
		Gender = gender;
	}

	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		Address = address;
	}

	@Override
	public String toString() {
		return "Client2 [Name=" + Name + ", Gender=" + Gender + ", Address=" + Address + "]";
	}
	
	
}
