package tag;

public class Wand {
	
	int power = 10;
	
	//this method changes the pwoer of the wand
	public void madeByOllivander(){
		power = power *2;
	}
	
	//this method lets you fly
	public void lift(){
		System.out.println("Wigardium leviosa!");
	}
	// This method checks if you are powerful enough to launch a curse
	//will launch one if you are
	public void curse(){
		if(power > 50){
			System.out.println("Avada kedavra");
			power = power - 5;
		}
		
		else {
			System.out.println("You are not powerful enough.");
		}
	}
	
}
