package OOPSConcepts;

import java.util.Hashtable;

import com.sun.jna.platform.win32.WinUser.HARDWAREINPUT;

public class HashTableConcepts {

	public static void main(String[] args) {
		
		Hashtable h = new Hashtable();
		
		h.put("A", "Test");
		h.put("B", "Hello");
		h.put("C", "World");
		
		System.out.println(h.size());
		
		h.put(1, 100);
		h.put(2, 200);
		h.put(3, "Tom");
		System.out.println(h.size());
		
		System.out.println(h.get(2));
		System.out.println(h.get("C"));
		System.out.println(h.get(3));
		
		Hashtable<Integer,Integer> h1 = new Hashtable<Integer,Integer>();
		h1.put(1, 100);
		System.out.println(h1.get(1));
		
		
		Hashtable<Integer,String> h2 = new Hashtable<Integer,String>();
		
		h2.put(1, "Sreenivas");
		System.out.println(h2.get(1));
		
	}

}
