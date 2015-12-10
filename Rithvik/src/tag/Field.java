package tag;

import zen.core.Zen;
import zen.game.Game;

public class Field extends Game{
	
	Player Player1;
	Player Player2;
	
	@Override
	public void loop() {
		Zen.setBackground("sky blue");
	}

	@Override
	public void setup() {
		Player1 = new Player();
		Player1.myColor = "green";
		Player1.number = 1;
		Player1.set(225, 225);
		addSprite(Player1);
		
		Player2 = new Player();
		Player2.myColor = "yellow";
		Player2.number =2;
		Player2.set(425, 425);
		addSprite(Player2);
	}
}
