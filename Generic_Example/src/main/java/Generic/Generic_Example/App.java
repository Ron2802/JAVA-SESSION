package Generic.Generic_Example;

import java.util.*;

/**
 * Hello world!
 *
 */
public class App 
{
	private static List<Customer> l;
	private static Service S ;
	public <T> void Display(T element) {
		System.out.println(element.getClass().getName()+"__"+element);
	}
    public static void main( String[] args )
    {
    	App p = new App();
    /*  p.Display(10);
      p.Display("Ronak");
      p.Display(20.5);
           
      S = new Service<Integer,Integer>(10,88);
      S= new Service<Number, Double>(10,20.56);
      S.Sum("Ronak","Krupa");
      S.Sum(10,20); */
      p.Init();
    }
    
    public void Init() {
    	l = new ArrayList();
    	l.add(new Customer("Ronak","abc@gmail.com","Male",new AddressBook("Baroda",8141600024L)));
    	System.out.println(l);
    }
    
}
