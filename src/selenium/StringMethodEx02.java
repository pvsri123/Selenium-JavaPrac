package selenium;

import javax.sound.midi.Synthesizer;

public class StringMethodEx02 {

	public static void main(String[] args) {
		
		String mystr = "MindqSystems";
		String mystr1 = "";
		System.out.println(mystr.startsWith("Mindq"));
		System.out.println(mystr.startsWith("abc"));
		System.out.println(mystr.endsWith("Mindq"));
		System.out.println(mystr.endsWith("ems"));
		System.out.println(mystr.contains("Zeebra"));
		System.out.println(mystr.equals("mindqsystems"));
		System.out.println(mystr.equalsIgnoreCase("mindqsystems"));
		System.out.println(mystr.isEmpty());
		System.out.println(mystr1.isEmpty());
		
		System.out.println(mystr.replace("s","#"));
		
		String mystr2 = " Mindqsystems";
		System.out.println(mystr2.trim());
		
		
		
	}

}
