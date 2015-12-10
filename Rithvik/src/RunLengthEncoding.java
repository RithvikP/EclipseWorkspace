
public class RunLengthEncoding {
	public static void main(String[] args) {
		
		int [] array = {1,1,4,3,3,3,3,5,5,2,2,2,8,7};
			int value = 1;
			int count = 0;
			
			for (int x : array){
				if (x == value){
					count++;
				}
				else{
					System.out.println(value + " - " + count);
					value = x;
					count = 1;
				}
			}
			
			System.out.println(value + " - " + count);
	}
}
