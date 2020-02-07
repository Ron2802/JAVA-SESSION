package Pojo;

public class Client {
	private int id;
	private String Name;
	private String Email;
	public Client() {
		// TODO Auto-generated constructor stub
	}
	public Client(int id, String name, String email) {
	//	super();
		this.id = id;
		Name = name;
		Email = email;
	}
	@Override
	public String toString() {
		return "Client [id=" + id + ", Name=" + Name + ", Email=" + Email + "]";
	}
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
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
	
	
	
	
	

}
