package Programs;

import java.util.ArrayList;

import java.util.Scanner;
import Utilities.*;


public class Mathemachine {

	public static void main(String[] args) {
		int t;
		int sum = 0;
		int number = 0;
		int smallest = Integer.MAX_VALUE;
		int biggest = Integer.MIN_VALUE;
		int test = 2;
		int count = 0;
		long product = 1;
		ArrayList<Integer> prime = new ArrayList<Integer>();
		ArrayList<Integer> x = new ArrayList<Integer>();
		Utilities ut = new Utilities();
		
		Scanner times = new Scanner(System.in);
		Scanner keyboard = new Scanner(System.in);
		
		String line;
                
		while(!(line=keyboard.nextLine()).isEmpty()){
                 
                if(ut.isNumber(line)){
                		x.add(Integer.parseInt(line));
                        
                    }
                    else{
                     System.out.println("Enter only integers.");
                    }
               
                    
                }
                    
	
				
		for(int n : x){
			sum = sum + n;
			number++;
			
			if(smallest>n){
				smallest = n;
			}
			
			if(biggest<n){
				biggest = n;
			}
			
			while(test < n){
				//do some stuff with the test variable
				if(n % test == 0){
					count++;
					//System.out.print("Not prime because of ");
					//System.out.println(test);
				}
				
				test = test + 1;
					
				}
				
			
			if(count == 0&&!(n<=1)){
				prime.add(n);
			}
			
		
			count = 0;
			test = 2;
			
			product = product * n;
			
			
		}
		
		
		System.out.println("The sum: " + sum);
		System.out.println("The product: " + product);
		System.out.println("The average: " + sum/number);
		System.out.println("The smallest number: " + smallest);
		System.out.println("The biggest number: " + biggest);
		System.out.println("The prime numbers: " + prime);
	}

}

