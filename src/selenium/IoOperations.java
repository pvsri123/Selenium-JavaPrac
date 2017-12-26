package selenium;

import java.util.Scanner;

public class IoOperations {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in); // System.in is an input stream
		System.out.println("Enter your name");
		String name = scan.next();
		System.out.println("Your name is :"+name);
		
		System.out.println("Enter your city");
		String city = scan.next();
		System.out.println("Your city is:"+city);
		
		System.out.println("Enter a number:");
		int num = scan.nextInt();
		System.out.println("Your number is:"+num);
		
		System.out.println("Enter your mobile number:");
		long mobileno = scan.nextLong();
		System.out.println("Your mobile number is "+mobileno);
		
		System.out.println("Enter a double number:");
		double num2= scan.nextDouble();
		System.out.println("YOur doubel number is"+num2);
		
		
		System.out.println("Enter a character:");
		char ch= scan.next().charAt(0);
		System.out.println("Your character is:"+ch);
		
		System.out.println("Enter a value:");
		boolean val = scan.nextBoolean();
		System.out.println("Your value is "+val);
	}

}
