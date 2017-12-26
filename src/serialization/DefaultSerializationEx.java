package serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Account implements Serializable
{
	
	String username = "Sreenivas";
	transient String pwd = "Anushka";
}

public class DefaultSerializationEx {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		Account a1 = new Account();
		
		System.out.println(a1.username+"----"+a1.pwd);
		
		
		// Serialization
		
		FileOutputStream fos = new FileOutputStream("abc.ser");
		ObjectOutputStream oos= new ObjectOutputStream(fos);
		oos.writeObject(a1);
		
		// De-Serialization
		FileInputStream fis = new FileInputStream("abc.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Account a2 = (Account)ois.readObject();
		
		System.out.println(a2.username+"----"+a2.pwd);
	}

}
