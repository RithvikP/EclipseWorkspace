package Programs;

import java.util.Scanner;

import zen.core.Zen;
import zen.shape.Circle;


public class Tag {
	public static void main(String[] args) {


		short player3X = 640;
		byte start = 1;
		byte it = 1;
		int p1itTimes = 0;
		int p2itTimes = 0;
		int p3itTimes = 0;
		boolean threePlayers = false;
		int dice=1;

		//-------------------------
		System.out.println("How many players?");
		Scanner keyboard = new Scanner(System.in);

		int players = keyboard.nextInt();

		if(players==2){
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


		Circle Player1 = new Circle(40);
		Circle Player2 = new Circle (40);
		Circle Player3 = new Circle (40);


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

		Zen.setBackground("sky blue");

		if(threePlayers){
			dice=Zen.dice(3);
		}
		else{
			dice=Zen.dice(2);
		}
		if(dice == 1){
			it = 1;
			Player1.setColor("black");
		}
		else if(dice == 2){
			it = 2;
			Player2.setColor("black");
		}
		else if(dice == 3){
			it = 3;
			Player3.setColor("black");
		}


		if(start==2){
			while (true){
				Zen.setBackground("sky blue");

				Player2.draw();
				Player1.draw();
				if(threePlayers){
					Player3.draw();
				}
				//-----------------------				

				if(Zen.isKeyPressed("up") && Player1.getY() > 25){
					Player1.changeY(-Player1Speed);
				}
				if(Zen.isKeyPressed("down") && Player1.getY() < 675){
					Player1.changeY(Player1Speed);
				}
				if(Zen.isKeyPressed("right") && Player1.getX() < 1255){
					Player1.changeX	(Player1Speed);
				}
				if(Zen.isKeyPressed("left") && Player1.getX() > 25){
					Player1.changeX(-Player1Speed);
				}
				//-----------------------				

				if(Zen.isKeyPressed("w") && Player2.getY() > 25){
					Player2.changeY(-Player2Speed);
				}
				if(Zen.isKeyPressed("s") && Player2.getY() < 675){
					Player2.changeY(Player2Speed);
				}
				if(Zen.isKeyPressed("d") && Player2.getX() < 1255){
					Player2.changeX(Player2Speed);
				}
				if(Zen.isKeyPressed("a") && Player2.getX() > 25){
					Player2.changeX(-Player2Speed);
				}
				//-----------------------				

				if(Zen.isKeyPressed("y") && Player3.getY() > 25){
					Player3.changeY(-Player3Speed);
				}
				if(Zen.isKeyPressed("h") && Player3.getY() < 675){
					Player3.changeY(Player3Speed);
				}
				if(Zen.isKeyPressed("j") && Player3.getX() < 1255){
					Player3.changeX(Player3Speed);
				}
				if(Zen.isKeyPressed("g") && Player3.getX() > 25){
					Player3.changeX(-Player3Speed);
				}
				//-----------------------				
				if(Player1.getY()<30){
					Player1.setY(660);
				}
				if(Player1.getY()>670){
					Player1.setY(45);
				}

				if(Player1.getX()<30){
					Player1.setX(1240);
				}

				if(Player1.getX()>1250){
					Player1.setX(45);
				}
				//-----------------------				

				if(Player2.getY()<30){
					Player2.setY(660);
				}
				if(Player2.getY()>670){
					Player2.setY(45);
				}

				if(Player2.getX()<30){
					Player2.setX(1240);
				}

				if(Player2.getX()>1250){
					Player2.setX(45);
				}
				//-----------------------				

				if(threePlayers){
					if(Player3.getY()<30){
						Player3.setY(660);
					}
					if(Player3.getY()>670){
						Player3.setY(45);
					}

					if(Player3.getX()<30){
						Player3.setX(1240);
					}

					if(Player3.getX()>1250){
						Player3.setX(45);
					}
				}

				//-----------------------				



				if(it==1 && Player1.distanceTo(Player2)<=40){
					Player2.setColor("black");
					Player1.setColor("green");

					Player1.setX(960);
					Player2.setX(320);
					Player3.setX(player3X);

					Player1.setY(350);
					Player2.setY(350);
					Player3.setY(350);

					p2itTimes = 30;

					it=2;
				}
				else if(it==1 && Player1.distanceTo(Player3)<=40){
					Player3.setColor("black");
					Player1.setColor("green");

					Player1.setX(960);
					Player2.setX(320);
					Player3.setX(player3X);

					Player1.setY(350);
					Player2.setY(350);
					Player3.setY(350);


					p3itTimes = 30;

					it=3;
				}

				if(it==2 && Player2.distanceTo(Player1)<=40){
					Player1.setColor("black");
					Player2.setColor("yellow");

					Player1.setX(960);
					Player2.setX(320);
					Player3.setX(player3X);

					Player1.setY(350);
					Player2.setY(350);
					Player3.setY(350);


					p1itTimes = 30;

					it=1;
				}
				else if(it==2 && Player2.distanceTo(Player3)<=40){
					Player3.setColor("black");
					Player2.setColor("yellow");

					Player1.setX(960);
					Player2.setX(320);
					Player3.setX(player3X);

					Player1.setY(350);
					Player2.setY(350);
					Player3.setY(350);


					p3itTimes = 30;

					it=3;
				}

				if(it==3 && Player3.distanceTo(Player1)<=40){
					Player1.setColor("black");
					Player3.setColor("white");

					Player1.setX(960);
					Player2.setX(320);
					Player3.setX(player3X);

					Player1.setY(350);
					Player2.setY(350);
					Player3.setY(350);


					p1itTimes = 30;

					it=1;
				}
				else if(it==3 && Player3.distanceTo(Player2)<=40){
					Player2.setColor("black");
					Player3.setColor("white");

					Player1.setX(960);
					Player2.setX(320);
					Player3.setX(player3X);

					Player1.setY(350);
					Player2.setY(350);
					Player3.setY(350);


					p2itTimes = 30;

					it=2;
				}

				if(p1itTimes>0){
					Player1Speed = 0;
				}

				if(p1itTimes<=0){
					Player1Speed = 20;
				}
				if(p2itTimes>0){
					Player2Speed = 0;
				}

				if(p2itTimes<=0){
					Player2Speed = 20;
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

	}
}