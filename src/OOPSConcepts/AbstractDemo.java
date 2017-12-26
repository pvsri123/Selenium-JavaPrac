package OOPSConcepts;

public class AbstractDemo {

	public static void main(String[] args) 
	{
		
		Animal  obj = new Dog();
		 obj.sound();
	}
}
	//abstract parent class
	
	abstract class Animal{
	   //abstract method
	   public abstract void sound();
	}
	
	//Dog class extends Animal class
	
	 class Dog extends Animal
	{

	   public void sound()
	   {
		System.out.println("Woof");
	   }
	}
