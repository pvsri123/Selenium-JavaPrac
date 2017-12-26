package selenium;

public class StrringSplit {

	public static void main(String[] args) {
		// String split, by creating a string array called toolname
		
				String Fullname = "Selenium-HP-QTP-UFT-RFT";
				// array declaration
				String []toolname= Fullname.split("-");
				
				for (int i=0;i<toolname.length;i++)
				{
					
				System.out.println("Value for " +i +" is " +toolname[i]);
				
					if(toolname[i].equalsIgnoreCase("Selenium"))
					{
				
						System.out.println("Test passed");
						break;
					}
						
				}

	}
}
			