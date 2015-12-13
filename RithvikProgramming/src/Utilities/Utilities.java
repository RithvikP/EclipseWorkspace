package Utilities;

import java.util.Random;

public class Utilities {
	public static boolean isNumber(String input){
		try{
			Integer.parseInt(input);
		}
		catch(Exception e){
			return false;
		}
		return true;
	}

	public static int[] randomNumber(int maxNumber,int howMany){
		int[] numbers=new int[howMany];
		for(int i=0;i<howMany;i++){
			Random rand=new Random();
			numbers[i]=rand.nextInt(maxNumber+1);
		}
		return numbers;

	}

	public static String stringToBinary(String input){

		byte[] bytes=input.getBytes();
		String output="";
		for(byte b:bytes){

			output+=Integer.toBinaryString(b);
		}

		return output;
	}


}
