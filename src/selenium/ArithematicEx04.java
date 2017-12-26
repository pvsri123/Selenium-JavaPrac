package selenium;

public class ArithematicEx04 {

	
	// write program to perfrom arithemetic operation, whereas while calling
	//submethod we need to pass the test data and also submethod return the value
	//	to main method
	
	public int result;
	
public int Addone(int a, int b){
		
	result= a+b;
	return result;
	}
	
	public int multiTwo(int x, int y){
		
		result= x*y;
		return result;
	}
	public static void main(String[] args) {
		
		//create instance object for class
		
		ArithematicEx04 AE= new ArithematicEx04();
				
				//to call sub methods
				int m=AE.Addone(5, 6);
				int n=AE.multiTwo(9, 5);
				System.out.println("addition of 5 and 6 is: "+m);
				System.out.println("multiplication of 9 with 5 is: "+n);
	}

}
