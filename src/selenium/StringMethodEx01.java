package selenium;

public class StringMethodEx01 {

	public static void main(String[] args) {
		String mystr1 ="Sreenivas";
		System.out.println("Number of characters are:"+mystr1.length());
		System.out.println("Print the character at requested place:"+mystr1.charAt(5));
		System.out.println("Print the index of requested character:"+mystr1.indexOf("r"));
		
		String mystr2="Shraddha";
		String mystr3="Sharma";
		System.out.println(mystr2+mystr3);
		System.out.println(mystr2.concat(mystr3));
		System.out.println(mystr1.toLowerCase());
		System.out.println(mystr1.toUpperCase());
		

	}

}
