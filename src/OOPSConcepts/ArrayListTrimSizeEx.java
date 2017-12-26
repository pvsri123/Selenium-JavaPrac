package OOPSConcepts;

import java.util.ArrayList;

public class ArrayListTrimSizeEx {

	public static void main(String[] args) {
		
		// I have defined the ArrayList of capacity 50. 
		//After adding 10 elements I called trimToSize() method which would have reduced the capacity from 50 to 10 
		//(current size of arraylist).
		
		ArrayList<Integer> arraylist = new ArrayList<Integer>(50);
		    arraylist.add(1);
		    arraylist.add(2);
		    arraylist.add(3);
		    arraylist.add(4);
		    arraylist.add(5);
		    arraylist.add(6);
		    arraylist.add(7);
		    arraylist.add(1);
		    arraylist.add(1);
		    arraylist.add(1);
		    
		    arraylist.trimToSize();
		    
		    System.out.println(arraylist);
	}

}
