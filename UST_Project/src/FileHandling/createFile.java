package FileHandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class createFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		FileWriter  myWriter = new FileWriter("c://temp//newfile.txt");
		myWriter.write("Hello"+"\n\r");
		
		
		myWriter.append("Adding a new line");
		myWriter.flush();
		
	}

}
