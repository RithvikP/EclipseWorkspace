package Programs;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import zen.core.Zen;
import zen.shape.Circle;
import zen.shape.Rectangle;


public class Tag2 {
	static int players=2;
	static short player3X = 640;
	static  byte start = 1;
	static  byte it = 1;
	static int p1itTimes = 0;
	static int p2itTimes = 0;
	static int p3itTimes = 0;
	static boolean threePlayers = false;
	static boolean twoPlayers=false;
	static String itColor="red";

	public static void main(String[] args) {

		//set up JFrame for players input
		
		run();
		
		makeJFrame();
	}
	// Waits for user to input players and then starts the rest of the program
	private static void run(){

		if(players==1){
			start=2;
			player3X=8000;
		}

		else if(players==2){
			twoPlayers=true;
			threePlayers=false;
			start = 2;
			player3X=8000;
		}
		else if(players==3){
			threePlayers=true;
			start=2;
		}

		if(start==2){
			Zen.create(1280,700);
		}

		
		
		//Set up circles for players
		Circle Player1 = new Circle(40);
		Circle Player2 = new Circle(40);
		Circle Player3 = new Circle(40);

		Player1.setX(960);
		Player2.setX(320);
		Player3.setX(player3X);

		Player1.setY(350);
		Player2.setY(350);
		Player3.setY(350);

		Player1.setColor("green");
		Player2.setColor("yellow");
		Player3.setColor("white");

		byte Player1Speed = 20;
		byte Player2Speed = 20;
		byte Player3Speed = 20;


		//Set up obstacles
		Rectangle obstacle1=new Rectangle(50,200);

		obstacle1.setX(200);

		obstacle1.setY(400);

		obstacle1.setColor("gray");


		Zen.setBackground("sky blue");

		int startit2=Zen.dice(2);
		int startit3=Zen.dice(3);
		if(twoPlayers){
			if(startit2 == 1){
				it = 1;
				Player1.setColor(itColor);
			}
			else if(startit2 == 2){
				it = 2;
				Player2.setColor(itColor);
			}
		}
		else if(threePlayers){
			if(startit3 == 1){
				it = 1;
				Player1.setColor(itColor);
			}
			else if(startit3 == 2){
				it = 2;
				Player2.setColor(itColor);
			}
			else if(startit3 == 3){
				it = 3;
				Player3.setColor(itColor);
			}
		}
		else{
			if(startit2 == 1){
				it = 1;
				Player1.setColor(itColor);
			}
			else if(startit2 == 2){
				it = 2;
				Player2.setColor(itColor);
			}
			Player2Speed=40;
		}



		while (start==2){
			Zen.setBackground("sky blue");

			Player1.draw();

			Player2.draw();

			if(threePlayers){
				Player3.draw();
			}

			//obstacle1.draw();

			//-----------------------				
			//Movement for Players
			if(Zen.isKeyPressed("up")){
				Player1.changeY(-Player1Speed);
			}
			if(Zen.isKeyPressed("down")){
				Player1.changeY(Player1Speed);
			}
			if(Zen.isKeyPressed("right")){
				Player1.changeX	(Player1Speed);
			}
			if(Zen.isKeyPressed("left")){
				Player1.changeX(-Player1Speed);
			}

			if(twoPlayers||threePlayers){
				if(Zen.isKeyPressed("w")){
					Player2.changeY(-Player2Speed);
				}
				if(Zen.isKeyPressed("s")){
					Player2.changeY(Player2Speed);
				}
				if(Zen.isKeyPressed("d")){
					Player2.changeX(Player2Speed);
				}
				if(Zen.isKeyPressed("a")){
					Player2.changeX(-Player2Speed);
				}
			}
			else{


			}

			if(threePlayers){
				if(Zen.isKeyPressed("y")){
					Player3.changeY(-Player3Speed);
				}
				if(Zen.isKeyPressed("h")){
					Player3.changeY(Player3Speed);
				}
				if(Zen.isKeyPressed("j")){
					Player3.changeX(Player3Speed);
				}
				if(Zen.isKeyPressed("g")){
					Player3.changeX(-Player3Speed);
				}
			}

			//-----------------------				
			//Wraparound screen setup
			if(Player1.getY()<30){
				Player1.setY(670);
			}
			if(Player1.getY()>670){
				Player1.setY(15);
			}

			if(Player1.getX()<30){
				Player1.setX(1250);
			}

			if(Player1.getX()>1250){
				Player1.setX(15);
			}
			//-----------------------				

			if(Player2.getY()<30){
				Player2.setY(670);
			}
			if(Player2.getY()>670){
				Player2.setY(15);
			}

			if(Player2.getX()<30){
				Player2.setX(1250);
			}

			if(Player2.getX()>1250){
				Player2.setX(15);
			}
			//-----------------------				
			if(threePlayers){
				if(Player3.getY()<30){
					Player3.setY(670);
				}
				if(Player3.getY()>670){
					Player3.setY(15);
				}

				if(Player3.getX()<30){
					Player3.setX(1250);
				}

				if(Player3.getX()>1250){
					Player3.setX(15);
				}
			}


			//-----------------------
			//Who's it logic
			if(it==1 && Player1.distanceTo(Player2)<=40){
				Player2.setColor(itColor);
				Player1.setColor("green");

				Player1.setX(960);
				Player2.setX(320);
				Player3.setX(player3X);

				Player1.setY(350);
				Player2.setY(350);
				Player3.setY(350);

				p2itTimes = 25;

				it=2;
			}
			else if(it==1 && Player1.distanceTo(Player3)<=40){
				Player3.setColor(itColor);
				Player1.setColor("green");

				Player1.setX(960);
				Player2.setX(320);
				Player3.setX(player3X);

				Player1.setY(350);
				Player2.setY(350);
				Player3.setY(350);


				p3itTimes = 25;

				it=3;
			}

			if(it==2 && Player2.distanceTo(Player1)<=40){
				Player1.setColor(itColor);
				Player2.setColor("yellow");

				Player1.setX(960);
				Player2.setX(320);
				Player3.setX(player3X);

				Player1.setY(350);
				Player2.setY(350);
				Player3.setY(350);


				p1itTimes = 25;

				it=1;
			}
			else if(it==2 && Player2.distanceTo(Player3)<=40){
				Player3.setColor(itColor);
				Player2.setColor("yellow");

				Player1.setX(960);
				Player2.setX(320);
				Player3.setX(player3X);

				Player1.setY(350);
				Player2.setY(350);
				Player3.setY(350);


				p3itTimes = 25;

				it=3;
			}

			if(it==3 && Player3.distanceTo(Player1)<=40){
				Player1.setColor(itColor);
				Player3.setColor("white");

				Player1.setX(960);
				Player2.setX(320);
				Player3.setX(player3X);

				Player1.setY(350);
				Player2.setY(350);
				Player3.setY(350);


				p1itTimes = 25;

				it=1;
			}
			else if(it==3 && Player3.distanceTo(Player2)<=40){
				Player2.setColor(itColor);
				Player3.setColor("white");

				Player1.setX(960);
				Player2.setX(320);
				Player3.setX(player3X);

				Player1.setY(350);
				Player2.setY(350);
				Player3.setY(350);


				p2itTimes = 25;

				it=2;
			}

			//---------------------
			//stopping the new it circle
			if(p1itTimes>0){
				Player1Speed = 0;
			}

			if(p1itTimes<=0){
				Player1Speed = 20;
			}
			if(p2itTimes>0){
				Player2Speed = 0;
			}

			if(p2itTimes<=0&&players>1){
				Player2Speed = 20;
			}
			else if(p2itTimes<=0){
				Player2Speed=40;
			}
			if(p3itTimes>0){
				Player3Speed = 0;
			}

			if(p3itTimes<=0){
				Player3Speed = 20;
			}

			Zen.buffer(27);
			p1itTimes = p1itTimes-1;
			p2itTimes = p2itTimes-1;
			p3itTimes = p3itTimes-1;


		}
	}

