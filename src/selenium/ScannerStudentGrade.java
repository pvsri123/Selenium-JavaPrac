package selenium;

import java.util.Scanner;

public class ScannerStudentGrade {

	public static void main(String[] args) {
		
		System.out.println("Enter student marks");
		
		Scanner marks = new Scanner(System.in);
		int StudentMarks = marks.nextInt();
		
		String Stgrade;
		
		if(StudentMarks>=90)
		{
			Stgrade = "A";
			
		}
		else if(StudentMarks>=80)
		{
			Stgrade = "B";
		}
		
		else if(StudentMarks>=70)
		{
			Stgrade = "C";
		}
		else 
		{
			Stgrade = "D";
		}
		System.out.println("Student marks are:"+StudentMarks);
		System.out.println("Student garde is:"+Stgrade);
	}

}
