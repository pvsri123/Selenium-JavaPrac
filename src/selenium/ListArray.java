package selenium;

import java.util.ArrayList;

public class ListArray {

	public static void main(String[] args) 
	{

		// List and ArrayList is coming from java.util
		
		// obj1 object is created using ArrayList
		
		ArrayList obj1 = new ArrayList();
		
		obj1.add(7878787);
		obj1.add('M');
		obj1.add("Selenium WebDriver");
		obj1.add(12.34);
		System.out.println(obj1);
		// to get the third value in ArrayList
		
		System.out.println(obj1.get(3));
		
		// To get the size of ArrayList
		
		int mylistSize= obj1.size();
		for (int i=0;i<mylistSize;i++)
		{
			System.out.println("Values from ArrayList:" +obj1.get(i));
			
		}
		
		
	
		
		
		

	}

}
