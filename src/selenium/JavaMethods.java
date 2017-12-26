package selenium;

public class JavaMethods {
	
	
	//User defined Method
	public int multiply(int a, int b, int c)
	{
		int result = a * b * c;
		return result;
	}

	public static void main(String[] args)
	{
		//Create Object
		//When creating object we have to use class name as following
		// invoking object
		
		JavaMethods abc = new JavaMethods();

		//Call Method
		int x = abc.multiply(10, 20, 30);
		System.out.println(x);
		    
		// System.out.println(abc.multiply(10, 20, 30));

			
	}

}
