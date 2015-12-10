package CaptureTheFlag;

import zen.core.Zen;
import zen.game.Sprite;

public class Flag extends Sprite{
	
	int team;
	
	@Override
	public void draw() {
		if(team == 1){
			Zen.setColor("red");
		}
		else{
			Zen.setColor("blue");

		}
		Zen.fillRect(getX()-25,getY()-25,50,50);
	}

	@Override
	public void move() {
		if(team == 1){
			setX(Zen.readInt("redflagx"));
			setY(Zen.readInt("redflagy"));
		}
		else{
			setX(Zen.readInt("blueflagx"));
			setY(Zen.readInt("blueflagy"));
		}
		
	}

	public int getTeam() {
		return team;
	}

	public void setTeam(int team) {
		this.team = team;
	}

	@Override
	public void setup() {
		
	}
	
}
