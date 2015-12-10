import java.util.Scanner;


public class PigLatin {

	public static void main(String[] args) {
		int index = 0;
		Scanner keyboard =  new Scanner(System.in);
		String input= keyboard.nextLine();
		String x =("");

		/*while(index<input.length()){

			System.out.print(input.substring(index,index + 1));

			index = index + 2;

		}*/
		

	while(index>=0){

			System.out.print(input.substring(index,index + 1));

			index = index - 1;

		}

		if(!input.substring(0,1).equals("a")&& !input.substring(0,1).equals("e")&&!input.substring(0,1).equals("i")&&!input.substring(0,1).equals("o")&&!input.substring(0,1).equals("u")){
			x = input.substring(0,1);
			input = input.replaceAll("(?i)"+ x,"");
			System.out.println(input + x +"ay");

		}
		else{
			//System.out.println(input.replaceAll("(?i)\\b([aeiou])\\b","$2yay"));
			System.out.println(input + "yay");
		}

	}

}
