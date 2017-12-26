package OOPSConcepts;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListIntializationConceptEx03 {

	public static void main(String[] args) {
		
		//Method1:Initialization using Arrays.asList
		
		ArrayList<String> obj = new ArrayList<String>(
					Arrays.asList("Pratap", "Peter", "Harsh"));
				  System.out.println("Elements are:"+obj);
				  
		 ArrayList<Integer> obj1 = new ArrayList<Integer>(
							Arrays.asList(100,200,300,400));
						  System.out.println("Elements are:"+obj1);  
						  
					// Method2:Anonymous inner class method to initialize ArrayList	  
						 
						  ArrayList<String> cities = new ArrayList<String>(){{
							   add("Delhi");
							   add("Agra");
							   add("Chennai");
						  }};
						  System.out.println("Content of Array list cities:"+cities);
						  
					//	  Method3: Normal way of ArrayList initialization
						  
						  ArrayList<String> books = new ArrayList<String>();
						   books.add("Java Book1");
						   books.add("Java Book2");
						   books.add("Java Book3");
						  System.out.println("Books stored in array list are: "+books);
						  
			//	  Method 4: Use Collections.ncopies
						  
		// Collections.ncopies method can be used when we need to initialize the ArrayList with the same value for all of its elements. Syntax:
		//		  count is number of elements and element is the item value			  
						  
				ArrayList<Integer> intlist = new ArrayList<Integer>(Collections.nCopies(10, 5));
				System.out.println("ArrayList items: "+intlist);
	}

}
