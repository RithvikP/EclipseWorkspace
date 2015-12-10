import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextArea;


public class FrameFun {
	public static void main(String[]args){
		JFrame window = new JFrame("Frame of Fun");
		window.setSize(700,700);
		
		JButton button = new JButton("Woohoo");
		window.add(button);
		
		JTextArea area = new JTextArea(30,50);
		window.add(area);
		
		JMenuBar bar = new JMenuBar();
		JMenu menu = new JMenu("File");
		JMenuItem item = new JMenuItem("new");
		menu.add(item);
		bar.add(menu);
		window.setJMenuBar(bar);
		
		
		window.setVisible(true);
	}
}
