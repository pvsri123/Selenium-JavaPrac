package selenium;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		
		System.out.println("Enter any one character from RGB");
		
		// Scanner is to enter a character or integer or string 
		
		Scanner ch = new Scanner(System.in);
		String mycolor = ch.nextLine();
		
		// switch(mycolor.toUpperCase()) 
		// to convert lower case to upper case
		
		switch(mycolor)
		{
		case "R":
			System.out.println("Your choice is Red");
			break;
		case "G":
			System.out.println("Your choice is Green");
			break;
		case "B":
			System.out.println("Your choice is Blue");
			break;
			
		default:
			System.out.println("Invalid entry");
		
		}

	}

}
