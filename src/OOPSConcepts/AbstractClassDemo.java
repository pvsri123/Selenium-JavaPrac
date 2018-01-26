package OOPSConcepts;

public class AbstractClassDemo {

	public static void main(String[] args) {
		
		//Cannot instantiate the abstract class
		// Cannot create object of abstract class
		
	/*	FirstGenPhone obj = new FirstGenPhone();  
		obj.call();*/
				
		FirstGenPhone obj = new ThirdGenPhone();
				
		obj.call();
		obj.photo();
		obj.video();
		obj.whatsapp();
	}
}

//abstract parent class

	abstract class FirstGenPhone
	{
			
		public  void call()
		{
			System.out.println("Calling.....");
		}
		
		public abstract void photo();  // abstract method
		public  abstract void video();  // abstract method
		public abstract void whatsapp();  // abstract method
	}
	
	abstract  class SecondGenPhone extends FirstGenPhone
	{
		// When extends, it has to use all the abstract methods from the extended class
		
		public void photo()
		{
			System.out.println("Picturing.......");
		}
			
	}
	// Concrete class
	
	 class ThirdGenPhone extends SecondGenPhone    
	{
			public void video()
			{
				System.out.println("Filming video.....");
			}
			
			public void whatsapp()
			{
				
				System.out.println("Mobile communication.....");
			}
	
	}



