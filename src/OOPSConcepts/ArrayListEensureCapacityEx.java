package OOPSConcepts;

import java.util.ArrayList;

public class ArrayListEensureCapacityEx {

	public static void main(String[] args) {
		// ArrayList internally implements growable dynamic array 
		// which means it can increase and decrease  its size automatically.
		// If we try to add an element to a already full ArrayList then it automatically 
		//re-sized internally to accommodate the new element
		//however sometimes its not a good approach.
		
		// ArrayList with Capacity 4
	      ArrayList<String> al = new ArrayList<String>(4);
	      //Added 4 elements
	      al.add("Hi");
	      al.add("Hello");
	      al.add("Bye");
	      al.add("GM");

	      //Increase capacity to 5
	      al.ensureCapacity(55);

	      al.add("GE");
	      
	      System.out.println(al);
	      // let us print all the elements available in list
	      for (String temp: al) {
	            System.out.println(temp);
	      }
		
		
	}

}
