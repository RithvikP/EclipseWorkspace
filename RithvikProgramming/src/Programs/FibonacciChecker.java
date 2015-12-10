package Programs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import Utilities.*;

public class FibonacciChecker {

	public static void main(String args[]){
		int max= Integer.MIN_VALUE;
		Scanner keyboard = new Scanner(System.in);

		int x=0;
		int y=1;
		int z;
		int times=keyboard.nextInt();
		String k;

		Utilities ut = new Utilities();
		
		System.out.println("Please input "+times+" numbers");
		ArrayList<Integer> list = new ArrayList<Integer>();


		ArrayList<Integer> fibList= new ArrayList<Integer>();

		for(int i=times; i>=0; i--){
				k=keyboard.nextLine();
				if(ut.isNumber(k)){
					list.add(Integer.parseInt(k));
				}
		}

		for(int i=0; i<list.size(); i++){
			if(max<list.get(i)){
				max=list.get(i);
			}
		}

		for(int i=0;i<=max; i++){

			for(int j=0; j<list.size(); j++){
				if(x+y==list.get(j)){
					fibList.add(list.get(j));
				}
			}
			
			z=y;
			y=x+y;
			x=z;

		}
		Collections.sort(fibList);
		
		for(int i=0;i<fibList.size(); i++){
			if(i<fibList.size()-1&&fibList.get(i)==fibList.get(i+1)){
				fibList.remove(i);
			}
		}

		for(int i=0;i<fibList.size();i++){
			if(i<fibList.size()-1){
				System.out.print(fibList.get(i)+", ");
			}
			else{
				System.out.print(fibList.get(i));
			}
		}

	}

}
