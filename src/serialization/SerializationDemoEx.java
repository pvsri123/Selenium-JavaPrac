package serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Animal implements Serializable
{
		int i =10;
		
}
class Tiger extends Animal
{
	int j =20;
}

public class SerializationDemoEx {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		Tiger d1 = new Tiger();
				
		System.out.println(d1.i+"---->"+d1.j);
		
		// Serialization
		FileOutputStream fos = new FileOutputStream("abc.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(d1);
		
		// De-Serialization

			FileInputStream fis = new FileInputStream("abc.ser");
			ObjectInputStream ois = new ObjectInputStream(fis);
			
			Tiger d2 = (Tiger)ois.readObject();
			
			System.out.println(d2.i+"---->"+d2.j);
			
	}

}
