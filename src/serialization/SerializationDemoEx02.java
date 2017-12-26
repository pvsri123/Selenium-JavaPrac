package serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Animal4
{
	int i =10;
	
	//if  constructor with arguments , then runtime exception will be generated
	// it will be InvalidClassException
	
	Animal4(int i)
	{
		System.out.println("Animal Constructor called");
	}
		
}
class Tiger2 extends Animal4 implements Serializable
{
	
	int j =20;
	Tiger2()
	{
		super(10);
		System.out.println("Tiger Constructor called");
	}
	
}
public class SerializationDemoEx02 {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		

		Tiger2 d1 = new Tiger2();
		d1.i =8888;
		d1.j=9999;
		// Serialization
		
			
				FileOutputStream fos = new FileOutputStream("abc.ser");
				ObjectOutputStream oos = new ObjectOutputStream(fos);
				oos.writeObject(d1);
				System.out.println("De-serialization Started");
				
				// De-Serialization

				FileInputStream fis = new FileInputStream("abc.ser");
				ObjectInputStream ois = new ObjectInputStream(fis);
				
				Tiger2 d2 = (Tiger2)ois.readObject();
		
				
				System.out.println(d2.i+"----"+d2.j);   //10----9999
		
	}

}
