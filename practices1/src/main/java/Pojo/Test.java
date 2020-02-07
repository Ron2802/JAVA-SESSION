package Pojo;

public class Test {
	private int Id;
	private String Name;
	private String Email;
	private int Salary;
	private ClientAddress Add;
	
	/**
	 * @param add the add to set
	 */
	public void setAdd(ClientAddress add) {
		Add = add;
	}

	public Test() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return Id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		Id = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return Name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		Name = name;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return Email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		Email = email;
	}

	/**
	 * @return the salary
	 */
	public int getSalary() {
		return Salary;
	}

	/**
	 * @param salry the salary to set
	 */
	public void setSalary(int salry) {
		Salary = salry;
	}

	@Override
	public String toString() {
		return "Test [Id=" + Id + ", Name=" + Name + ", Email=" + Email + ", Salary=" + Salary + ", Add=" + Add + "]";
	}
	
	
	

}
