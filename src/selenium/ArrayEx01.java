package selenium;

public class ArrayEx01 {

	public static void main(String[] args) {
		// Array declaration
		
	 String mycars[] = new String[3];
	 mycars[0]="Audi";
	 mycars[1]="Benz";
	 mycars[2]="BMW";
	 
	 System.out.println(mycars.length);
	
	 // String  mycars [] ={"Audi","Benz","BMW"};
	 // To read values using for loop
	 /*for(int i=0;i<mycars.length;i++)
	 {
		 System.out.println(mycars[i]); 
		 
	 }*/

	 	// using For-Each loop or enhanced for loop
	 
	 for(String mycar:mycars){
		 System.out.println(mycar);
	 }
	}

}
