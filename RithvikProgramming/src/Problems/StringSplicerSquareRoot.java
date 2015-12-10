package Problems;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;

public class StringSplicerSquareRoot {
	
	public static void main(String args[]){
		int i;
		DecimalFormat df = new DecimalFormat("#");
		df.setRoundingMode(RoundingMode.HALF_UP);
		
		Scanner keyboard = new Scanner(System.in);
		
		String state =keyboard.nextLine();
		
		
		String squareRoot=df.format(Math.sqrt(state.length()));
		int number = Integer.parseInt(squareRoot);
		
		for(i=0; i<state.length()-number;i=i+number){
			System.out.print(state.substring(i,i+number) + " ");
		}
		if(i!=state.length()){
			System.out.print(state.substring(i,state.length()));
		}
		
	}

}
