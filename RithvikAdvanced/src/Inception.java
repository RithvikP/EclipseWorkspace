
public class Inception {
	/*public static int factorial(int n){
		int product = 1;
		for(int current = 1; current<=n;current ++ ){
			product = product * current;


		}
		return product;

	}*/

	/*public static int factorial(int n){
		if(n==1){ //base case
			return 1;
		}
		else{ //recursive case
		return n*factorial(n-1);
		}
	}*/

	public static int fibonacci(int n){
		if(n==1 || n==2){
			return 1;
		}
		else{
			
			return(fibonacci(n-1) + fibonacci(n-2));

		}
	}

}
