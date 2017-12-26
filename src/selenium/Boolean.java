package selenium;

public class Boolean {

	public static void main(String[] args) {
		
		boolean status;
		status = true;
		boolean newstatus = false;
		
		System.out.println("My old status was:" +status);
		System.out.println("My new status is:" +newstatus);
		
		char a ='M';
		char b = 'O';
		
		System.out.println("My first character is:" +a);
		System.out.println("My second character is:" +b);
		
		// Java  has Uni-code characters table concept 
		char c = 65;
		System.out.println("My third character is:" +c);
		
		// String Demo startsWith and endsWith
		
		String name = "Selenium WebDriver";
		boolean status1 = name.startsWith("Selenium");
		System.out.println("Status is :" +status1);
		
		String name1 = "Welcome to Selenium WebDriver";
		boolean status2 = name1.endsWith("QTP");
		System.out.println("Status is :" +status2);
		
		// equal and equalIgnore
		String actual = "Welcome to Selenium WebDriver";
		String expected = "welcome to Selenium WebDriver";
		
		boolean status3 = actual.equals(expected);
		System.out.println("Status is "+status3);
		
		String actual1 = "Welcome to Selenium WebDriver";
		String expected1 = "welcome to Selenium WebDriver";
		
		boolean status4 = actual1.equalsIgnoreCase(expected1);
		System.out.println("Status is "+status4);
		
		boolean status5 = actual1.contains(expected1);
		System.out.println("Status is "+status5);
		
		// CharAt method
		
		String Name="Venkata Sreenivas";
		System.out.println(Name.charAt(3));
		
		
		// String split, by creating a string array called tool name
		
		String Fullname = "Selenium-HP-QTP-UFT-RFT";
		// array declaration
		String [] toolname  = Fullname.split("-");
		
		for (int i=0;i<toolname.length;i++)
		{
			
		System.out.println("Value for " + i + " is " +toolname[i]);
								
		}

	}
	
}
	