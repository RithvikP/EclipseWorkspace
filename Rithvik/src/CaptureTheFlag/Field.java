package CaptureTheFlag;

import zen.core.Zen;
import zen.game.Game;

public class Field extends Game{
	
	Player Rithvik;
	Player Kevin;
	
	Flag redflag;
	Flag blueflag;
	
	@Override
	public void loop() {
		Zen.setBackground("green");
		Zen.setColor("white");
		Zen.fillRect(499,0,2,500);
		
		//Picking up the flag
		String owner = Zen.read("blueflag owner");
		if(owner.equals("nobody")){
			Zen.write("blueflag owner", "Rithvik");
		}
		
		/*String owner = Zen.read("redflag owner");
		if(owner.equals("nobody")){
			Zen.write("redflag owner", "Rithvik");
		}*/
		
		//Carrying the flag
		if(owner.equals("Rithvik") && Rithvik.distanceTo(blueflag)<40){
			Zen.write("blue flag x", Rithvik.getX());
			Zen.write("blue flag y", Rithvik.getY());
			
		}
		
		
		//dropping the flag once you reach a safe side
		if(Rithvik.getX()<500){
			Zen.write("blueflag owner", "nobody");
			Zen.write("blue flag x", 975);
			Zen.write("blue flag y", 250);
			//add score
		}
		
		
		//getting tagged
		if(Rithvik.distanceTo(Kevin)<20 && Rithvik.getX()>500){
			Rithvik.setX(250);
			
			if(owner.equals("Rithvik"))
				Zen.write("blueflag owner", "nobody");
				Zen.write("blue flag x", 975);
				Zen.write("blue flag y", 250);
		}
		
	}

	@Override
	public void setup() {
		
		//player making
		Rithvik = new Player();
		Kevin = new Player();
		
		//player defining
		Rithvik.setName("Rithvik");
		Kevin.setName("Kevin");
		
		//player teaming
		Rithvik.setTeam(1);
		Kevin.setTeam(2);
		
		//player putting
		addSprite(Rithvik);
		addSprite(Kevin);
		
		//player moving
		Rithvik.moveWithArrowKeys();
		Kevin.moveWithWeb();
		
		//flag making
		redflag = new Flag();
		blueflag = new Flag();
		
		//flag teaming
		redflag.setTeam(1);
		blueflag.setTeam(2);

		
		//flag adding
	addSprite(redflag);
		addSprite(blueflag);

	}
	
}
