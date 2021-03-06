package OOPSConcepts;

public class AbstractEx {

	public static void main(String[] args) {
		
		// Un-commenting the following line will cause compiler error as the 
        // line tries to create an instance of abstract class.
        // Base b = new Base();
 
        // We can have references of Base type.
       
		 Base b = new Derived();
		
        b.fun(); 

	}
}
	
	abstract class Base 
	{
	   public abstract void fun();
	}
	class Derived extends Base 
	{
	   public void fun() 
	    { System.out.println("Derived fun() called"); 
	    }
	}
	
	

