package tag;

public class RunMe {

	public static void main(String[] args) {
		Wand elderWand = new Wand();
		Wand theWand = new Wand();
		theWand.lift();
		elderWand.lift();
		System.out.println(elderWand.power);
		elderWand.madeByOllivander();
		System.out.println(elderWand.power);
		
	}

}
