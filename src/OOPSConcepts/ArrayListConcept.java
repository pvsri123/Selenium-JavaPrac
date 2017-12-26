package OOPSConcepts;

import java.util.ArrayList;

public class ArrayListConcept {

	public static void main(String[] args) {
		
		ArrayList ar = new ArrayList();
		
		ar.add(100);
		ar.add(200);
		ar.add(300);
		
		System.out.println(ar.size());
		
		ar.add(400);
		ar.add(500);
		
		ar.add(600);
		ar.add(700);
		ar.add(800);
		
		System.out.println(ar.size());
	
		// get index number
		System.out.println(ar.get(3));
		
		ar.set(7, 750);
		System.out.println(ar.get(7));
		

	      // display the array list
	      System.out.println("Contents of ar: " + ar);
	}
}
