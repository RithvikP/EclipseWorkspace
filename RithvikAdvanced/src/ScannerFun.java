import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class ScannerFun {

	public static void main(String[] args) {
		//make a scanner
		/*Scanner keyboard = new Scanner(System.in);
		String line = keyboard.nextLine();
		System.out.println(line + " is cool");
		int Number = keyboard.nextInt();*/
		
		
		//Make a scanner to read a file
		File f = new File("Data");
		try {
			Scanner antiscribe = new Scanner(f);
			System.out.println(antiscribe.nextLine());
			System.out.println(antiscribe.nextLine());
			System.out.println(antiscribe.nextLine());
		} catch (FileNotFoundException e) {
			System.out.println("No file.");
			//e.printStackTrace prints out the red text that traces the error
			//e.printStackTrace();
		}
	}

}
