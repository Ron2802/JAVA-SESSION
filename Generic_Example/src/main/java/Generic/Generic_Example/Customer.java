package Generic.Generic_Example;

public class Customer<AddressBook> {
	private String Name;
	private String Email;
	private String Gender;
	private AddressBook ab;
	
	Customer(){
		
	}
	public Customer(String name, String email, String gender, AddressBook ab) {
	//	super();
		Name = name;
		Email = email;
		Gender = gender;
		this.ab = ab;
	}

	@Override
	public String toString() {
		return "Customer Name=" + Name + ", Email=" + Email + ", Gender=" + Gender + ab;
	}
	
}
