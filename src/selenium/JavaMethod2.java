package selenium;

public class JavaMethod2 {
		
	// create method
	
	// Write method without returning any value

	// a) Syntax for creating a Method (call the method by invoking Object)

	public static void main(String[] args) 
	{
		// classname Object = new classname();
		
		//(call the method by invoking Object)

		
		JavaMethod2 obj = new JavaMethod2();
		
		obj.StudentRank(650);
		
	}
	//non-static method
	public void StudentRank(int marks)
	{
		if(marks>=600)
		{
		System.out.println("Rank A");
		}
		else if(marks>=500)
		{
		System.out.println("Rank B");
				
		}
		else
		{
		System.out.println("Rank C");
		}
			
	}
}
