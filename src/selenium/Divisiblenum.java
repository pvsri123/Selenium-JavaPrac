package selenium;

public class Divisiblenum {

	public static void main(String[] args) {
		
		// Program to find the numbers divisible by both 3 and 5
		
		for(int i=1;i<=100;i++)
		{
			if((i%3==0) && (i%5==0))
				System.out.println(i);
		}
		
	}
		
}