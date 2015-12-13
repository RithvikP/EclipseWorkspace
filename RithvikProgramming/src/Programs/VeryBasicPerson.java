package Programs;

import java.util.Scanner;

public class VeryBasicPerson {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		String input = keyboard.nextLine();
		
		String[] responses={"fish","Petri dish","Shaddup","Crazy","Stop it","I have work","wat",
				"You're is crazy","waht you mean","stop "};
		
		System.out.println(responses[(int) Math.abs(Math.cos(input.length())*10)]);
		
		
		
		
	}

}