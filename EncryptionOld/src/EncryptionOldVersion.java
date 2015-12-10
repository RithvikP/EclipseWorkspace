
import java.util.Scanner;

public class EncryptionOldVersion {

	static String statePartString;
	static String state;
	static String cipherKey;

	public static void main(String[] args) {


		Scanner keyboard = new Scanner(System.in);

		statePartString=keyboard.nextLine();
		cipherKey=keyboard.nextLine();

		readyMainString();

		state=statePartString;

		expandCipher();
		System.out.println(encrypt());

		convertToHexadecimal();

	}

	public static void readyMainString(){
		statePartString=statePartString.replaceAll("0","00110000");
		statePartString=statePartString.replaceAll("1","00110001");
		statePartString=statePartString.replaceAll("2","00110010");
		statePartString=statePartString.replaceAll("3","00110011");
		statePartString=statePartString.replaceAll("4","00110100");
		statePartString=statePartString.replaceAll("5","00110101");
		statePartString=statePartString.replaceAll("6","00110110");
		statePartString=statePartString.replaceAll("7","00110111");
		statePartString=statePartString.replaceAll("8","00111000");
		statePartString=statePartString.replaceAll("9","00111001");
		statePartString=statePartString.replaceAll("A","01000001");
		statePartString=statePartString.replaceAll("B","01000010");
		statePartString=statePartString.replaceAll("C","01000011");
		statePartString=statePartString.replaceAll("D","01000100");
		statePartString=statePartString.replaceAll("E","01000101");
		statePartString=statePartString.replaceAll("F","01000110");
		statePartString=statePartString.replaceAll("G","01000111");
		statePartString=statePartString.replaceAll("H","01001000");
		statePartString=statePartString.replaceAll("I","01001001");
		statePartString=statePartString.replaceAll("J","01001010");
		statePartString=statePartString.replaceAll("K","01001011");
		statePartString=statePartString.replaceAll("L","01001100");
		statePartString=statePartString.replaceAll("M","01001101");
		statePartString=statePartString.replaceAll("N","01001110");
		statePartString=statePartString.replaceAll("O","01001111");
		statePartString=statePartString.replaceAll("P","01010000");
		statePartString=statePartString.replaceAll("Q","01010001");
		statePartString=statePartString.replaceAll("R","01010010");
		statePartString=statePartString.replaceAll("S","01010011");
		statePartString=statePartString.replaceAll("T","01010100");
		statePartString=statePartString.replaceAll("U","01010101");
		statePartString=statePartString.replaceAll("V","01010110");
		statePartString=statePartString.replaceAll("W","01010111");
		statePartString=statePartString.replaceAll("X","01011000");
		statePartString=statePartString.replaceAll("Y","01011001");
		statePartString=statePartString.replaceAll("Z","01011010");
		statePartString=statePartString.replaceAll(" ","00100000");

	}

