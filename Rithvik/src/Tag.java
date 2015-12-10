import zen.core.Zen;
import zen.shape.Circle;


public class Tag {

	public static void main(String[] args) {
		//Zen.connect("kevin'sGenius");
		int it = 2;
		Zen.create(750,750);
		Circle Rithvik = new Circle(40);
		Circle Chris = new Circle (40);
		Circle Player3 = new Circle (40);
		
		Chris.setX(225);
		Rithvik.setX(425);
		Player3.setX(325);
		
		Chris.setY(225);
		Rithvik.setY(425);
		Player3.setY(325);
		
		Chris.setColor("yellow");
		Rithvik.setColor("green");
		Player3.setColor("white");
		
		
		Zen.setBackground("sky blue");
		
		if(it == 1){
			Rithvik.setColor("black");
			System.out.println("Rithvik is it!");
		}
		
		if(it == 2){
			Chris.setColor("black");
			System.out.println("Chris is it!");
		}
		
		if(it == 3){
			Player3.setColor("black");
			System.out.println("Player 3 is it!");
		}
		
		
		
		while (true){
			Zen.setBackground("sky blue");
			
			Chris.draw();
			Rithvik.draw();
			Player3.draw();
			
			if(Zen.isKeyPressed("up") && Rithvik.getY() > 0){
				Rithvik.changeY(-6);
			}
			if(Zen.isKeyPressed("down") && Rithvik.getY() < 750){
				Rithvik.changeY(6);
			}
			if(Zen.isKeyPressed("right") && Rithvik.getX() < 750){
				Rithvik.changeX(6);
			}
			if(Zen.isKeyPressed("left") && Rithvik.getX() > 0){
				Rithvik.changeX(-6);
			}
			
			if(Zen.isKeyPressed("w") && Chris.getY() > 0){
				Chris.changeY(-6);
			}
			if(Zen.isKeyPressed("s") && Chris.getY() < 750){
				Chris.changeY(6);
			}
			if(Zen.isKeyPressed("d") && Chris.getX() < 750){
				Chris.changeX(6);
			}
			if(Zen.isKeyPressed("a") && Chris.getX() > 0){
				Chris.changeX(-6);
			}
			
			if(Zen.isKeyPressed("y") && Player3.getY() > 0){
				Player3.changeY(-6);
			}
			if(Zen.isKeyPressed("h") && Player3.getY() < 750){
				Player3.changeY(6);
			}
			if(Zen.isKeyPressed("j") && Player3.getX() < 750){
				Player3.changeX(6);
			}
			if(Zen.isKeyPressed("g") && Player3.getX() > 0){
				Player3.changeX(-6);
			}
			
			
			//for multiplayer, it is better to just check who you tag
			if ((it == 1 || it == 3) && (Rithvik.distanceTo(Chris) <= 30 || Player3.distanceTo(Chris) <= 30)){
				it = 2;
				System.out.println("touch");
				//Zen.write("who's it", it);
				Rithvik.setColor("green");
				Chris.setColor("black");
				Player3.setColor("white");
				System.out.println("Chris is it!");
				//Chris.changeX(Zen.getRandomNumber(50,150));
				
			}
			
			if ((it == 2 || it == 3) && (Chris.distanceTo(Rithvik) <= 30 || Player3.distanceTo(Rithvik) <= 30)){
				it = 1;
				System.out.println("touch");
				//Zen.write("who's it", it);
				Rithvik.setColor("black");
				Chris.setColor("yellow");
				Player3.setColor("white");
				System.out.println("Rithvik is it!");
				//Rithvik.changeX(Zen.getRandomNumber(50,150));
			}
			
			if ((it == 2 || it == 1) && (Chris.distanceTo(Player3) <= 30 || Rithvik.distanceTo(Player3) <= 30)){
				it = 3;
				System.out.println("touch");
				//Zen.write("who's it", it);
				Rithvik.setColor("green");
				Chris.setColor("yellow");
				Player3.setColor("black");
				System.out.println("Player 3 is it!");
				//Player3.changeX(Zen.getRandomNumber(50,150));
				
			}
			
			/*//Multiplayer stuff
			Zen.write("Rithvikx", Rithvik.getX());
			Zen.write("Rithviky", Rithvik.getY());
			
			Chris.setX(Zen.readInt("Sumix"));
			Chris.setY(Zen.readInt("Sumiy"));
			
			//Player3.setX(Zen.readInt(""));
			//Player3.setY(Zen.readInt(""));
			
			it = Zen.readInt("who's it");*/
			
			Zen.buffer(27);
			
		}
	}

}
