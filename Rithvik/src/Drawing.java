import zen.core.Zen;


public class Drawing {

	public static void main(String[] args) {
		//Connect to the "room" named Vex
		Zen.connect("vex");
		
		//Create a window
		//There is a maximum width and height for the window
		Zen.create(500, 500);
		
		//Drawing a scene
		
		Zen.setBackground("light blue");
		
		Zen.setColor("green");
		//4 numbers are the coordinates of the top left corner and the width and height
		//(x,y,width,height)
		
		Zen.fillOval(50,25,100,150);
		
		Zen.fillRect(0, 400, 500, 100);
		
		Zen.setColor("gray");
		Zen.fillRect(82,165,35,250);
	
		//Pauses (milliseconds)
		//Zen.sleep(100);
		//Zen.dice rolls a dice (x) is the number of sides of the dice
		//Zen.fillOval(Zen.getMouseX(),Zen.getMouseY(),Zen.getZenHeight(),Zen.dice(10));
	
		Zen.sleep(1000);
		
		Zen.setColor("yellow");
		
		//while (1+2 == 3)
		while(10 > 9){
			
			Zen.sleep(100);
			//Zen.fillOval(Zen.getMouseX(),Zen.getMouseY(),30,30);
			Zen.fillOval( Zen.readInt("chrisx"),Zen.readInt("chrisy"),30,30);
			//Writes in the Internet "room"
			Zen.write("Rithvik x",Zen.getMouseX());
			Zen.write("Rithvik y",Zen.getMouseY());
	
		}

	}

}
