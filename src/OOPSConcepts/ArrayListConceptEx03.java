package OOPSConcepts;

import java.util.ArrayList;

public class ArrayListConceptEx03 {

	public static void main(String[] args) {
		// In this example we are adding all the elements of an arraylist 
		//to another arraylist by using addAll() method

		// ArrayList1 of String type
        ArrayList<String> al = new ArrayList<String>();
        al.add("Hi");
        al.add("hello");
        al.add("String");
        al.add("Test");
        System.out.println("ArrayList1 before addAll:"+al);

        //ArrayList2 of String Type
        ArrayList<String> al2 = new ArrayList<String>();
        al2.add("Text1");
        al2.add("Text2");
        al2.add("Text3");
        al2.add("Text4");

        //Adding ArrayList2 into ArrayList1
        al.addAll(al2);
        System.out.println("ArrayList1 after addAll:"+al);
		
	}

}
