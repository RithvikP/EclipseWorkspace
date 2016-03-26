package Problems;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class CharacterSelector {
	
	public static void main(String args[]){
		Scanner keyboard = new Scanner(System.in);
		
		String state = keyboard.nextLine();
		char[] chars = state.toCharArray();
		
		
		Arrays.sort(chars);
		String finalState=new String(chars);
		
		
		Set<Character> charSet = new LinkedHashSet<Character>();
		for (char c : chars) {
		    charSet.add(c);
		}

		StringBuilder sb = new StringBuilder();
		for (Character character : charSet) {
		    sb.append(character);
		}
		
		
		finalState=sb.toString();
		
		System.out.println(finalState);
		
		
		
	}
	
}
