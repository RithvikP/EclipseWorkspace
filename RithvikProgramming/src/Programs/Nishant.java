package Programs;

import java.util.Scanner;

public class Nishant {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		String input = keyboard.nextLine();
		
		String[] responses={"Nish fish","Petri dish","Shaddup","Crazy","Stop it","Webassign","wat",
				"Kaushik is crazy","waht you mean","stop "};
		
		System.out.println(responses[(int) Math.abs(Math.cos(input.length())*10)]);
		
		
		
		
	}

}
