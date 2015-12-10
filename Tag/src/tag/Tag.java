package tag;

import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;



public class Tag extends Circle implements KeyListener{
	public Tag(int x, int y) {
		super(x, y);
		// TODO Auto-generated constructor stub
	}
	static int players=2;
	static  byte start = 1;
	static  byte it = 1;
	static int p1itTimes = 0;
	static int p2itTimes = 0;
	static int p3itTimes = 0;
	static boolean threePlayers = false;
	static boolean twoPlayers=false;
	static int player3X=640;
	
	static boolean left = false;
	static boolean right = false;
	static boolean up = false;
	static boolean down = false;
	
	static boolean a = false;
	static boolean d = false;
	static boolean w = false;
	static boolean s = false;
	
	static boolean y = false;
	static boolean g = false;
	static boolean h = false;
	static boolean j = false;
	
	static byte Player1Speed = 20;
	static byte Player2Speed = 20;
	static byte Player3Speed = 20;

	static Circle Player1=new Circle(960,350);
	static Circle Player2=new Circle(320,350);
	static Circle Player3= new Circle(player3X,350);

	static Graphics ga;

	public static void main(String[] args) {

		//set up JFrame for players input
		makeJFrame();


	}
	// Waits for user to input players and then starts the rest of the program
	private static void run(){


		String itColor="red";


		if(players==1){
			start=2;
			player3X=8000;
		}

		else if(players==2){
			twoPlayers=true;
			threePlayers=false;
			player3X=8000;
			start = 2;
		}
		else if(players==3){
			threePlayers=true;
			start=2;
		}

		//setup JFrame
		JFrame frame=new JFrame("Tag");
		frame.setSize(1280, 700);

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		frame.setVisible(true);

		//Find who is it
		int startit2=(int) (Math.random()*2+1);
		int startit3=(int) (Math.random()*3+1);

		if(twoPlayers){
			if(startit2 == 1){
				it = 1;
				Player1.color=itColor;
				Player2.color="yellow";
				Player3.color="white";

			}
			else if(startit2 == 2){
				it = 2;
				Player2.color=itColor;
				Player1.color="green";
				Player3.color="white";

			}
		}
		else if(threePlayers){
			if(startit3 == 1){
				it = 1;
				Player1.color=(itColor);
				Player2.color="yellow";
				Player3.color="white";

			}
			else if(startit3 == 2){
				it = 2;
				Player2.color=(itColor);
				Player1.color="green";
				Player3.color="white";

			}
			else if(startit3 == 3){
				it = 3;
				Player3.color=(itColor);
				Player1.color="green";
				Player2.color="yellow";

			}
		}
		else{
			if(startit2 == 1){
				it = 1;
				Player1.color=(itColor);
				Player2.color="yellow";
				Player3.color="white";

			}
			else if(startit2 == 2){
				it = 2;
				Player2.color=(itColor);
				Player1.color="green";
				Player3.color="white";


			}
			Player2Speed=40;
		}

		Player3.x=player3X;
		
		
		while (start==2){

			JPanel pane = new JPanel(){
				private static final long serialVersionUID = 1L;

				@Override
				protected void paintComponent(Graphics ga) {
					super.paintComponent(ga);
					Player1.paint(ga,Player1.color);
					Player2.paint(ga,Player2.color);
					Player3.paint(ga,Player3.color);
				}
			};
			frame.add(pane);
			
			frame.addKeyListener(new KeyListener(){
				//Key Listeners
				@Override
				public void keyTyped(KeyEvent e) {
					// TODO Auto-generated method stub
					
				}
				@Override
				public void keyPressed(KeyEvent e) {
					
					    int key = e.getKeyCode();

					    if (key == KeyEvent.VK_LEFT) {
					        left=true;
					    }

					    if (key == KeyEvent.VK_RIGHT) {
					       right=true;
					    }

					    if (key == KeyEvent.VK_UP) {
					       up=true;
					    }

					    if (key == KeyEvent.VK_DOWN) {
					        down=true;
					    }
					    
					    //----------------------------------
					    
					    if (key == KeyEvent.VK_A) {
					        a=true;
					    }

					    if (key == KeyEvent.VK_D) {
					       d=true;
					    }

					    if (key == KeyEvent.VK_W) {
					       w=true;
					    }

					    if (key == KeyEvent.VK_S) {
					        s=true;
					    }
					    
					    //--------------------------------
					    
					    if (key == KeyEvent.VK_G) {
					        g=true;
					    }

					    if (key == KeyEvent.VK_J) {
					       j=true;
					    }

					    if (key == KeyEvent.VK_Y) {
					       y=true;
					    }

					    if (key == KeyEvent.VK_H) {
					        h=true;
					    }
					
				}
				@Override
				public void keyReleased(KeyEvent e) {
					int key = e.getKeyCode();

				    if (key == KeyEvent.VK_LEFT) {
				        left=false;
				    }

				    if (key == KeyEvent.VK_RIGHT) {
				       right=false;
				    }

				    if (key == KeyEvent.VK_UP) {
				       up=false;
				    }

				    if (key == KeyEvent.VK_DOWN) {
				        down=false;
				    }
				    
				    //----------------------------------
				    
				    if (key == KeyEvent.VK_A) {
				        a=false;
				    }

				    if (key == KeyEvent.VK_D) {
				       d=false;
				    }

				    if (key == KeyEvent.VK_W) {
				       w=false;
				    }

				    if (key == KeyEvent.VK_S) {
				        s=false;
				    }
				    
				    //--------------------------------
				    
				    if (key == KeyEvent.VK_G) {
				        g=false;
				    }

				    if (key == KeyEvent.VK_J) {
				       j=false;
				    }

				    if (key == KeyEvent.VK_Y) {
				       y=false;
				    }

				    if (key == KeyEvent.VK_H) {
				        h=false;
				    }
					
				}
			});


			//-----------------------				
			//Movement for Players

			if(up){
				Player1.y=Player1.y-Player1Speed;
			}
			if(down){
				Player1.y=Player1.y+Player1Speed;
			}
			if(right){
				Player1.x=Player1.x+Player1Speed;
			}
			if(left){
				Player1.x=Player1.x-Player1Speed;
			}

			if(twoPlayers||threePlayers){	
				if(w){
					Player2.y=Player2.y-Player1Speed;
				}
				if(s){
					Player2.y=Player2.y+Player1Speed;
				}
				if(d){
					Player2.x=Player2.y+Player1Speed;
				}
				if(a){
					Player2.x=Player2.x-Player1Speed;
				}
			}
			else{ //Computer movement


			}

			if(threePlayers){

				if(y){
					Player3.y=Player3.y-Player1Speed;
				}
				if(h){
					Player3.y=Player3.y+Player1Speed;
				}
				if(j){
					Player3.x=Player3.y+Player1Speed;
				}
				if(g){
					Player3.x=Player3.y-Player1Speed;
				}

			}

			//-----------------------				
			//Wraparound screen setup
			if(Player1.y<30){
				Player1.y=670;
			}
			if(Player1.y>670){
				Player1.y=15;
			}

			if(Player1.x<30){
				Player1.x=1250;
			}

			if(Player1.x>1250){
				Player1.x=15;
			}
			//-----------------------				

			if(Player2.y<30){
				Player2.y=670;
			}
			if(Player2.y>670){
				Player2.y=15;
			}

			if(Player2.x<30){
				Player2.x=1250;
			}

			if(Player2.x>1250){
				Player2.x=15;
			}
			//-----------------------				
			if(threePlayers){
				if(Player3.y<30){
					Player3.y=670;
				}
				if(Player3.y>670){
					Player3.y=15;
				}

				if(Player3.x<30){
					Player3.x=1250;
				}

				if(Player3.x>1250){
					Player3.x=15;
				}
			}


			//-----------------------
			//Who's it logic
			//Player1
			if(it==1 && isTouching(Player1,Player2)){
				Player2.color=(itColor);
				Player1.color=("green");

				Player1.x=(960);
				Player2.x=(320);
				Player3.x=(player3X);

				Player1.y=(350);
				Player2.y=(350);
				Player3.y=(350);

				p2itTimes = 25;

				it=2;
			}
			else if(it==1 && isTouching(Player1,Player3)){
				Player3.color=(itColor);
				Player1.color=("green");

				Player1.x=(960);
				Player2.x=(320);
				Player3.x=(player3X);

				Player1.y=(350);
				Player2.y=(350);
				Player3.y=(350);


				p3itTimes = 25;

				it=3;
			}
			//Player2

			if(it==2 && isTouching(Player2,Player1)){
				Player1.color=(itColor);
				Player2.color=("yellow");

				Player1.x=(960);
				Player2.x=(320);
				Player3.x=(player3X);

				Player1.y=(350);
				Player2.y=(350);
				Player3.y=(350);


				p1itTimes = 25;

				it=1;
			}
			else if(it==2 && isTouching(Player2,Player3)){
				Player3.color=(itColor);
				Player2.color=("yellow");

				Player1.x=(960);
				Player2.x=(320);
				Player3.x=(player3X);

				Player1.y=(350);
				Player2.y=(350);
				Player3.y=(350);


				p3itTimes = 25;

				it=3;
			}
			
			//Player3
			if(it==3 && isTouching(Player3,Player1)){
				Player1.color=(itColor);
				Player3.color=("white");

				Player1.x=(960);
				Player2.x=(320);
				Player3.x=(player3X);

				Player1.y=(350);
				Player2.y=(350);
				Player3.y=(350);

				p1itTimes = 25;

				it=1;
			}
			else if(it==3 && isTouching(Player3,Player2)){
				Player2.color=(itColor);
				Player3.color=("white");

				Player1.x=(960);
				Player2.x=(320);
				Player3.x=(player3X);

				Player1.y=(350);
				Player2.y=(350);
				Player3.y=(350);


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
		//setting up second JFrame
		JFrame frame=new JFrame();
		frame.setSize(700, 500);
		frame.setLayout(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//setting up label
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
		
		//Setting up done button
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
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
}