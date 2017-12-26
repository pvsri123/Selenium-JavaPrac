package selenium;

public class ArithematicEx03 {

public int result;
	
	public void Addone(int a, int b){
		
		result= a+b;
		System.out.println("Addition of given values is: "+result);
	}
	
	public void multiTwo(int x, int y){
		
		result= x*y;
		System.out.println("multiplication of given values is: "+result);
	}

	
	public static void main(String[] args) {
		
		//create instance object for class
		ArithematicEx03  AE= new ArithematicEx03 ();
				
				//to call sub methods
				AE.Addone(5, 6);
				AE.multiTwo(9, 5);
	}

}
