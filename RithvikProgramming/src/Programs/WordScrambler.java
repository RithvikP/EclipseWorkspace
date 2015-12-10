package Programs;

import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JTextArea;

import zen.core.Zen;


public class WordScrambler extends JFrame{

	static JTextArea area;


	public static void main(String[] args) {

		new WordScrambler();

		Scramble();

	}



	public WordScrambler(){
		//Tell JFrame's constructor to run
		super("Word Scrambler");
		setSize(700, 700);

		initialize();

		//make the JFrame visible
		setVisible(true);
	}

	private void initialize() {
		area = new JTextArea(30,20);
		add(area);
	}

	private static void Scramble() {
		ArrayList<String>Poem = new ArrayList<String>();
		Poem.add("I am awesome");
		StringBuilder sb = new StringBuilder();
		for(String word: Poem){
		    if(sb.length() > 0){
		        sb.append(',');
		    }
		    sb.append(Poem);
		}
		
		
		System.out.println(Poem);
		
		String content = area.getText();

	}

}
