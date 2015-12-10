package encryptionBase64;

import java.util.Scanner;

public class Runner extends Encrypt{
	
	public static void main(String args[]) throws Exception{
		String state;
		String key;
		Scanner keyboard = new Scanner(System.in);
		String input = keyboard.nextLine();
		if(input.equals("E")){
			state=keyboard.nextLine();
			key=keyboard.nextLine();
			byte[] keyVal=state.getBytes();
			System.out.println(state);
			System.out.println(encrypt(state,keyVal));
			
		}
		if(input.equals("D")){
			state=keyboard.nextLine();
			key=keyboard.nextLine();
			System.out.println(state);

			byte[] keyVal=state.getBytes();
			System.out.println(decrypt(state,keyVal));
			
		}
	}
	
}
