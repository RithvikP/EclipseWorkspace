package Problems;

import java.util.Scanner;

public class SigFigFinder {

	public static void main(String args[]){

		boolean startingZero=false;
		boolean notDone=true;

		int numberOfZeros=0;

		int number=0;

		Scanner keyboard = new Scanner(System.in);


		String state = keyboard.nextLine();

		if(state.contains(".")){
			state=state.replace(".", "");

			if(Integer.parseInt(state.substring(0,1))==0){
				startingZero=true;
			}

			if(startingZero==false){
				number=state.length();
				notDone=false;
			}

			startingZero=false;

			if(notDone){
				for(int i=0; i<state.length();i++){

					if(Integer.parseInt(state.substring(i,i+1))!=0&&notDone){
						startingZero=true;
					}
					else if(Integer.parseInt(state.substring(i,i+1))==0&&notDone&&startingZero==false){
						numberOfZeros++;
					}
					else if(Integer.parseInt(state.substring(i,i+1))==0&&notDone&&startingZero==true){
						for(int j=Integer.parseInt(state.substring(i,i+1));j<state.length();j++){
							if(Integer.parseInt(state.substring(i,i+1))!=0){
								number++;
							}
						}
					}

				}
				notDone=false;
				number=state.length()-numberOfZeros;
			}
		}
		if(notDone){
			startingZero=true;
			for(int i=0;i<state.length();i++){
				if(state.substring(i,i+1).equals("0")&&startingZero==true){
				}
				else{
					startingZero=false;
					number++;
				}
				if(Integer.parseInt(state.substring(i,i+1))==0&&startingZero==false){
					for(int j=i;j<state.length();j++){
						if(Integer.parseInt(state.substring(j,j+1))!=0){
							number++;
							j=i;
						}
					}
				}
			}
		}

		System.out.println(number);

	}


}
