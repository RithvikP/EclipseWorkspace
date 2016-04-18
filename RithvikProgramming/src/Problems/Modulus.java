package Problems;

import java.text.NumberFormat;
import java.util.Scanner;

public class Modulus {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println((int)(modulusFunction(keyboard.nextInt(), keyboard.nextInt())));
		
	}
	
	public static int modulusFunction(int dividend, int divisor){
				
				

		int  dividend2=0;
		
		dividend2 = (int) (dividend/divisor);
		
		return dividend-(divisor*dividend2);
	}

}
