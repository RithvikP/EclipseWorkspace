package contest1;


import java.util.ArrayList;
import java.util.Scanner;

public class PrimeNumbersBackwards {



	public static void main(String[] args) {

		boolean runWhile=true;
		int startN=0;
		int N;
		int numberOf=0;
		
		Scanner keyboard=new Scanner(System.in);

		N=keyboard.nextInt();

		int test = 2;
		int count = 0; // count the number of factors
		int[] primeNumbers = new int[N];
		int number=2;


		


		while(runWhile){

			while(test < number/2+1){
				//do some stuff with the test variable
				if(number % test == 0){
					count = count + 1;
				}

				test = test + 1;
			}



			if(count==0) {
				primeNumbers[numberOf]=number;
				startN = startN+1;
				numberOf++;
			}

			test = 2;
			count = 0;
			number=number+1;
			if(startN==N){
				runWhile=false;
			}

		}

		int size=primeNumbers.length;

		while(size>0){
			System.out.print(primeNumbers[size-1]+" ");
			size=size-1;
		}
	}
}

