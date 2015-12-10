package CaptureTheFlag;

import zen.core.Zen;

public class Driver {

	public static void main(String[] args) {
		Zen.connect("Eclipse");
		
		/*Zen.write("blueflagx", 975);
		Zen.write("blueflagy", 250);
		Zen.write("blueflag owner", "nobody");
		
		Zen.write("redflagx", 25);
		Zen.write("redflagy", 250);
		Zen.write("redflag owner", "nobody");*/
		
		Field field = new Field();
		field.setSize(1000, 500);
		field.setName("Capture The Flag");
		field.setFPS(20);
		field.run();
	}

}
