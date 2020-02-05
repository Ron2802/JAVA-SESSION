package Pr1.GenericDemo;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
public class MapDemo {
	
	public void Map() {
		//Map Interface classes
		// Map m = new Map(); Map is Interface Right side only concrete class Allowed
		Map m = new ConcurrentHashMap(); // Serializable interface 
		Map m1 = new HashMap();
		Map m2 = new LinkedHashMap();
		Map m3 = new TreeMap();
		//End Map
		
		
		//ConcurrentHashMap
		ConcurrentHashMap c = new ConcurrentHashMap();
		c.put(1,"Ronak");
		c.put(2,"Vrunda");
		c.put(3,"chirag");
		c.put(4,"Radha");
		c.putIfAbsent(5, "Pankaj");
		c.remove(2);
		c.replace(4, "Krishna");
		// End ConcurrentHashMap
		
		//HashMap
		HashMap hm = new HashMap();
		hm.put(1,"Ronak");
		hm.put(2,"Vrunda");
		hm.put(3,"chirag");
		hm.put(4,"Radha");
		hm.putIfAbsent(5, "Pankaj");
		hm.remove(2);
		hm.replace(4, "Krishna");
		// End HashMap
		
		//LinkedHashMap
		LinkedHashMap lhm = new LinkedHashMap();
		lhm.put(1,"Ronak");
		lhm.put(2,"Vrunda");
		lhm.put(3,"chirag");
		lhm.put(4,"Radha");
		lhm.putIfAbsent(5, "Pankaj");
		lhm.remove(2);
		lhm.replace(4, "Krishna");
		// End LinkedHashMap
		
		
		//TreeMap
		TreeMap tm = new TreeMap();
		tm.put(1,"Ronak");
		tm.put(2,"Vrunda");
		tm.put(3,"chirag");
		tm.put(4,"Radha");
		tm.putIfAbsent(5, "Pankaj");
		tm.remove(2);
		tm.replace(4, "Krishna");
		// End LinkedHashMap

	}

}
