package selenium;

import java.util.Scanner;

public class ConversionToInt {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter two numbers:");
		
		String S1 = scan.nextLine();
		String S2= scan.nextLine();
		
		int a = Integer.parseInt(S1);
		int b = Integer.parseInt(S2);
		System.out.println(a + b);
		scan.close();
	}
	
}
