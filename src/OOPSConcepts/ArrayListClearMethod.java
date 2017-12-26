package OOPSConcepts;

import java.util.ArrayList;

public class ArrayListClearMethod {

	public static void main(String[] args) {
	
		ArrayList<String> al1=new ArrayList<String>();
	       al1.add("abc");
	       al1.add("xyz");

	       System.out.println("ArrayList before clear: "+al1);
	       al1.clear();
	       System.out.println("ArrayList after clear: "+al1);

	       ArrayList<String> al2=new ArrayList<String>();
	       al2.add("text 1");
	       al2.add("text 2");

	       System.out.println("ArrayList before removeAll: "+al2);
	       al2.removeAll(al2);
	       System.out.println("ArrayList before removeAll: "+al2); 

	}

}
