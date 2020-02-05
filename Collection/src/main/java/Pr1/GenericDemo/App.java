package Pr1.GenericDemo;

import java.util.*;

public class App 
{
    public static void main( String[] args )
    {
    	
    	// Collection Examples..!!
    	
    	
    	//Using Collection Interface
    	//Collection cc = new Collection(); not possible Collection  is Abstract Interface  
    	//Collection cc = new List();  not possible List is Abstract Interface 
    	Collection c = new ArrayList();
    	Collection c1 = new LinkedList();
    	Collection c2 = new Vector();
    	Collection c3 = new Stack();
    	
    	//Using List Interface
    	//List list = new List();  not possible List is Abstract Interface  
    	List l1 = new ArrayList();
    	List l2 = new LinkedList();
    	List l3 = new Vector();
    	List l4 = new Stack();
    	l1.add(10);
    	
    	// Array List
    	ArrayList al = new ArrayList();
    	al.add(10);
    	al.add("Ronak");
    	al.add(10.5);
    	al.remove(2);
    	al.set(1, "Chaudhary");
    	System.out.println(al.toString());
    	System.out.println(al.get(0));
    	//End ArrayList
    	
    	
    	
    	//LinkList
    	LinkedList ll = new LinkedList();
    	ll.add(10);
    	ll.add("Ronak");
    	ll.add(10.5);
    	ll.remove(2);
    	ll.set(1, "Chaudhary");
    	System.out.println(ll.toString());
    	System.out.println(ll.get(0));
    	//End LinkList
     
    	
    	//Vector
    	Vector v = new Vector();
    	v.add(10);
    	v.add("Ronak");
    	v.add(10.5);
    	v.remove(2);
    	v.set(1, "Chaudhary");
    	System.out.println(v.toString());
    	System.out.println(v.get(0));
    	//End Vector
    	
    	
    	//Stack
    	Stack s = new Stack();
    	s.add(10);
    	s.add("Ronak");
    	s.add(10.5);
    	s.remove(2);
    	s.set(1, "Chaudhary");
    	System.out.println(s.toString());
    	System.out.println(s.get(0));
    	//End Vector
     
        	
    }
    
}
