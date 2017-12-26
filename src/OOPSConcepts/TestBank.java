package OOPSConcepts;

public class TestBank {

	public static void main(String[] args) 
	{
		
		System.out.println("Allowed Minimum balance is :"+USBank.min_bal);
		
		HSBCBank hsbc = new HSBCBank();
		
		
		// Separate methods of class are also called
		
		hsbc.credit();
		hsbc.debit();
		hsbc.transferMoney();
		hsbc.eductionloan();
		hsbc.carloan();
		
		
		// dynamic polymophsim or  compile time polymophsim (bcz methods are overridden)
		// Child class objects can be reference by parent Interface reference variables
		
		USBank usb = new HSBCBank();
				
		usb.credit();
		usb.debit();
		usb.transferMoney();

		// Brazil bank instantiation
		
		BrazilBank bb = new HSBCBank();
		bb.mutualfunds();
	}
	
	
	

}
