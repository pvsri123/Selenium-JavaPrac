package selenium;

import java.util.Scanner;

public class ConditionalEx01 {

	public static void main(String[] args) {
		
		System.out.println("Enter value for a:");
		Scanner value1 = new Scanner(System.in);
		int a = value1.nextInt();
		System.out.println("Enter value for b:");
		Scanner value2 = new Scanner(System.in);
		int b = value2.nextInt();
		System.out.println("Enter value for c:");
		Scanner value3 = new Scanner(System.in);
		int c = value3.nextInt();
		
		if ((a < b) && (a < c))
		{
		
		System.out.println("smaller value is: "+a);
		}
		else if (b < c){
			System.out.println("smaller value is: "+b);
		}
		else{
			System.out.println("smaller value is :"+c);
		}


	}

}
