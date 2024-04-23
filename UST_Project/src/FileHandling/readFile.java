package FileHandling;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class readFile {
	static File myFile;
	static String userdetails[];
	public static void main(String[] args) throws FileNotFoundException {

		try {

			myFile = new File("c://temp//ust.txt");

			System.out.println(myFile.exists());

			Scanner myScanner = new Scanner(myFile);

			while (myScanner.hasNextLine()) {
				String line = myScanner.nextLine();
				// Assignment
				// split the string line and create username and password string and print in
				// console
				
				userdetails = line.split(",");
				
				for(int i=0;i < userdetails.length;i++)
				{
					switch(i)
					{
					case 0:
					{
						System.out.print("Username:" + userdetails[i]);
						break;
					}
					case 1:
					{
						System.out.println(" Password:" + userdetails[i]);
						break;
						
					}
				}
				}
				
			}

		} catch (FileNotFoundException f) {
			System.out.println("File not found");
		} finally {
			myFile = null;
		}
	}

}
