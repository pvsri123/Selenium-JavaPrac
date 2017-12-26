package OOPSConcepts;

public class TestCar {

	public static void main(String[] args) {
		
		// Method overriding- When same method is present both in parent calss and
		// as well as in child class with same name and same number of arguments
		// is called "method overriding"
		
		// Static or Compile time polymorphism
		BMW b= new BMW();
		b.Start();
		b.theftSafety();
		b.Stop();
		b.refuel();
		 b.engine();
		
		System.out.println("**************");
		
		// Create  object and object reference of Car class
		
		Car c = new Car();
		c.Start();
		c.Stop();
		c.refuel();
		System.out.println("**************");
		
		// Create just object of BMW
		
		// 	child class can be referenced by parent class reference variable
		// this is called dynamic or run time polymorphism
		
		// Top casting
		
		Car c1 = new BMW();
		
		c1.Start();
		c1.Stop();
		c1.refuel();
		
		// Down casting
		
	//	BMW b1 = (BMW) new Car(); //class casting exception
		
	}

}
