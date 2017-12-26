package selenium;

public class MethodOverloadingEx01 {

	
	
	public static void main(String[] args) {
		
		MethodOverloadingEx01 obj = new MethodOverloadingEx01();
		
		obj.sum();
		obj.sum(10);
		obj.sum(20, 30);
		
	}
	
	// same method name with different number of arguments is called method overloading
	
	// zero input parameter
		public void sum()
		{
			System.out.println("Sum method with zero arguments");
		}
		
		// 1 input parameter
		
		public void sum(int i){  
			System.out.println("Sum method with 1 arguments");
			i=10;
			System.out.println(i);
		}
		
		// 2 input parameters
		
		public void sum(int j, int k){
			
			System.out.println("Sum method with 2 arguments");
			System.out.println(j+k);
					
		}
}
