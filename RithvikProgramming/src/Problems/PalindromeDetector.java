package Problems;

import java.util.Scanner;

public class PalindromeDetector {
	public static void main(String args[]){
		Scanner keyboard = new Scanner(System.in);
		String state = keyboard.nextLine();
		String finalState = new StringBuilder(state).reverse().toString().toLowerCase();
		state=state.toLowerCase();
		if(state.equals(finalState)){
			System.out.println("Palindrome");
		}
		else{
			System.out.println("Not a palindrome");
		}
	}
}
