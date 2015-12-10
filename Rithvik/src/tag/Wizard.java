package tag;

public class Wizard {
	String name;
	Wand myWand;
	
	public void sayName(){
		System.out.println("I am " + name);
	}
	
	
	public void becomeWizard(){
		myWand = new Wand();
	}
}
