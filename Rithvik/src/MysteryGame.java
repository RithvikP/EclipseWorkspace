import zen.core.Zen;


public class MysteryGame {

	public static void main(String[] args) {
		int x;
		int y;
		int speed;
		int gate;
		int stop;
		
		
		x=175;
		y=275;
		speed= 0;
		gate = 300;
		stop = 1;
		
		
		Zen.create(400,600);
		Zen.setBackground("light blue");
		
		while (stop < 2){
			Zen.sleep(30);
			Zen.setBackground("light blue");
			
			Zen.setColor("yellow");	
			Zen.fillOval(x,y,50,50);
			
			//Draw a gate
			Zen.setColor("green");
			
			Zen.fillRect(gate,0,50,200);
			
			Zen.fillRect(gate,350,50,300);
			gate = gate-2;
			
			y=y+1+speed;
			speed=speed+1;
			
			
			if(Zen.isKeyPressed("up")){
				speed = -12;
			}
			
			if(y<0){
				stop = 7;
			}
			
			if(y>600){
				stop = 7;
			}
			
			
			if(gate<-50){
				gate = 300;
			}
			
		
		}
		
		Zen.fillRect(0,0,400,600);

	}

}
