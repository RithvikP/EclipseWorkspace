import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class TargetPractice {

	public static void main(String[] args) {
		Scanner keyboard=new Scanner(System.in);
		int N=keyboard.nextInt();
		int S=keyboard.nextInt();
		int R=keyboard.nextInt();
		int time=0;
		int max=0;
		int score=0;
		int maxPosition=0;
		int lastPosition = 0;
		ArrayList<Integer> points=new ArrayList<Integer>();
		int[][] trees=new int[N][2];
		
		for(int i=0;i<N;i++){
			
			trees[i][0]=keyboard.nextInt();
			trees[i][1]=keyboard.nextInt();
			
		}
		for(int j=0;j<N;j++){
			for(int i=0;i<N-1;i++){
				if((trees[i][1]/trees[i][0])>trees[i+1][1]/trees[i+1][0]){
					int a=trees[i][1];
					int b=trees[i][0];
					int c=trees[i+1][1];
					int d=trees[i+1][0];
					trees[i][1]=c;
					trees[i][0]=d;
					trees[i+1][1]=a;
					trees[i+1][0]=b;
					
					
				}
			}
		}
		for(int i=0;i<trees.length;i++){
			
				points.add(trees[i][1]/(trees[i][0]));
		}
		
		while(time<S){
			for(int i=0;i<points.size();i++){
				if(points.get(i)>max){
					max=points.get(i);
					maxPosition=i;
				}
			}
			if(time+trees[maxPosition][0]<=S){
				time+=trees[maxPosition][0];
				time+=R;
				score=score+trees[maxPosition][1];
				lastPosition = maxPosition;
			} else {
				for(int t=0; t<trees.length; t++) {
					if(trees[t][0]-trees[lastPosition][0]+time<=S) {
						if(points.get(t) != -1) {
							score -= trees[lastPosition][1];
							score += trees[t][1];
							break;
						}
					}
				}
				break;
			}
			points.set(maxPosition, -1);
			max=0;
			
		}
		System.out.println(score);
		
	}

}
