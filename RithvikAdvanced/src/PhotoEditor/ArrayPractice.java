package PhotoEditor;

public class ArrayPractice {

	public static void main(String[] args) {
		int[] array = {1,5,8,8,10,15};
		int sum = 0;
		int number = 0;
		int product = 1;
		
		//for(int index; index < 6; index++){
			
		//}
		
		for(int x : array){
			System.out.println(x);
			sum = sum + x;
			product = product*x;
			number ++;
		}
		
		System.out.println("Sum:" + sum);
		System.out.println("Average:" + sum/number);
		System.out.println("Product:" + product);
	}

}
