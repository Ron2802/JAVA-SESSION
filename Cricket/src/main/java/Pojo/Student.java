package Pojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Student {
	private int RollNo;
	private String Name;
	private int Age;
	private String Gender;
	@Autowired
	@Qualifier("T")
	private Teacher t;
	@Autowired
	@Qualifier("T1")
	private Teacher t1;
	
	/**
	 * @return the t
	 */
	public Teacher getT() {
		return t;
	}


	public Student() {
		// TODO Auto-generated constructor stub
		System.out.println(t==t1);
	}

	/**
	 * @return the rollNo
	 */
	public int getRollNo() {
		return RollNo;
	}

	/**
	 * @param rollNo the rollNo to set
	 */
	public void setRollNo(int rollNo) {
		RollNo = rollNo;
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
	//@Autowired
	public void setName(String name) {
		Name = name;
	}

	/**
	 * @return the age
	 */
	public int getAge() {
		return Age;
	}

	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		Age = age;
	}

	/**
	 * @return the gender
	 */
	public String getGender() {
		return Gender;
	}

	/**
	 * @param gender the gender to set
	 */
	public void setGender(String gender) {
		Gender = gender;
	}
	
	

}
