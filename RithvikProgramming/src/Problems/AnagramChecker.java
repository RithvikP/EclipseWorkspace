package Problems;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class AnagramChecker {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner keyboard = new Scanner(System.in);	
		if(isAnagram(keyboard.nextLine())){
			System.out.println("Anagram");
		}
	}
	
	public static boolean isAnagram(String input) throws FileNotFoundException{
		File f = new File("/Users/Rithvik/Downloads/Words.txt");
		Scanner sc = new Scanner(f);
		
		while(sc.hasNextLine()){
			
			boolean anagram=true;
			String s = sc.nextLine();
			for(int i=0;i<s.length();i++){
				if(input.contains(s.substring(i,i+1))){
					input=input.replaceFirst(s.substring(i,i+1), "");

				}
				else{
					anagram=false;
				}
			}
			if(anagram){
				return true;
			}
		}
		return false;
			
		
	}

}
