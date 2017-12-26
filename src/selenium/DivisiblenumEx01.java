package selenium;

public class DivisiblenumEx01 {

	public static void main(String[] args) {
		
		
		 int integer1;
	        integer1 = 0;
	        boolean divisibleby3 = (integer1 % 3) == 0;
	        boolean divisibleby5 = (integer1 % 5) == 0;

	           for( integer1=0; integer1<1000; integer1++){
	            if(divisibleby3 = true);{
	                System.out.println(integer1 + " can be divided by 3");} 
	            if(divisibleby3 = false);{
	                System.out.println(integer1 + " cannot be divided by 3");}
	            if(divisibleby5 = true);{
	                System.out.println(integer1 + " can be divided by 5");}
	            if(divisibleby5 = false);{
	                System.out.println(integer1 + " cannot be divided by 5");
	            }

	        }

	}

}
