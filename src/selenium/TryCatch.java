package selenium;

public class TryCatch {

	public static void main(String[] args) {
		int a =10;
		int b=0;
		try{
			int result = a/b;
			System.out.println(result);
		}
		catch(ArithmeticException e){
			System.out.println("Division by zero error");
			
		}

	}

}
