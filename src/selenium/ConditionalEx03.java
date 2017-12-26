package selenium;

public class ConditionalEx03 {

	public static void main(String[] args) {
		
		int a=400;
		int b=500;
		int c=300;
		
		if((a>b)&(a>c))
		{
			System.out.println("a is greater");
		}
		else if(b>c)
		{
			System.out.println("b is greater");
		}
		else
		{
			System.out.println("c is greater");
		}

	}

}
