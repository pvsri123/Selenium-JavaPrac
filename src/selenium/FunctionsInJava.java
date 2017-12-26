package selenium;

public class FunctionsInJava {

	public static void main(String[] args) {
		
		FunctionsInJava obj = new FunctionsInJava();
		
		obj.test();
		
		int sum = obj.pqr();
		System.out.println(sum);
		
		String S1 = obj.qa();
		System.out.println(S1);
		
		int div = obj.division(30,10);
		System.out.println(div);
	}

	
	// non-static methods
		
	public void test(){
		
		System.out.println("Test method");
	}
	
	public int pqr(){
		
		int a=10;
		int b=20;
		int c= a+b;
		return c;
		
	}
	
	public String qa(){
		System.out.println("QA method");
		String S= "Selenium";
		return S;
	}
	
	public int division(int x,int y){
		
		System.out.println("Division method");
		int d = x/y;
		return d;
			
	}


}




