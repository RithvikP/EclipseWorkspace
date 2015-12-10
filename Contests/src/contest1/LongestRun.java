package contest1;

import java.util.Scanner;

public class LongestRun {

	public static void main(String args[]){
		String s;
		int countA=0;
		int maxA=0;
		int countB=0;
		int maxB=0;
		
		boolean isMaxA=false;
		boolean isMaxB=false;

		Scanner keyboard=new Scanner(System.in);
		s=keyboard.nextLine();

		for(int i=0;i<s.length();i++){
			if(s.substring(i,i+1).equals("A")){
				if(!isMaxB){
					if(maxB<countB){
					maxB=countB;
					}
					isMaxB=true;
					countB=0;
				}
				isMaxA=false;
				countA++;
			}
			else{
				if(!isMaxA){
					if(maxA<countA){
					maxA=countA;
					}
					isMaxA=true;
					countA=0;
				}
				isMaxB=false;
				countB++;
			}
		}
		
		if(countB>maxB)
			maxB=countB;
		
		if(countA>maxA)
			maxA=countA;
		
		if(maxA>maxB){
			System.out.println(maxA);
		}
		else{
			System.out.println(maxB);
		}
	}
}
