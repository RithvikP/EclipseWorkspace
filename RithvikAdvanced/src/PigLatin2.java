import java.util.Scanner;


public class PigLatin2 {

	public static void main(String[] args) {
		Scanner keyboard =  new Scanner(System.in);
		String input= keyboard.nextLine();

		if(!input.substring(0,1).equals("a")&& !input.substring(0,1).equals("e")&&!input.substring(0,1).equals("i")&&!input.substring(0,1).equals("o")&&!input.substring(0,1).equals("u")){
			System.out.println(input.replaceAll("(?i)\\b([^aeiou]+)(.*)\\b", "$2$1ay"));
		}
		else{
			System.out.println(input.replaceAll("(?i)\\b([aeiou]+)(.*)\\b","$1yay"));

		}
	}


}
