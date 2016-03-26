import java.util.Scanner;

public class DataCompression {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		String state=keyboard.nextLine();
		String lastCharacter=state.substring(0,1);
		int count=1;
		String finalState="";
		
		for(int i=1;i<state.length();i++){
			if(state.substring(i,i+1).equals(lastCharacter)){
				count++;
			}
			else{
				finalState=finalState.concat(lastCharacter);
				finalState=finalState.concat(Integer.toString(count));
				
				lastCharacter=state.substring(i,i+1);
				count=1;
				
			}
		}
		finalState=finalState.concat(lastCharacter);
		finalState=finalState.concat(Integer.toString(count));
		
		System.out.print(finalState);

	}

}
