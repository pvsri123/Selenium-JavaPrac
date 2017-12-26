package selenium;

import java.util.HashMap;
import java.util.Map;

public class HashMapEx01 {

	public static void main(String[] args) {
		
		Map<String, String> objMap = new HashMap<String, String>();
	  
		objMap.put("Name", "Suzuki");
	    objMap.put("Power", "220");
	    objMap.put("Type", "2-wheeler");
	    objMap.put("Price", "85000");
	    System.out.println("Elements of the Map:");
	    System.out.println(objMap);
	    
	    
	    // containsKey(Object KEY) method will return a Boolean value
	    
	boolean b=    objMap.containsKey("Name");
	System.out.println(b);

	// a method called as keyset() that will return all the keys on the map
	// a method called as values() that will return all the values on the map
	
	System.out.println(objMap.keySet());
	
	System.out.println(objMap.values());
	
	
	//How can we check if you actually contain some key-value pairs?
	boolean b1 = objMap.isEmpty();
	System.out.println(b1);
	
	}

}