	private static void makeJFrame(){


		JFrame frame=new JFrame("Tag");
		frame.setSize(700, 523);
		frame.setLayout(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		//Set up JLabel
		JLabel label=new JLabel("How many players?");
		label.setFont(new Font("Arial",0,80));
		label.setBounds(0, 0, 700, 200);
		frame.add(label);

		//Set up button 1
		JButton button1=new JButton("One player");
		button1.setFont(new Font("Arial",0,60));
		button1.setBounds(0, 200, 700, 100);

		//listens for when the button is clicked
		button1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				players=1;
				makeSecondJFrame();
			}
		});
		frame.add(button1);

		//Set up button 2
		JButton button2=new JButton("Two players");
		button2.setFont(new Font("Arial",0,60));
		button2.setBounds(0, 300, 700, 100);

		//listens for when the button is clicked
		button2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				players=2;
				makeSecondJFrame();
			}
		});

		frame.add(button2);

		//Set up button 3
		JButton button3=new JButton("Three players");
		button3.setFont(new Font("Arial",0,60));
		button3.setBounds(0, 400, 700, 100);

		//listens for when the button is clicked
		button3.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				players=3;
				makeSecondJFrame();
			}
		});

		frame.add(button3);

		frame.setVisible(true);


	}

	private static void makeSecondJFrame(){
		JFrame frame=new JFrame();
		frame.setSize(700, 500);
		frame.setLayout(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


		JLabel label1=new JLabel("The player with the red circle is it.");
		JLabel label2=new JLabel("The player on the right uses the arrow keys.");
		JLabel label3=new JLabel("The player in the middle uses YGHJ.");
		JLabel label4=new JLabel("The player on the left uses WASD.");

		label1.setBounds(0, 0, 700, 100);
		label2.setBounds(0, 100, 700, 100);
		label3.setBounds(0, 200, 700, 100);
		label4.setBounds(0, 300, 700, 100);

		label1.setFont(new Font("Arial",0,35));
		label2.setFont(new Font("Arial",0,35));
		label3.setFont(new Font("Arial",0,35));
		label4.setFont(new Font("Arial",0,35));

		frame.add(label1);
		frame.add(label2);
		frame.add(label3);
		frame.add(label4);

		JButton button = new JButton("Continue");
		button.setFont(new Font("Arial",0,40));
		button.setBounds(0,400,700,75);
		button.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				run();
			}
		});
		frame.add(button);

		frame.setVisible(true);
	}
}

