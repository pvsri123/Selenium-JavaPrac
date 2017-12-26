package selenium;

public class methodOverLoading {

	public static void main(String[] args) {
		
		
		methodOverLoading obj1 = new methodOverLoading();
		
		// compile time binding
		
		obj1.add(20, 10);
		obj1.add(10,20,30);
		obj1.add(10.5,20.5);
		obj1.add(10, 20.5);
		obj1.add(10.5, 20);

	}
	
	// same method name with different number of arguments is called method overloading
	public void add(int a,int b)
	{
		int c = a+b;
		System.out.println("sum of the numbers is "+c);
	}
	public void add(int a, int b, int d)
	{
		int c = a+b+d;
		System.out.println("sum of the numbers is "+c);
	}
	public void add(double a,double b)
	{
		double c = a+b;
		System.out.println("sum of the numbers is "+c);
	}
	
	// same method with different data types, internal type casting and upcasting
	public void add(int a,double b)
	{
		double sum= a+b;
		System.out.println("sum of the numbers is "+sum);
	}
	
	public void add(double a,int b)
	{
		double sum1= a+b;
		System.out.println("sum of the numbers is "+sum1);
	}
}
