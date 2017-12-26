package serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Account2 implements Serializable{
	
	String username = "Sreenivas";
	transient String pwd = "Anushka";
	transient int pin=1234;
	
	private void writeObject(ObjectOutputStream os) throws IOException
	{
				
		os.defaultWriteObject();   // Meant for default serialization 
		
		String epwd = "123"+pwd;
		int epin=4444+pin;
		os.writeObject(epwd);
		os.writeInt(epin);
	}
	
	private void readObject(ObjectInputStream is) throws ClassNotFoundException, IOException
	{
		
		is.defaultReadObject();    // Meant for default de-serialization
		String epwd = (String)is.readObject();
		
		pwd = epwd.substring(3);
		
		int epin = is.readInt();
		pin = epin-4444;
		
	}
}
public class CustomizedSerializationExample01 {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Account2 a1 = new Account2();
		
		System.out.println(a1.username+"----"+a1.pwd+"---"+a1.pin);
		
		// Serialization
		
		FileOutputStream fos = new FileOutputStream("abc.ser");
		ObjectOutputStream oos= new ObjectOutputStream(fos);
		oos.writeObject(a1);
		
		// De-Serialization
		FileInputStream fis = new FileInputStream("abc.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Account2 a2 = (Account2)ois.readObject();
		
		System.out.println(a2.username+"----"+a2.pwd+"---"+a2.pin);

	}

}
