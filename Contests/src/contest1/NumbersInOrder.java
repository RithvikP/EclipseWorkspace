package contest1;

import java.util.Scanner;

public class NumbersInOrder {

	public static void main(String[] args) {
		Scanner keyboard=new Scanner(System.in);
		int N=keyboard.nextInt();
		int[] list = new int[N];

		int number1;
		int number2;

		for(int i=0;i<list.length;i++){
			list[i]=keyboard.nextInt();
		}

		for(int k=list.length;k>=0;k--){
			for(int j=0;j<list.length-1;j++){
				number1=list[j];
				number2=list[j+1];
				if(number1>number2){
					list[j]=number2;
					list[j+1]=number1;
				}
			}
		}
		
		for(int l=0;l<list.length;l++){
		System.out.println(list[l]);
		}

	}

}
