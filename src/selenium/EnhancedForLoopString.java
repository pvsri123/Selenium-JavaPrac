package selenium;

public class EnhancedForLoopString {

	public static void main(String[] args) {
		
		int [] num1 = {1,2,3,4,5};
		
		// enhanced for loop to display all elements in array int
		
		for (int tool: num1)
		{
			System.out.println(tool);
		}
		
		
		String myTool = "Selenium"; // String variables
		
		System.out.println(myTool);  // Selenium
		
		// enhanced for loop to display all elements in array string
		
		String [] myTools = {"UFT","Selenium","LoadRunner","RFT"}; //Array of strings
		
		for (String tool:myTools)
		{
			System.out.println(tool);
		}

	}

}
