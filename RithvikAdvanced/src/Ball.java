import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;



public class Ball {

	
	ArrayList<Ball>balls;

	//data
	//a static variable is a variable shared by all objects
	//static int red = 0;
	
	int x;
	int y;

	int dx;
	int dy;



	float hue = (float)(Math.random());
	float saturation = (float)(Math.random());
	float brightness = (float)(Math.random());

	public Ball(){
		x = (int) (Math.random()*800);
		y = (int) (Math.random()*800);

		dx = (int) (Math.random()*11)-5;
		dy = (int) (Math.random()*11)-5;


	}

	public void setBalls(ArrayList<Ball>theBalls){
		balls = theBalls;
	}

	//actions
	public void paint(Graphics g){
		g.setColor(Color.getHSBColor(hue,saturation,brightness));
		g.fillOval(x -5, y -5, 15, 15);
	}

	public void move(){
		x = x+dx;
		y=y+dy;
		if(x > 700){
			dx = dx*-1;
			x=x+dx;
		}
		if(x<0){
			dx = dx*-1;
			x=x+dx;
		}
		if(y > 675){
			dy = dy*-1;
			y=y+dy;
		}
		if(y<25){
			dy = dy*-1;
			y=y+dy;
		}

		for (Ball b: balls){
			if(this !=b && //If I am not looking at myself and...
					Math.abs(x - b.x)<10 && Math.abs(y - b.y)<10){
				dx = (int)(Math.random()*11)-5;
				dy = (int)(Math.random()*11)-5;

			}
		}

	}

}
