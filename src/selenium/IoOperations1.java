package selenium;

import java.io.File;

public class IoOperations1 {

	public static void main(String[] args) {
		
		File fileObject = new File("C:/Users/Sreenivas/Desktop/Energy");
		//fileObject.mkdir();
		boolean a = fileObject.exists();
		
		
		// check folder existence
		
		if (a=true)
		{
			System.out.println("Folder exists");
		}
		else
		{
			System.out.println("Folder does not exists");
		}
		
	}

}
