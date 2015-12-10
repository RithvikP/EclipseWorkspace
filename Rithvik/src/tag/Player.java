package tag;

import zen.core.Zen;
import zen.game.Sprite;

public class Player extends Sprite{
	
	int number;
	String myColor = "blue";
	
	@Override
	public void draw() {
		Zen.setColor(myColor);
		Zen.fillOval(getX(), getY(), 40, 40);
		
	}

	@Override
	public void move() {  
		if(number == 1){
			moveWithArrowKeys();
		}
		else{
			moveWithWASD();
		}
		Zen.setColor(myColor);
	}
	//function for arrow key movement
	public void moveWithArrowKeys(){
		if(Zen.isKeyPressed("up") && getY()>0){
			changeY(-6);
		}
		if(Zen.isKeyPressed("down")&& getY()<750){
			changeY(6);
		}
		if(Zen.isKeyPressed("right")&& getX()<750){
			changeX(6);
		}
		if(Zen.isKeyPressed("left")&& getX()>0){
			changeX(-6);
		}
	}
	
	//function for WASD movement
	public void moveWithWASD(){
		if(Zen.isKeyPressed("w") && getY()>0){
			changeY(-6);
		}
		if(Zen.isKeyPressed("s") && getY()<750){
			changeY(6);
		}
		if(Zen.isKeyPressed("d") && getX()<750){
			changeX(6);
		}
		if(Zen.isKeyPressed("a") && getX()>0){
			changeX(-6);
		}
	}
	
	@Override
	public void setup() {
		Zen.setColor(myColor);
	}
	
}
