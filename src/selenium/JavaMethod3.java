package selenium;

public class JavaMethod3 {
	
	//2) Write method without returning any value
	// b) Syntax for creating a Method (call the method, without Object)
	
	public static void StudentRank(int marks)
	{
		if(marks>=650)
		{
			System.out.println("Rank A");
		}
		else if (marks>=550)
		{
			System.out.println("Rank B");
			
		}
		else 
		{
			System.out.println("Rank C");
		}
		
		
	}
	
	public static void main(String[] args) 
	{
		StudentRank(650);
	}

}
