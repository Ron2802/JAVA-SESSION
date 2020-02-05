package Pr1.GenericDemo;

import java.util.ArrayList;
import java.util.*;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

public class SetDemo {

	void Demo() {
	
		//Using Collection Interface
		//Collection cc = new Collection(); not possible Collection is Abstract Interface  
		//Collection sc = new Set();not possible Set is Abstract Interface 
		//Collection sc = new SortedSet(); not possible SortedSet is Abstract Interface 
		//Collection sc = new NavigableSet();  not possible NavigableSet is Abstract Interface 
		Collection sc = new HashSet();
		Collection sc1 = new TreeSet();
		// HashSet Methods 
		HashSet sh = new HashSet();
		sh.add(10);
		sh.add("ronak");
		sh.add(52.012);
		sh.remove("Ronak");
		System.out.println(sh.getClass());
		System.out.println(sh.isEmpty());
		System.out.println(sh.size());
		//End HashSet
		
		//TreeSet
		TreeSet ts = new TreeSet();
		ts.add(10);
		ts.add("ronak");
		ts.add(52.012);
		ts.remove("Ronak");
		System.out.println(ts.getClass());
		System.out.println(ts.isEmpty());
		System.out.println(ts.size());
		//End TreeSet
		
		//LinkedHashSet
		LinkedHashSet lsh = new LinkedHashSet();
		lsh.add(10);
		lsh.add("ronak");
		lsh.add(52.012);
		lsh.remove("Ronak");
		System.out.println(lsh.getClass());
		System.out.println(lsh.isEmpty());
		System.out.println(lsh.size());
		//End LinkedHashSet
		
		
		//SortedSet
		SortedSet ss = new TreeSet();
		ss.add(10);
		ss.add(15);
		ss.add(180);
		ss.add(17);
		ss.add(98);
		System.out.println(ss.first());
		System.out.println(ss.last());
		System.out.println(ss.iterator());
		//End SortedSet
		
		
		
	}
}
	
