package serialization;

import java.io.Externalizable;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class ExternalizableDemo implements Externalizable{
	
	String s;
	int i;
	int j;
	
	public ExternalizableDemo(){
		System.out.println("public no-argument constructor");
	}
	ExternalizableDemo(String s,int i,int j){
		
		this.s=s;
		this.i=i;
		this.j=j;
		
	}
	
	public void writeExternal(ObjectOutput out) throws IOException{
		
		out.writeObject(s);
		out.writeInt(i);
		
	}
	
	public void readExternal(ObjectInput in) throws ClassNotFoundException, IOException{
		
		s= (String)in.readObject();
		i = in.readInt();
		
		
		
	}


	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		ExternalizableDemo E1 = new ExternalizableDemo("Sreenivas",10,20);
		
		
		//Serialization
		
		FileOutputStream fos = new FileOutputStream("abc.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(E1);
		
		//De-serialization
		
		FileInputStream fis = new FileInputStream("abc.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		ExternalizableDemo E2 = (ExternalizableDemo)ois.readObject();
		System.out.println(E2.s+"----"+E2.i+"----"+E2.j);
		
	}

}
