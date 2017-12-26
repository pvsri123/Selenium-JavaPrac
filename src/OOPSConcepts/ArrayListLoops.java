package OOPSConcepts;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListLoops {

	public static void main(String[] args) {
		
		ArrayList<Integer> obj = new ArrayList<Integer>();
		
		obj.add(10);
		obj.add(20);
		obj.add(30);
		obj.add(40);
		
		/* For Loop for iterating ArrayList */
		System.out.println("For loop");
		
		for(int counter=0;counter<obj.size();counter++)
		{
			System.out.println(obj.get(counter));
		}
		
		/* Advanced For Loop*/
		
		System.out.println("Advanced For Loop");
		
		for(Integer obj1:obj){
			
			System.out.println(obj1);
			
		}
			
		/* While Loop for iterating ArrayList*/ 		
	      System.out.println("While Loop"); 		
	      int count = 0; 		
	      while (count < obj.size()) {
		 System.out.println(obj.get(count));
	         count++;
	      }
		
	      /*Looping Array List using Iterator*/
	      
	      System.out.println("Iterator");
	      Iterator iter = obj.iterator();
	      while (iter.hasNext()) {
	         System.out.println(iter.next());
	      }
		
	}

}
