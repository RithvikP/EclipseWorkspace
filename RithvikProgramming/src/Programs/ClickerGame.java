package Programs;

import zen.core.Zen;


public class ClickerGame {

	public static void main(String[] args) {
		boolean play = false;

		while(true){
			while(play = true){
				System.out.println("Question");


				if(Zen.isKeyPressed("z")&& play == true){
					System.out.println("Player1 wins!");
				}

				if(Zen.isKeyPressed("m")&&play == true){
					System.out.println("You lose.");
				}

				play = false;

			}

			while(play = false){
				if(Zen.isKeyPressed("p")){
					play = true;
				}
			}

		}
	}

}


