package selenium;

public class ArrayEx04 {

	public static void main(String[] args) {
		
		String Weekday[] = new String[7];
				
		Weekday[0]="Sunday";
		Weekday[1]="Monday";
		Weekday[2]="Tuesday";
		Weekday[3]="Wednesday";
		Weekday[4]="Thrusday";
		Weekday[5]="Friday";
		Weekday[6]="Saturday";
		
		int sizeofArray= Weekday.length;
		System.out.println("Size of arrary is :"+sizeofArray);
		
		for (int i=0;i<sizeofArray;i++)
		{
			System.out.println("Today is:"+Weekday[i]);
		}
			
			
		
	}

}
