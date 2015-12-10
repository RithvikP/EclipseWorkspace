
public class ListFun {

	public static void main(String[] args) {
		int[] x = {1,2,4,5,8,10,12,0};
		int sum = 0;
		int number = 0;
		int small = Integer.MAX_VALUE;
		int big = Integer.MIN_VALUE;
		int test = 2;
		int count = 0;
		int Prime = Integer.MIN_VALUE;
		
		
		for (int thing: x){
			System.out.println(thing);
			sum = sum + thing;
			number ++;
			if(small>thing){
				small = thing;
			}
			
			if (big < thing){
				big = thing;
			}
			
			
			while(test < thing){
				//do some stuff with the test variable
				if(thing % test == 0){
					count = count + 1;
					//System.out.print("Not prime because of ");
					//System.out.println(test);
				}
				
				test = test + 1;
				
			}
	
			
			
			if(count == 0 && Prime<thing){
				Prime = thing;
			}
			
			count = 0;
			test = 2;
			
		}
		System.out.print("The sum: ");
		System.out.println(sum);
		
		System.out.print("The average: ");
		System.out.println(sum/number);
		
		System.out.print("The smallest number: ");
		System.out.println(small);
		
		System.out.print("The biggest number: ");
		System.out.println(big);
		
		System.out.print("The biggest prime number: ");
		System.out.println(Prime);

		


	}

}
