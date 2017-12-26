package selenium;

public class ArrayDemo {

	public static void main(String[] args) {
		
		// 20 bytes of memory
		// array declaration
		
		int student_id[] = new int[5];
		
		student_id[0]=89;
		student_id[1]=45;
		student_id[2]=12;
		student_id[3]=890;
		student_id[4]=980;
				
		int sizeofArray= student_id.length;
		System.out.println("Size of arrary is :"+sizeofArray);
		
		for (int i=0;i<sizeofArray;i++)
		{
			System.out.println("student id is:"+student_id[i]);
		}
				
	}

}
