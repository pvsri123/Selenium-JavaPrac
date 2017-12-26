package OOPSConcepts;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListSortEx {

	public static void main(String[] args) {
		
		ArrayList<String> ListofCountries = new ArrayList<String>();
		
		ListofCountries.add("India");
		ListofCountries.add("US");
		ListofCountries.add("China");
		ListofCountries.add("Denmark");
		
		/*Unsorted List*/
		System.out.println("Before Sorting:");
		
		for(String list: ListofCountries)
		{
			System.out.println(list);
			
		}
		
		 /* Sort statement*/
		
		   Collections.sort(ListofCountries);

		
		
		/*sorted List*/
		System.out.println("After Sorting:");
		for(String counter: ListofCountries){
			System.out.println(counter);
		}
		
		System.out.println("********************************");
		
		ArrayList<Integer> arraylist = new ArrayList<Integer>();
		   arraylist.add(11);
		   arraylist.add(2);
		   arraylist.add(7);
		   arraylist.add(3);
		   
		   /* ArrayList before the sorting*/
		   System.out.println("Before Sorting:");
		   for(int counter: arraylist){
				System.out.println(counter);
			}

		   /* Sorting of arraylist using Collections.sort*/
		   
		   Collections.sort(arraylist);

		   /* ArrayList after sorting*/
		   System.out.println("After Sorting:");
		   for(int counter: arraylist){
				System.out.println(counter);
			}
		
		
	}

}
