package selenium;

public class ChildClass extends Parent1 {

	
	// Inheritance example
	// method overriding- both child class and parent class has same method
	// to call parent class, we have to use "super"
	
	public  void setUp(){
		
		super.setUp();
		System.out.println("It is initialization script-2");
	}
	public static void main(String[] args) {
		
		ChildClass cc = new ChildClass();
		cc.setUp();
		cc.teardown();
	}

}
