package tag;
import java.awt.Color;
import java.awt.Graphics;


public class Circle {

	String color;

	int x;
	int y;
	static int radius=40;




	public Circle(int x, int y){
		this.x=x;
		this.y=y;
	}


	public void paint(Graphics g,String color1){

		color1=color;
		if(color.equals("red")){
			g.setColor(Color.RED);
		}
		else{
			if(color.equals("green")){
				g.setColor(Color.GREEN);
			}
			else{
				if(color.equals("yellow")){
					g.setColor(Color.YELLOW);
				}
				else{
					if(color.equals("white")){
						g.setColor(Color.WHITE);
					}
				}
			}
		}



		x=x-radius/2;
		y=y-radius/2;
		g.fillOval(x, y, radius,radius);
	}

	public static  boolean isTouching(Circle circle,Circle circle2){

		circle.x=circle.x-15/2;
		circle.y=circle.y-15/2;
		circle2.x=circle2.x-15/2;
		circle2.y=circle2.y-15/2;


		if(Math.abs(circle.x-circle2.x)<radius){
			if(Math.abs(circle.y-circle2.y)<radius){
				return true;
			}
		}

		return false;
	}
}
