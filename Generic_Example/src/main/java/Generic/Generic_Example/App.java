package Generic.Generic_Example;

import java.util.*;

/**
 * Hello world!
 *
 */
public class App 
{
	private static List<Customer> l = new ArrayList();
	private static Service S ;
	private static Scanner scInt = new Scanner(System.in);
	private static Scanner scStr = new Scanner(System.in);
	
	
	/*public <T> void Display(T element) {
		System.out.println(element.getClass().getName()+"__"+element);
	}*/
	
	
    public static void main( String[] args )
    {
    	App p = new App();
    	int n;
    	System.out.println("Enter How many records Inserted:");
    	n = scInt.nextInt();
    	do {
    		System.out.println("Enter Your Name:");
    		String name = scStr.nextLine();
    		System.out.println("Enter Your Email:");
    		String email = scStr.nextLine();
    		System.out.println("Enter Your Gender:");
    		String gender = scStr.nextLine();
    		System.out.println("Enter Your City:");
    		String city = scStr.nextLine();
    		System.out.println("Enter Your Mobile Number:");
    		Long number = scInt.nextLong();
    		p.Init(name,email,gender,city,number);
    		n--;
    	}while(n>0);
    	p.Display();
    /* p.Display(10);
      p.Display("Ronak");
      p.Display(20.5);
           
      S = new Service<Integer,Integer>(10,88);
      S= new Service<Number, Double>(10,20.56);
      S.Sum("Ronak","Krupa");
      S.Sum(10,20); */
    
    }
    
    public void Init(String name,String email,String gender,String city,Long number) {
    	l.add(new Customer(name,email,gender,new AddressBook(city,number)));
    }
    public void Display() {
    	System.out.println("List Of Person");
    	for(Customer c : l)
    		System.out.println(c);
    }
    
}
