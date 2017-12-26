package selenium;

import java.util.Arrays;

public class JavaMethods4 {

	public static void main(String[] args) {
		int [] array1={1,2,3,4,5};
		System.out.println(array1.length);//5
		
		// toString() -It prints an Array
		// Arrays is a java class
		
		String [] array2={"Selenium","UFT","RFT","LoadRunner"};
		String str = Arrays.toString(array2);
		System.out.println(str);
		
		// contains() - Checks if the Array contains certain value or not?
		
		boolean a = Arrays.asList(array2).contains("UFT");
		boolean b = Arrays.asList(array2).contains("Java");

		System.out.println(a);//true
		System.out.println(b);//false

		
		
	}

}
