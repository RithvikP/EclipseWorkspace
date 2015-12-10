import zen.core.Zen;


public class Catapult {

	public static void main(String[] args) {
		int x = 32;
		int y = 310;
		int speed = -15;
		int xspeed = 10;
		int startspeed = -15;


		Zen.create(600,600);
		Zen.setBackground("sky blue");

		Zen.setColor("green");
		Zen.fillRect(0, 475, 600,175);

		Zen.setColor("gray");
		Zen.fillRect(375,250,75,225);

		Zen.setColor("green");
		Zen.fillOval(335,70,150,225);

		Zen.setColor("black");
		Zen.fillOval(65,420,60,60);

		Zen.setColor("dark gray");
		Zen.fillRect(20, 330, 48, 145);
		
		Zen.setColor("red");
		Zen.fillOval(400,200,70,70);
			
		while(2>1){
			//reseting background
				Zen.setBackground("sky blue");
	
				Zen.setColor("green");
				Zen.fillRect(0, 475, 600,175);
	
				Zen.setColor("gray");
				Zen.fillRect(375,250,75,225);
	
				Zen.setColor("green");
				Zen.fillOval(335,70,150,225);
	
				Zen.setColor("black");
				Zen.fillOval(65,420,60,60);
	
				Zen.setColor("dark gray");
				Zen.fillRect(20, 330, 48, 145);
				
				Zen.setColor("red");
				Zen.fillOval(400,200,70,70);
			
			//Make the cannonball	
				Zen.setColor("black");
				Zen.fillOval(x,y,25,25);

			x=x+xspeed;
			y=y+speed;

			speed = speed+1;
			
			if(Zen.isKeyPressed("right")){
				xspeed = xspeed + 2;
			}
			
			if(Zen.isKeyPressed("left")){
				speed = speed + 2;
				
			}
			
			if(Zen.isKeyPressed("up")){
				startspeed = startspeed - 1;
			}
			
			if(Zen.isKeyPressed("down")){
				startspeed = startspeed + 1;
			}
			
			//buffer
			Zen.buffer(30);
			
			//refire the cannonball
				if(Zen.isKeyPressed("space")){
					x = 32;
					y = 310;
					speed = startspeed;
					xspeed = 10;
				}

		}	

	}

}
