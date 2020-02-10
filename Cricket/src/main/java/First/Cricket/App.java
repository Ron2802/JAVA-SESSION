package First.Cricket;

import java.util.*;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import Pojo.Student;

public class App 
{
	static ApplicationContext context;
    public static void main( String[] args )
    {
    	context = new ClassPathXmlApplicationContext("Beans/Spring.xml");
    	Student t = (Student) context.getBean("Stud");
    	//System.out.println(t.getRollNo());
    	t.setName("Ronak");
    	System.out.println(t.getName());
    }
}
