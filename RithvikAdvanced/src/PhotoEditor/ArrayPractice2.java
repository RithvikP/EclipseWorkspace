package PhotoEditor;

public class ArrayPractice2 {

	public static void main(String[] args) {

		for(int x = 0; x < 1000; x ++){

			if(x % 21 == 0){
				System.out.println("FizzBuzz");
			}

			else if (x%7 == 0){
				System.out.println("Buzz");	
			}

			else if(x%3 == 0){
				System.out.println("Fizz");
			}

			else{
				System.out.println(x);
			}
		}

		//Collatz conjecture
		/*for(int z = 30; z == 1; System.out.println(z)){

		}*/


	}

}
