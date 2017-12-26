package OOPSConcepts;

public class HSBCBank implements USBank, BrazilBank
{
	
// We are achieving multiple inheritance by implementing two interface in a single class
	
// This is called  "Is-a relationship" (Interface with class)
	
	// Methods from Interfaces (USBank) is  compulsory need to be implemented
	//Those methods need to be inherited or overridden in this class
	
	
	// Following three methods are overridden methods from  Interface USBank
	
	public void credit()
	{
		System.out.println("HSBC---credit");
	}

		public void debit()
		{
			System.out.println("HSBC---debit");
		}
		
		public void transferMoney()
		{
			System.out.println("HSBC-Transfer Money");
		}
	
		
		// Following two methods are native methods for HSBC Bank class
		
		public void eductionloan()
		{
			System.out.println("HSBC-Education loan");
		}
		
		public void carloan()
		{
			System.out.println("HSBC-Car loan");
		}
		
		
		// This following method is overridden from Brazil bank interface
		
		public void mutualfunds()
		{
			
			System.out.println("Brazil bank Mutual funds");
			
		}
		
}
