package selenium;

public class ConsEx01 {
	
	//-constructor name is same as Class name
	
	// constructor overloading
	// Constructors differs, based on number of arguments
	
	public ConsEx01(int a, int b){
		int c= a*b;
      System.out.println("multiplication of given values is: "+c);
	}
	public ConsEx01(String x, String y){
		String z= x+y;
		System.out.println(z);
	}
	public static void main(String[] args) {
		ConsEx01 ce= new ConsEx01(5,6);
		ConsEx01 cex= new ConsEx01("Mindq","Systems");
	}

}
