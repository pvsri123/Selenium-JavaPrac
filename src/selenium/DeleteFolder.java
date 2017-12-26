package selenium;

import java.io.File;

public class DeleteFolder {

	public static void main(String[] args) 
	{
		
		File fileObject = new File("C:/Users/Sreenivas/Desktop/Energy1");
		fileObject.delete();
		
	}

}
