package Pr1.Practices1;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import Pojo.Client;
import Pojo.Client2;
import Pojo.ClientAddress;
import Pojo.Test;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext ap = new ClassPathXmlApplicationContext("Beans/Employee.xml");
    	Client c =(Client)ap.getBean("c");
    	Test t = (Test)ap.getBean("T");
    	Client2 Ct =(Client2)ap.getBean("CT");
    	ClientAddress CA =(ClientAddress)ap.getBean("Add");
    	
    	
    	System.out.println(c.toString());
    	System.out.println(t.toString());
    	System.out.println(Ct.toString());
    	System.out.println(CA.toString());
    	
    }
}
