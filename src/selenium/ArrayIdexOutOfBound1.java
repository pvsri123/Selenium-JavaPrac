package selenium;

public class ArrayIdexOutOfBound1 {

	public static void main(String[] args) {
		
		try{
			int [ ] abc = new int[30];
			abc[30] = 200; 
			System.out.println(abc[30]);
		}
		catch(ArrayIndexOutOfBoundsException e2)
		{
			System.out.println("ArrayIndexOutOfBoundException");
		}

	}

}
