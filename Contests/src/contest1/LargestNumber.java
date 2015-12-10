package contest1;

import java.util.ArrayList;
import java.util.Scanner;

public class LargestNumber {
	public static void main (String args[]){
		int N;
		int largest=Integer.MIN_VALUE;
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		Scanner keyboard=new Scanner(System.in);
		
		N=keyboard.nextInt();
		
		for(int i=N;i>0;i--){
			list.add(keyboard.nextInt());
		}
		
		for(int j=0;j<list.size();j++){
			if(list.get(j)>largest){
				largest=list.get(j);
			}
		}
		System.out.println(largest);
		
		
		
	}
}
