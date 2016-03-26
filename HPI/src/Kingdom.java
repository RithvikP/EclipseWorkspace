import java.util.*;

public class Kingdom {
	public static void main(String args[]){
		Scanner keyboard=new Scanner(System.in);
		int M=keyboard.nextInt();
		int N=keyboard.nextInt();
		boolean inside=false;
		boolean end=false;
		int number=0;
		ArrayList<String> lines=new ArrayList<String>();
	
		String line="";
		keyboard.nextLine();
		for(int i=0;i<M;i++){
			
			
		lines.add(keyboard.nextLine());
		
		}
		
		
		for(int i=0;i<M;i++){
			for(int j=0;j<N;j++){
				if((lines.get(i).substring(j,j+1)).equals(".")){
					
					if((lines.get(i).substring(0,j+1)).contains("X")){
						boolean found=false;
						if((lines.get(i).substring(j,N)).contains("X")){
							for(int k=0;k<i&&!found;k++){
								if(lines.get(k).substring(j, j+1).equals("X")){
									for(int l=i+1;l<M&&!found;l++){
										if(lines.get(l).substring(j,j+1).equals("X")){
											number++;
											found=true;
										}
									}
								}
							}
						}
					}
				}
			}
		}
		
		System.out.print(number);
		
		
	}
}
