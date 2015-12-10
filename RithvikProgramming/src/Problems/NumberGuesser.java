package Problems;

import java.util.Scanner;

public class NumberGuesser {
	static Scanner keyboard = new Scanner(System.in);
	public static void main(String[] args){
		boolean runWhile=true;
		int high=100;
		int low=100;
		int mid=50;
		String input;
		
		int[] array= new int[101];
		
		for(int i=0; i<=100;i++){
			array[i]=i;
		}
		System.out.println(binary_search(array,array[0],array[100])+" is your number.");

	}
	static int binary_search(int A[], int imin, int imax){
		int imid=0;
	  while (imin <= imax){
	      imid = (imin+imax)/2;
	      System.out.println(imid);
		  String input =keyboard.nextLine();
	      if (input.equals("higher")){
	        imin = imid + 1;
	      }
	      else if(input.equals("lower"))         
	        imax = imid - 1;
	    }
	  // key was not found
	  return imid;
	}
}
