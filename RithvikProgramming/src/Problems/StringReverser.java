package Problems;

import java.util.Scanner;

public class StringReverser {
	
	public static void main(String args[]){
		Scanner keyboard = new Scanner(System.in);
			
		String state= keyboard.nextLine();
		
		System.out.println(new StringBuilder(state).reverse().toString());
		
	}
	
}
