package serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Animal3
{
	int i =10;
	
	// no-argument constructor
	
	Animal3()
	{
		System.out.println("Animal Constructor called");
	}
		
}
class Tiger1 extends Animal3 implements Serializable
{
	
	int j =20;
	Tiger1()
	{
		
		System.out.println("Tiger Constructor called");
	}
	
}
public class SerializationDemoEx01 {

	public static void main(String[] args) throws IOException, ClassNotFoundException 
	{
		
		Tiger1 d1 = new Tiger1();
		d1.i =8888;
		d1.j=9999;
		// Serialization
		
		// At the time of serialization d.i =888, instance variable becomes zero
		// i value will become i=0
		//JVM will ignore original "i" value from non-serializable parent and save default 
		// values to zero (i=0)
		
		
				FileOutputStream fos = new FileOutputStream("abc.ser");
				ObjectOutputStream oos = new ObjectOutputStream(fos);
				oos.writeObject(d1);
				System.out.println("De-serialization Started");
				
				// De-Serialization

				FileInputStream fis = new FileInputStream("abc.ser");
				ObjectInputStream ois = new ObjectInputStream(fis);
				
				Tiger1 d2 = (Tiger1)ois.readObject();
		// Instance control Flow		
		// At the time of de-serialization,initial instance variable is idenfied and 
		// return i=10 
				
				System.out.println(d2.i+"----"+d2.j);   //10----9999
		
	}

}
