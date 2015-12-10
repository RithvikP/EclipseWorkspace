import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

import javax.swing.JFrame;


public class BouncingBalls extends JFrame{
	ArrayList<Ball> balls;
	public static void main(String[] args) {
		new BouncingBalls();
	}

	public BouncingBalls(){
		super("Bouncing Balls");
		balls = new ArrayList<Ball>();
		
		//make 800 balls to add to the list
		for(int x = 0;x<=800;x++){
			Ball b = new Ball();
			b.setBalls(balls);
			balls.add(b);
		}
		
		setSize(700,700);
		setVisible(true);
	}

	public void paint(Graphics g){
		g.setColor(Color.WHITE);
		g.fillRect(0, 0, 700, 700);
		
		for(Ball b:balls){
			b.paint(g);
			b.move();
		}
		try {
			Thread.sleep(30);
		} catch (InterruptedException e) {	}
		repaint();
		
	}

}
