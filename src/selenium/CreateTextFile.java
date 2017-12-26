package selenium;

import java.io.File;
import java.io.IOException;

public class CreateTextFile {

	public static void main(String[] args) throws IOException {
		
		File fileObject = new File("C:/Users/Sreenivas/Desktop/testfile.txt");
		fileObject.createNewFile();
		//fileObject.delete();

	}

}
