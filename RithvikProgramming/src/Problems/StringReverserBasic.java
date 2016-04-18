package Problems;

import java.util.Scanner;

public class StringReverserBasic {
	public static void main(String args[]){
		Scanner keyboard = new Scanner(System.in);
		String state = keyboard.nextLine();
		
		System.out.println(stringReverse(state));
		
	}
	public static String stringReverse(String state){
		String finalState="";
		for(int i=state.length()-1;i>=0;i--){
			finalState=finalState.concat(state.substring(i,i+1));
		}
		
		return finalState;
	}
}
