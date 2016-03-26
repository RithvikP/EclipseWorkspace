import java.util.Scanner;

public class Mathematics {
	public static void main(String args[]){
		Scanner keyboard=new Scanner(System.in);
		int N=keyboard.nextInt();
		int M=keyboard.nextInt();
		keyboard.nextLine();
		String line="";
		for(int i=0;i<N;i++){
			line=keyboard.nextLine();
			String operation=line.substring(0, 3);
			int number=Integer.parseInt(line.substring(4,line.length()));
			if(operation.equals("ADD")){
				M+=number;
			}
			if(operation.equals("SUB")){
				M-=number;
			}
			if(operation.equals("MUL")){
				M=M*number;
			}
			if(operation.equals("DIV")){
				M=M/number;
				
			}
			if(operation.equals("COB")){
				M=Integer.parseInt(Integer.toString(M),number);
				
			}
		}
		System.out.print(M);
	}
}
