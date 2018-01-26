package selenium;

import java.util.HashMap;

public class HashMapExampleEx01 {

	public static void main(String[] args) {
		// create and populate hash map  
		   HashMap<Integer, String> map = new HashMap<Integer, String>();           
		   map.put(1,"Java");  
		   map.put(2, "Python");  
		   map.put(3, "PHP");  
		   map.put(4, "SQL");
		   map.put(5, "C++");
		   System.out.println("Tutorial in Guru99: "+ map);    
		   // Remove value of key 5  
		   map.remove(5);  
		  System.out.println("Tutorial in Guru99 After Remove: "+ map);
		  
		  		   
		  // containsKey(Object KEY) method will return a Boolean value
		    
			boolean b=    map.containsKey(1);
			System.out.println(b);

			// a method called as keyset() that will return all the keys on the map
			// a method called as values() that will return all the values on the map
			
			System.out.println(map.keySet());
			
			System.out.println(map.values());
			
			
			//How can we check if you actually contain some key-value pairs?
			boolean b1 = map.isEmpty();
			System.out.println(b1);

	}

}
