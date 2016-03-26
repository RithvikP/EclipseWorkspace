import java.util.*;

public class ChallengeRound {
	static String[] board = new String[3];
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		String side=keyboard.nextLine();
		String otherside = "X";
		if(side.equals("X")) {
			otherside = "O";
		}
		
		for(int i=0;i<3;i++){
			board[i]=keyboard.nextLine();
		}
		
		boolean lanceturn = true;
		boolean playing = true;
		while(playing){
			if(lanceturn) {
				if(move(side,otherside)){
					System.out.print("NO");
					playing = false;
				}
			}
			else{
				if(move(otherside,side)){
					System.out.print("YES");
					playing = false;
				}
			}
			
			lanceturn=!lanceturn;
		}
		
		
	}
	public static boolean move(String c,String o){
		boolean taken=false;
		boolean notmoved = true;
		boolean win = false;
		for(int i=0;i<3&&notmoved;i++){
			for(int j=0;j<3&&notmoved;j++){
				if(board[i].substring(j,j+1).equals(".")){
					taken = false;
					boolean works=true;
					for(int k=0;k<3;k++){
						if(!board[i].substring(k,k+1).equals(".")||!board[i].substring(k,k+1).equals(c)){
							works = false;
						}
					}
					if(!works) taken=true;
					works=true;
					for(int k=0;k<3;k++){
						if(!board[k].substring(j,j+1).equals(".")||!board[k].substring(j,j+1).equals(c)){
							works = false;
						}
					}
					if(!works) taken=true;
					
					if(i==j) {
						works=true;
						for(int k=0;k<3;k++){
							if(!board[k].substring(k,k+1).equals(".")||!board[k].substring(k,k+1).equals(c)){
								works = false;
							}
						}
						if(!works) taken=true;
					} 
					else if(i+j==2){
						works=true;
						for(int k=0;k<3;k++){
							if(!board[2-k].substring(k,k+1).equals(".")||!board[2-k].substring(k,k+1).equals(c)){
								works = false;
							}
						}
						if(!works) taken=true;
					}
					if(taken) {
						win = true;
						notmoved = false;
					}
					if(taken==false) {
						board[i]=board[i].substring(0,j).concat(c).concat(board[i].substring(j+1, 3));
						//System.out.println(board[i].substring(0,j).concat(c).concat(board[i].substring(j+1, 3)));
						notmoved = false;
					}
					taken = false;
					works=true;
					for(int k=0;k<3;k++){
						if(!board[i].substring(k,k+1).equals(".")||!board[i].substring(k,k+1).equals(o)){
							works = false;
						}
					}
					if(!works) taken=true;
					works=true;
					for(int k=0;k<3;k++){
						if(!board[k].substring(j,j+1).equals(".")||!board[k].substring(j,j+1).equals(o)){
							works = false;
						}
					}
					if(!works) taken=true;
					
					if(i==j) {
						works=true;
						for(int k=0;k<3;k++){
							if(!board[k].substring(k,k+1).equals(".")||!board[k].substring(k,k+1).equals(o)){
								works = false;
							}
						}
						if(!works) taken=true;
					} 
					else if(i+j==2){
						works=true;
						for(int k=0;k<3;k++){
							if(!board[2-k].substring(k,k+1).equals(".")||!board[2-k].substring(k,k+1).equals(o)){
								works = false;
							}
						}
						if(!works) taken=true;
					}
					if(taken==false) {
						board[i]=board[i].substring(0,j).concat(c).concat(board[i].substring(j+1, 3));
						//System.out.println(board[i].substring(0,j).concat(c).concat(board[i].substring(j+1, 3)));
						notmoved = false;
					}
				}
				
				
			}
		}
		if(win) return true;
		return notmoved;
	}

}
