package OOPSConcepts;

import java.util.ArrayList;

import org.omg.Messaging.SyncScopeHelper;

public class ArrayListInitializationEx {

	public static void main(String[] args) {
		
		ArrayList<String> cities = new ArrayList<String>();
		
		cities.add("Hyderabad");
		cities.add("Miryalaguda");
		cities.add("Delhi");
		cities.add("Warangal");
		
		System.out.println(cities);
		
		cities.add(4,"Banglore");
		
		System.out.println(cities.size());
		System.out.println(cities);
	
		// Printing cities using enhanced for loop
		
		for(String city:cities){
		System.out.println(city);
		}
		
		
		boolean c1=	cities.contains(("Nalgonda"));
				
			System.out.println(c1);
		
			
	}

}
