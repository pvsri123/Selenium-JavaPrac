package selenium;

public class JavaMethod1 {
	
	public static int multiplication(int a, int b, int c)
	{
		
		// create a method with out invoking object
		
		int result = a*b*c;
		return result;
	}

	public static void main(String[] args) 
	{
		
		// call method, with out invoking object
		int x = multiplication(10,20,30);
		System.out.println(x);
		
		// System.out.println(multiplication(10,20,30));
	}

}
