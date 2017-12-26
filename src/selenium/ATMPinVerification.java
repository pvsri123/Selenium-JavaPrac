package selenium;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ATMPinVerification {

	static int atmPin = 1234;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		 int noOfAttempt = 0,userPin;
	     
	     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	     System.out.print("Please enter your ATM pin: ");
	     
	     userPin = Integer.parseInt(br.readLine());
	     noOfAttempt++;
	     
	     while ((userPin!=atmPin)&&(noOfAttempt<3)) {
	      System.out.println("Sorry you have entered incorrect ATM pin. Please try again: ");
	      userPin = Integer.parseInt(br.readLine());
	       noOfAttempt++;
	  }
	     
	     if(userPin==atmPin){
	      System.out.println("Congrats.. You have entered correct pin.");
	     }
	     else
	     {
	      System.out.println("Your ATM card has been blocked. since you have entered incorrect pin more than 3 times..");
	     }
	 }
}