	public static void expandCipher(){

		String cipherKeyExpandedPart="";
		String startPart=cipherKey.substring(0,4);
		String endPart=cipherKey.substring(124,128);


		cipherKeyExpandedPart=cipherKey.substring(4,60);

		cipherKeyExpandedPart=cipherKeyExpandedPart.replaceAll("0","00110000");
		cipherKeyExpandedPart=cipherKeyExpandedPart.replaceAll("1","00110001");
		cipherKeyExpandedPart=cipherKeyExpandedPart.replaceAll("2","00110010");
		cipherKeyExpandedPart=cipherKeyExpandedPart.replaceAll("3","00110011");
		cipherKeyExpandedPart=cipherKeyExpandedPart.replaceAll("4","00110100");
		cipherKeyExpandedPart=cipherKeyExpandedPart.replaceAll("5","00110101");
		cipherKeyExpandedPart=cipherKeyExpandedPart.replaceAll("6","00110110");
		cipherKeyExpandedPart=cipherKeyExpandedPart.replaceAll("7","00110111");
		cipherKeyExpandedPart=cipherKeyExpandedPart.replaceAll("8","00111000");
		cipherKeyExpandedPart=cipherKeyExpandedPart.replaceAll("9","00111001");
		cipherKeyExpandedPart=cipherKeyExpandedPart.replaceAll("A","01000001");
		cipherKeyExpandedPart=cipherKeyExpandedPart.replaceAll("B","01000010");
		cipherKeyExpandedPart=cipherKeyExpandedPart.replaceAll("C","01000011");
		cipherKeyExpandedPart=cipherKeyExpandedPart.replaceAll("D","01000100");
		cipherKeyExpandedPart=cipherKeyExpandedPart.replaceAll("E","01000101");
		cipherKeyExpandedPart=cipherKeyExpandedPart.replaceAll("F","01000110");
		cipherKeyExpandedPart=cipherKeyExpandedPart.replaceAll("G","01000111");
		cipherKeyExpandedPart=cipherKeyExpandedPart.replaceAll("H","01001000");
		cipherKeyExpandedPart=cipherKeyExpandedPart.replaceAll("I","01001001");
		cipherKeyExpandedPart=cipherKeyExpandedPart.replaceAll("J","01001010");
		cipherKeyExpandedPart=cipherKeyExpandedPart.replaceAll("K","01001011");
		cipherKeyExpandedPart=cipherKeyExpandedPart.replaceAll("L","01001100");
		cipherKeyExpandedPart=cipherKeyExpandedPart.replaceAll("M","01001101");
		cipherKeyExpandedPart=cipherKeyExpandedPart.replaceAll("N","01001110");
		cipherKeyExpandedPart=cipherKeyExpandedPart.replaceAll("O","01001111");
		cipherKeyExpandedPart=cipherKeyExpandedPart.replaceAll("P","01010000");
		cipherKeyExpandedPart=cipherKeyExpandedPart.replaceAll("Q","01010001");
		cipherKeyExpandedPart=cipherKeyExpandedPart.replaceAll("R","01010010");
		cipherKeyExpandedPart=cipherKeyExpandedPart.replaceAll("S","01010011");
		cipherKeyExpandedPart=cipherKeyExpandedPart.replaceAll("T","01010100");
		cipherKeyExpandedPart=cipherKeyExpandedPart.replaceAll("U","01010101");
		cipherKeyExpandedPart=cipherKeyExpandedPart.replaceAll("V","01010110");
		cipherKeyExpandedPart=cipherKeyExpandedPart.replaceAll("W","01010111");
		cipherKeyExpandedPart=cipherKeyExpandedPart.replaceAll("X","01011000");
		cipherKeyExpandedPart=cipherKeyExpandedPart.replaceAll("Y","01011001");
		cipherKeyExpandedPart=cipherKeyExpandedPart.replaceAll("Z","01011010");
		cipherKeyExpandedPart=cipherKeyExpandedPart.replaceAll(" ","00100000");


		cipherKey=startPart+cipherKey+endPart;

	}

	public static String encrypt(){
		String encryptedState=state;



		for(int i=Integer.parseInt(cipherKey.substring(0,1)); i>0; i=i-1){

		}


		return encryptedState;
	}



	public void shiftSideways(){

	}

	public void SwapPlaces(){

	}

	public void switchHexadecimal(){

	}

	public void operateOn(){

	}

	public static void convertToHexadecimal(){

		/*statePartString=statePartString.replaceAll("00110000");
		statePartString=statePartString.replaceAll("00110001");
		statePartString=statePartString.replaceAll("00110010");
		statePartString=statePartString.replaceAll("00110011");
		statePartString=statePartString.replaceAll("00110100");
		statePartString=statePartString.replaceAll("00110101");
		statePartString=statePartString.replaceAll("00110110");
		statePartString=statePartString.replaceAll("00110111");
		statePartString=statePartString.replaceAll("00111000");
		statePartString=statePartString.replaceAll("00111001");
		statePartString=statePartString.replaceAll("01000001");
		statePartString=statePartString.replaceAll("01000010");
		statePartString=statePartString.replaceAll("01000011");
		statePartString=statePartString.replaceAll("01000100");
		statePartString=statePartString.replaceAll("01000101");
		statePartString=statePartString.replaceAll("01000110");
		statePartString=statePartString.replaceAll("01000111");
		statePartString=statePartString.replaceAll("01001000");
		statePartString=statePartString.replaceAll("01001001");
		statePartString=statePartString.replaceAll("01001010");
		statePartString=statePartString.replaceAll("01001011");
		statePartString=statePartString.replaceAll("01001100");
		statePartString=statePartString.replaceAll("01001101");
		statePartString=statePartString.replaceAll("01001110");
		statePartString=statePartString.replaceAll("01001111");
		statePartString=statePartString.replaceAll("01010000");
		statePartString=statePartString.replaceAll("01010001");
		statePartString=statePartString.replaceAll("01010010");
		statePartString=statePartString.replaceAll("01010011");
		statePartString=statePartString.replaceAll("01010100");
		statePartString=statePartString.replaceAll("01010101");
		statePartString=statePartString.replaceAll("01010110");
		statePartString=statePartString.replaceAll("01010111");
		statePartString=statePartString.replaceAll("01011000");
		statePartString=statePartString.replaceAll("01011001");
		statePartString=statePartString.replaceAll("01011010");
		statePartString=statePartString.replaceAll("00100000");*/
	}

}
