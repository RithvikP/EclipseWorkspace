package chatClient;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;

public class ChatClient {
	JFrame frame;

	public static final int length=700;
	public static final int width=700;


	static String clientName="Chat Client";

	public static void main (String args[]){

		setFirstJFrame();


	}


	public static void setFirstJFrame(){
		JFrame frame=new JFrame(clientName);
		frame.setSize(length,width);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		frame.setLayout(null);
		
		

		frame.setVisible(true);






	}

}