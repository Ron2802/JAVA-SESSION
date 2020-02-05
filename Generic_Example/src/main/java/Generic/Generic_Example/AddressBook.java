package Generic.Generic_Example;

public class AddressBook {
	private String Add;
	private Long number;
	
	AddressBook(){
		
	}
	public AddressBook(String add, Long number) {
		super();
		Add = add;
		this.number = number;
	}
	@Override
	public String toString() {
		return ", Add=" + Add + ", number=" + number;
	}

}
