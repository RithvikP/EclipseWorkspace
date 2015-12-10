package Problems;

import java.util.ArrayList;
import java.util.Scanner;
import Utilities.*;

public class FunctionAnalyzer {

	static ArrayList<Double> roots= new ArrayList<Double>();
	static String state;
	static boolean continuity=false;

	public static void main(String[] args){
		Scanner keyboard = new Scanner(System.in);
		boolean oneRootPrinted=false;
		System.out.println("Enter a function in standard form");		
		System.out.print("f(x) =");
		state = keyboard.nextLine();

		if(state.contains("x^2")){
			quadratic();
			System.out.print("The roots are ");
			for(double i:roots){
				if(!roots.contains(-0)){
					if(!oneRootPrinted){
						System.out.print(i);
					}
					else{
						System.out.println(" and "+i+".");
					}
					oneRootPrinted=true;
				}
				else{
					System.out.println("The root is 0.");
				}
			}
			System.out.println("This function is continuous");
		}	

	}

	public static void quadratic(){
		double a=0;
		double b=0;
		double c=0;
		boolean caret=false;
		boolean check=false;
		String state2="";
		

		state=state.replaceAll(" ","");
		
		state2=state;
		state="";
		for(int i=0; i<state2.length();i++){
			if(state2.substring(i,i+1).equals("^")){
				caret=true;
				for(int j=0; j<state2.length();j++){
					if(check){
						check=false;
					}
					else if(j==state2.indexOf("^")){
							check=true;
					}
					else{
						state+=state2.substring(j,j+1);
					}
				}
			}
			if(caret==false){
				if(Utilities.isNumber(state2.substring(i,i+1))){
					a =Integer.parseInt(state2.substring(i,i+1));
					state=state.replaceFirst(state2.substring(i,i+1), "");
					i=state2.length();
				}
			}
			
			
		}
		if(a==0){
			a=1;
		}
		state.replaceFirst("2", "");
		System.out.println(state);
		for(int i=0; i<state.length();i++){
			if(Utilities.isNumber(state.substring(i,i+1))){
				b =Integer.parseInt(state.substring(i,i+1));
				state=state.replaceFirst(state.substring(i,i+1), "");
				i=state.length();
			}
		}
		for(int i=0; i<state.length();i++){
			if(Utilities.isNumber(state.substring(i,i+1))){
				c =Integer.parseInt(state.substring(i,i+1));
				i=state.length();
			}
		}

		roots.add((-b+Math.sqrt(Math.pow(b, 2)-(4*a*c)))/2*a);
		roots.add((-b-Math.sqrt(Math.pow(b, 2)-(4*a*c)))/2*a);

	}

}
