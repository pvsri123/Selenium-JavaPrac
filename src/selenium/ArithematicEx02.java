package selenium;

public class ArithematicEx02 {
	
	//write program to perform different arithmetic operations 
	// without static keyword (i.e. Non-static methods)
	
	public int result;
	public  void Addone(){
		int a= 10;
		int b= 20;
		 result= a+b;
		System.out.println("Addition of given values is: "+result);
	}
	
	public void multiTwo(){
		int x= 10;
		int y= 20;
		result= x*y;
		System.out.println("multiplication of given values is: "+result);
	}
	public static void main(String[] args) {
		//create instance object for class with class name
		ArithematicEx02 AE= new ArithematicEx02();
				
				//to call sub methods
				AE.Addone();
				AE.multiTwo();

	}

}
