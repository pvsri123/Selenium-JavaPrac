package selenium;

public class Sample2 {
	
	
	public int add(int a,int b,int c)
	{
		int result = a+b+c;
		return result;
		
	}

	public static void main(String[] args)
	{
		
		//b) External methods (Calling methods from other classes)
		// create object as following by using external class name Sample1
		
		Sample1 obj1= new Sample1();
		
		int x = obj1.multiply(10,20,30);
		System.out.println(x);
		
		// calling internal method from the same class that is Sample2 here
		// creating object 
		
		Sample2 obj2 = new Sample2();
		int y = obj2.add(10,20,30);
		System.out.println(y);
		
	}

}
