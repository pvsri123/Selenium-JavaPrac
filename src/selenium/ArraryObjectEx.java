package selenium;

public class ArraryObjectEx {

	public static void main(String[] args) {
	
		// Object Array (Object is a class) is used to store different data type values

		Object obj[] = new Object[6];
		
		obj[0]="Tom";
		obj[1]=25;
		obj[2]=22.3;
		obj[3]="1/1/1999";
		obj[4]="M";
		obj[5]="Hyderabad";
		
		for(int i=0;i<obj.length;i++)
		{
			
			System.out.println(obj[i]);
		}
		
	}

}
