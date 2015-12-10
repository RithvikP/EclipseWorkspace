package Problems;

import java.util.Scanner;

public class Var2EquationGiver {

	public static void main(String args[]){

		double x1;
		double x2;
		double y1;
		double y2;
		double m;
		double b;

		Scanner keyboard = new Scanner(System.in);

		x1=keyboard.nextDouble();
		y1=keyboard.nextDouble();
		x2=keyboard.nextDouble();
		y2=keyboard.nextDouble();

		m=(y2-y1)/(x2-x1);

		b=y1-m*x1;

		if(b>0&&m!=1&&m!=0)
			System.out.println("y = "+m+"x + "+b);

		if(b<0&&m!=1&&m!=0)
			System.out.println("y = "+m+"x "+b);

		if(b==0&&m!=1&&m!=0)
			System.out.println("y = "+m+"x");

		if(b>0&&m==1&&m!=0)
			System.out.println("y = x + "+b);

		if(b<0&&m==1&&m!=0)
			System.out.println("y = x "+b);

		if(b==0&&m==1&&m!=0)
			System.out.println("y = x");
		
		if(b>0&&m!=1&&m==0)
			System.out.println("y = " +b);

		if(b<0&&m!=1&&m==0)
			System.out.println("y = "+b);

		if(b==0&&m!=1&&m==0)
			System.out.println("y = 0");

	}

}
