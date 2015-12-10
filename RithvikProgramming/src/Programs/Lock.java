package Programs;
import java.util.Scanner;


public class Lock {

	public static void main(String[] args) {
		String code = "pizza";
		int t = 5;
		Scanner lock = new Scanner(System.in);

		while(t>0){

			if(lock.nextLine().equals(code)){
				System.out.println("Unlocked");
			}
			else if(!lock.nextLine().equals(code)){
				t = t-1;
			}
			
		}

	}

		
	

}
