package Programs;

import zen.core.Zen;
import zen.shape.Rectangle;


public class Avoider {
	static double obstacleY = 500;
	static int obstacleX = 1180;
	static int obstacleX2=1180;
	static double obstacleY2 = 100;
	static int obstacleSpeed = 30;
	static int count;
	static int countCount;
	
	
	public static void main(String[] args) {
		
		byte Player1Speed = 20;
		
		Zen.create(1280,700);
		Zen.setBackground("sky blue");
		Rectangle Player1 = new Rectangle (100, 100);
		
		Player1.setX(200);
		Player1.setY(350);
		
		Player1.setColor("green");
		
		while(true){
			Zen.setBackground("sky blue");
			Player1.draw();
			
			if(Zen.isKeyPressed("up") && Player1.getY() > 25){
				Player1.changeY(-Player1Speed);
			}
			if(Zen.isKeyPressed("down") && Player1.getY() < 675){
				Player1.changeY(Player1Speed);
			}
			
			if(obstacleX <= 0){
				Zen.setColor("green");
				obstacleY = Math.random()*500 + 100;
				obstacleX = 1180;
				obstacleY2 = Math.random()*500 + 100;
				obstacleX2 = 1180;
				count++;
			}
			
			if(count==4 && countCount<4){
				obstacleSpeed=obstacleSpeed+2;
				count=0;
				countCount++;
			}
			else if(count==7&&countCount>=4){
				obstacleSpeed=obstacleSpeed+1;
				count=0;
			}
			
			Zen.fillOval(obstacleX, (int) obstacleY, 60, 60);
			Zen.fillOval(obstacleX2, (int) obstacleY2, 60, 60);
			obstacleX = obstacleX - obstacleSpeed;
			obstacleX2 = obstacleX2 - obstacleSpeed;
			
			if(obstacleX< Player1.getY()&&obstacleX>=Player1.getY()){
				if(obstacleY-100< Player1.getY()&&obstacleY>=Player1.getY()){
					System.exit(0);
				}
			}
			else if(obstacleX2< Player1.getY()&&obstacleX2>=Player1.getY()){
				if(obstacleY2-100< Player1.getY()&&obstacleY2>=Player1.getY()){
					System.exit(0);
				}
			}
			
			
			Zen.buffer(10);

		}
		
	}
	
}
