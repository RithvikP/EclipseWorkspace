package Problems;

import java.util.ArrayList;
import java.util.Scanner;

public class SyntheticDivision {
	public static void main(String args[]){
		Scanner keyboard = new Scanner(System.in);
		
		String numbers="";
		Double num;
		boolean check=false;
		
		ArrayList<Double>coeff=new ArrayList<Double>();
		
		Double last=(double) 0;
		
		String equation = keyboard.nextLine();
		String divisor = keyboard.nextLine();
				
		divisor=divisor.replace(" ", "");
		divisor=divisor.replace("x", "");
		divisor=divisor.replace("+", "");
		num=Double.parseDouble(divisor);

		equation=equation.replace("x", "");
		for(int i=0; i<equation.length();i++){
			if(check){
				check=false;
			}
			else if(i==equation.indexOf("^")){
					check=true;
			}
			else{
				numbers+=equation.substring(i,i+1);
			}
		}
		
		numbers=numbers.replace("^", "");
		numbers=numbers.replace(" ", "");
		numbers=numbers.replace("+", " ");
		
		for(int i=0;i<divisor.length();i++){
			
		}
		
		
		
		//Actually divide now
		for(int i=0;i<numbers.length();i++){
			if(i==0){
				if(equation.indexOf(" ")==1){
				coeff.add(Double.parseDouble(numbers.substring(i,i+1)));
				}
				else{
					
				}
			}
			else{
				coeff.add(last*num+Double.parseDouble(numbers.substring(i,i+1)));
			}
			last = Double.parseDouble(numbers.substring(i,i+1));
		}
		
		for(Double d:coeff){
			System.out.println(d);
		}



		
	}
}
