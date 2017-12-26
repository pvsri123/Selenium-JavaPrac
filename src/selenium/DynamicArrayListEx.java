package selenium;

import java.util.ArrayList;

public class DynamicArrayListEx {

	public static void main(String[] args) {
		ArrayList<String> mycars= new ArrayList<String>();
		//to assign values
		mycars.add("BMW");
		mycars.add("Audi");
		mycars.add("Figo");
		
		//to find length of list
		System.out.println("Length of arraylist is: "+mycars.size());
		
		//to read values 
		
		for (String mycar: mycars){
			System.out.println(mycar);
		}


	}

}
