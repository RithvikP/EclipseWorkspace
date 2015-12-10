
public class PrimeNumber {

	public static void main(String[] args) {
		int n = 2; // use scanner for input
		int test = 2;
		int count = 0; // count the number of factors
		int total = 0;
		int number = 0;
		
		while(n<1000000){
		
		while(test < n){
			//do some stuff with the test variable
			if(n % test == 0){
				count = count + 1;
				//System.out.print("Not prime because of ");
				//System.out.println(test);
			}
			
			test = test + 1;
		}
		if (count > 0){
			System.out.print(n);
			System.out.println(" is not prime");
		}
		else {
			System.out.println("Prime.");
			total = total + n;
			number = number+1;
		}
		n = n+1;
		test = 2;
		count = 0;
		}
		
		System.out.print("The average is ");
		System.out.println(total/number);

	}

}
