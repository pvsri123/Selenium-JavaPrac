package serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Dog1 implements Serializable 
{
	Cat c = new Cat();
}

class Cat implements Serializable 
{
	Rat r = new Rat();
}

class Rat implements Serializable 
{
	int i =10;
	int j=20;
}

public class ObjectGraphEx {
	
	
	public static void main(String[] args) throws IOException, ClassNotFoundException 
	{
		Dog1 d1 = new Dog1();
		
		FileOutputStream fos = new FileOutputStream("abc.ser");
		ObjectOutputStream oos =  new ObjectOutputStream(fos);
		oos.writeObject(d1);
		
		
		FileInputStream fis = new FileInputStream("abc.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Dog1 d2 = (Dog1)ois.readObject();
		System.out.println(d2.c.r.i);
		System.out.println(d2.c.r.j);
	}

}
