package Problems;

import java.util.Scanner;

public class YouGuessComputer {
	
	public static void main(String[] args){
		Scanner keyboard = new Scanner(System.in);
		int number = (int) (Math.random()*100);
		int guess=-1;
		while(guess!=number){
			
			guess = keyboard.nextInt();
			if(guess>number)
				System.out.println("Too high.");
			else if(guess<number)
				System.out.println("Too low.");
		}
		
		System.out.println("The number was " + number + ". Good job!");
		
	}
	
}
