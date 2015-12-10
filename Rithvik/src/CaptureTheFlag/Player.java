package CaptureTheFlag;

import zen.core.Zen;
import zen.game.Sprite;

public class Player extends Sprite{

	int team;
	String name;

	public int getTeam() {
		return team;
	}

	public void setTeam(int team) {
		this.team = team;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void draw() {
		if(team == 1){
			Zen.setColor("red");
		}
		else{
			Zen.setColor("blue");
		}
		Zen.fillOval(getX() - 15, getY() -15, 30, 30);

		Zen.setColor("white");
		Zen.drawText(name,getX() - 25, getY() -15);
	}

	@Override
	public void move() {
		//do not use === with strings
		if(name.equals("Rithvik")){
			moveWithArrowKeys();
			Zen.write("Rithvikx", getX());
			Zen.write("Rithviky", getY());
		}
		else{
			moveWithWeb();
			
		}
		//moveWithWASD();
	}

	public void moveWithArrowKeys(){
		if(Zen.isKeyPressed("up")){
			changeY(-7);
		}
		if(Zen.isKeyPressed("down")){
			changeY(7);
		}
		if(Zen.isKeyPressed("right")){
			changeX(7);
		}
		if(Zen.isKeyPressed("left")){
			changeX(-7);
		}
	}

	/*public void moveWithWASD(){
		if(Zen.isKeyPressed("w")){
			changeY(-7);
		}
		if(Zen.isKeyPressed("s")){
			changeY(7);
		}
		if(Zen.isKeyPressed("d")){
			changeX(7);
		}
		if(Zen.isKeyPressed("a")){
			changeX(-7);
		}
	}*/

	public void moveWithWeb(){
		setX(Zen.readInt(name + "x"));
		setY(Zen.readInt(name + "y"));
		}

	public void pickUpFlag(){
		
	}

	public void carryFlag(){
		
	}

	public void scorePoints(){
		
	}

	@Override
	public void setup() {
		if(team == 1){
			set(250,250);
		}
		else{
			set(750,250);


		}

	}

}
