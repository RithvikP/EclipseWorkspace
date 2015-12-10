import java.util.Scanner;


public class Fibonacci {

	public static void main(String[] args) {
		long n = 0;
		long i = 1;
		long e = 0;
		int t = 10;
		int s;

		
		Scanner keyboard = new Scanner(System.in);
		String input = keyboard.nextLine();
		s = Integer.parseInt(input);
		t=s;

				
		
		
		System.out.println(0);
		
		while(t > 0){
			e = n;
			n = n + i;
			i = e;
			System.out.println(n);
			//System.out.println(n/i);
			t = t-1;
		}
		


	}

}
