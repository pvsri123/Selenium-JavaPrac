package selenium;

import java.util.Scanner;

public class ExceptionHandlingEx02 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter the value:");
		  int b=sc.nextInt();	
		
	try{	
		int a=10;
        int c=a/b;
        System.out.println(c);
	}catch(Exception e)
	{
		System.out.println("dont pass b value as:"+b);
		//e.printStackTrace();//it notifys the exception location
	}
	finally{
		System.out.println("sreenivas");
	}

	}

}
