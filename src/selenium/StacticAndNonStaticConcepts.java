package selenium;

public class StacticAndNonStaticConcepts {

	
	String name="Sreenivas"; //non-static  global variable
	static int Age=25;  //static global variable
	
	
	public static void main(String[] args) {
		
		//How to call static methods and variables
		
	//	1.Direct calling
	// here sum() is a static method
		
		sum();
		
	// 2. Calling by class name:
		
		StacticAndNonStaticConcepts.sum();
		
		
		System.out.println(Age);
		System.out.println(StacticAndNonStaticConcepts.Age);
		
	// How to call non-static methods and variables
	// here sendMail() is a non-static method	
		
		StacticAndNonStaticConcepts obj = new StacticAndNonStaticConcepts();
		
		obj.sendMail();
		System.out.println(obj.name);
		
		// Can we call/ access the static methods using  by using object reference name
		// Yes, but not a good practice
		
		obj.sum();
		
		}

		// non static method
	public void sendMail(){
		
		System.out.println("Send Mail");
	}
	
	public static void sum(){
		System.out.println("Sum method");
	}
	
}
