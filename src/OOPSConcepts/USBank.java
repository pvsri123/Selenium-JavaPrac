package OOPSConcepts;

public interface USBank {

	int min_bal=100;  // Static in nature
	
	// We cannot define method body in interfaces same as in abstract class
	// We can just define the method prototype
	
	public void credit();
	public void debit();
	public void transferMoney();
	
	//only method declaration
	// no method body- only method body
	// In interface we can declare variables. Variables are default static in nature
	//no static method in Interfaces
	// no main method in Interfaces
	//We cannot create object of interface
	//Interface is abstract in nature
	
	
	
}
