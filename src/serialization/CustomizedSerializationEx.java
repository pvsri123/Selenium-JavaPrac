package serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Account1 implements Serializable{
	
	String username = "Sreenivas";
	transient String pwd = "Anushka";
	
	private void writeObject(ObjectOutputStream os) throws IOException
	{
		os.defaultWriteObject();   // Meant for default serialization 
		String epwd = "123"+pwd;
		os.writeObject(epwd);
	}
	
	private void readObject(ObjectInputStream is) throws ClassNotFoundException, IOException
	{
		is.defaultReadObject();    // Meant for default de-serialization
		String epwd = (String)is.readObject();
		
		pwd = epwd.substring(3);
	}
}
public class CustomizedSerializationEx {

	public static void main(String[] args) throws IOException, ClassNotFoundException 
	{
		
		Account1 a1 = new Account1();
		
		System.out.println(a1.username+"----"+a1.pwd);
		
		// Serialization
		
		FileOutputStream fos = new FileOutputStream("abc.ser");
		ObjectOutputStream oos= new ObjectOutputStream(fos);
		oos.writeObject(a1);
		
		// De-Serialization
		
		FileInputStream fis = new FileInputStream("abc.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Account1 a2 = (Account1)ois.readObject();
		
		System.out.println(a2.username+"----"+a2.pwd);
		
	}

}
