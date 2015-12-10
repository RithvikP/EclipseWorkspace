package contest1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Speakability{
	public static void main(String args[]){
		int vowels =0;
		int consonants=0;
		double ratio;
		
		Scanner keyboard = new Scanner(System.in);
		
		String input=keyboard.nextLine();
		
		for(int i=0; i<input.length();i++){
			//test to see if the string has a vowel
			if(input.substring(i,i+1).equals("a")||input.substring(i,i+1).equals("e")||input.substring(i,i+1).equals("i")||
					input.substring(i,i+1).equals("o")||input.substring(i,i+1).equals("u")||input.substring(i,i+1).equals("A")||
					input.substring(i,i+1).equals("E")||input.substring(i,i+1).equals("I")||input.substring(i,i+1).equals("O")||
					input.substring(i,i+1).equals("U")){
				vowels++;
			}
			else{
				consonants++;
			}
		}
		
		
		
		ratio=(double)vowels/consonants;
		
		
		
		
		ratio = (double)Math.round(ratio * Math.pow(10, 2)) / Math.pow(10, 2);
		
		if(ratio-(int) ratio ==0.1||ratio-(int) ratio ==0.2||ratio-(int) ratio ==0.3
				|| ratio-(int) ratio ==0.4||ratio-(int) ratio ==0.5|| ratio-(int) ratio ==0.6
				||ratio-(int) ratio ==0.7|| ratio-(int) ratio ==0.7||ratio-(int) ratio ==0.8||
				ratio-(int) ratio ==0.9){
			
			System.out.println(ratio+"0");
		}
		else if((int)ratio==ratio){
			System.out.println(ratio+".00");
		}
		else{
			System.out.println(ratio);
		}
	

		
		
		
		
		
	}
}
