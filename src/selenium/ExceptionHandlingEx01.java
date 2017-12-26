package selenium;

public class ExceptionHandlingEx01 {

	public static void main(String[] args) {
		
		try {int a = 10;
		int b =0;
		int c =a/b;
		System.out.println("c");
	}
		catch(Exception e){
			System.out.println("b value should not be zero");
		}
		finally{
			System.out.println("It is simple program to understand Exception Handling");
		}

	}

}