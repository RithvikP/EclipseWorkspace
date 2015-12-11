package QuizFOSS;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.*;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;

/**
 * @author Rithvik
 */

public class FOSSQuiz {

	static int questionAt=-1;

	static String systemFont="Trebuchet";

	static String[][] questions= {
			{"D","What is FOSS?","A. A type of moss. ","B. Friedrech Obermann Syllable Syndrome",
				"C. Fast only software system","D. Free and Open Source Software"},{"C","What is a type"
						+ " of FOSS software" ,"A. Windows","B. Sublime Text","C. Eclipse","D. Safari"},
			{"A","Is FOSS free?" ,"A. Yes, for everyone", "B. No", "C. Yes, If you change its code",
			"D. Yes, if you are a student"},{"B","Can anyone edit the source code of"
					+ " a FOSS program?", "A. Yes, if you pay money","B. Yes, anyone can.",
					"C. Yes, if you are a professional developer","D. No"},{"B","Who invented the linux "
							+ "kernel?", "A. Steve Jobs","B. Linus Torvalds","C. Larry Page","D. Linus Roache"},
			{"A","What is the icon for Linux","A. A penguin","B. A leopard","C. A computer",
			"D. A window"},{"C","Which of these is a Linux Distribution?","A. Windows","B. Solaris"
				,"C. Debian","D. Mac OS X"},{"D","What is open source software?","A. Software whose "
						+ "code is availabe if paid for","B. Software whose code is openly availabe but "
								+ "uneditable.","C. Software whose code is openly availabe and editable but "
										+ "unshareable.","D. Software whose code is openly available, editabl"
												+ "e and shareable"}
				,{"B","Which of these OSes are open source?","A. Windows","B. Android","C. BB10","D. IOS"},
				{"C","What is FOSS ASIA","A. A search engine","B. A moss cultivating company","C. "
					+"A company that brings people together to make things with open technologies",
					"D. An electirc component manufacturer"}

	};


	static int[] points=new int[10];

	static JFrame frame;

	public static void main(String args[]){
		frame = new JFrame("FOSS Game");
		//Set up the JFrame and create the splash screen
		initialize();
		frame.setVisible(true);

	}

	private static void initialize() {
		frame.setSize(600,600);
		frame.setLayout(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


		//Set up the first text screen
		JLabel label = new JLabel("",SwingConstants.CENTER);
		label.setText("Welcome to the Quiz.");
		label.setBounds(0,0, 600, 480);
		label.setFont(new Font(systemFont,1,40));
		label.setOpaque(true);
		label.setBackground(Color.cyan);

		//Set up the start button
		JButton button = new JButton("Start");
		button.setBounds(0, 480, 600, 100);
		button.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				button.setVisible(false);
				label.setVisible(false);
				question();
			}
		});

		button.setOpaque(true);
		button.setBackground(Color.green);
		button.setBorderPainted(false);
		button.setFont(new Font(systemFont,1,40));

		//Add components to the JFrame
		frame.add(button);
		frame.add(label);
	}

	private static void question() {
		//Choose the question number
		questionAt++;

		//Create buttons
		JButton a = new JButton();
		JButton b = new JButton();
		JButton c = new JButton();
		JButton d = new JButton();

		//Create the text box
		JTextPane pane = new JTextPane();


		a.setVisible(true);
		b.setVisible(true);
		c.setVisible(true);
		d.setVisible(true);
		pane.setVisible(true);



		//setup the question box
		pane.setBounds(0,0,600,150);
		pane.setEditable(false);
		pane.setText(questions[questionAt][1]);
		pane.setFont(new Font(systemFont,1,40));
		pane.setOpaque(true);
		pane.setBackground(Color.cyan);
		StyledDocument sdoc = pane.getStyledDocument();
		SimpleAttributeSet center = new SimpleAttributeSet();
		StyleConstants.setAlignment(center, StyleConstants.ALIGN_CENTER);
		sdoc.setParagraphAttributes(0, sdoc.getLength(), center, false);

		System.out.println(questionAt);

		//Setup a button------------------
		a.setText(questions[questionAt][2]);
		a.setBounds(0, 150, 300, 225);
		a.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				a.setBorderPainted(false);
				//Add Right or Wrong colors and add to the points array
				if(questions[questionAt][0].equals("A")){
					a.setBackground(Color.green);
					points[questionAt]=1;
				}
				else{
					a.setBackground(Color.red);
					points[questionAt]=0;

					//Show the right answer
					if(questions[questionAt][1].equals("B")){
						b.setBorderPainted(false);
						b.setBackground(Color.green);
					}
					else if(questions[questionAt][1].equals("C")){
						c.setBorderPainted(false);
						c.setBackground(Color.green);
					}
					else if(questions[questionAt][1].equals("D")){
						d.setBorderPainted(false);
						d.setBackground(Color.green);
					}
				}
				if(questionAt<9){
					frame.remove(a);
					frame.remove(b);
					frame.remove(c);
					frame.remove(d);
					question();
				}
				else{
					a.setVisible(false);
					b.setVisible(false);
					c.setVisible(false);
					d.setVisible(false);
					pane.setVisible(false);
					endScreen();


				}

			}
		});
		a.setOpaque(true);
		a.setBackground(Color.white);
		a.setBorderPainted(true);
		a.setFont(new Font(systemFont,1,20));

		//Setup b button-------------------
		b.setText(questions[questionAt][3]);
		b.setBounds(300, 150, 300, 225);
		b.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				b.setBorderPainted(false);
				//Add Right or Wrong colors and add to the points array
				if(questions[questionAt][0].equals("B")){
					b.setBackground(Color.green);
					points[questionAt]=1;

				}
				else{
					b.setBackground(Color.red);
					points[questionAt]=0;
					//Show the right answer
					if(questions[questionAt][1].equals("A")){
						a.setBorderPainted(false);
						a.setBackground(Color.green);
					}
					else if(questions[questionAt][1].equals("C")){
						c.setBorderPainted(false);
						c.setBackground(Color.green);
					}
					else if(questions[questionAt][1].equals("D")){
						d.setBorderPainted(false);
						d.setBackground(Color.green);
					}
				}
				if(questionAt<9){
					frame.remove(a);
					frame.remove(b);
					frame.remove(c);
					frame.remove(d);
					question();
				}
				else{
					a.setVisible(false);
					b.setVisible(false);
					c.setVisible(false);
					d.setVisible(false);
					pane.setVisible(false);
					endScreen();
				}

			}


		});
		b.setOpaque(true);
		b.setBackground(Color.white);
		b.setBorderPainted(true);
		b.setFont(new Font(systemFont,1,20));

		//Setup c button---------------------
		c.setText(questions[questionAt][4]);
		c.setBounds(0, 375, 300, 225);
		c.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				c.setBorderPainted(false);
				//Add Right or Wrong colors and add to the points array
				if(questions[questionAt][0].equals("C")){
					c.setBackground(Color.green);
					points[questionAt]=1;
					if(questionAt<10){
						frame.remove(a);
						frame.remove(b);
						frame.remove(c);
						frame.remove(d);
						question();
					}
				}
				else{
					c.setBackground(Color.red);
					points[questionAt]=0;
					//Show the right answer
					if(questions[questionAt][1].equals("B")){
						b.setBorderPainted(false);
						b.setBackground(Color.green);
					}
					else if(questions[questionAt][1].equals("A")){
						a.setBorderPainted(false);
						a.setBackground(Color.green);
					}
					else if(questions[questionAt][1].equals("D")){
						d.setBorderPainted(false);
						d.setBackground(Color.green);
					}
				}
				if(questionAt<9){
					frame.remove(a);
					frame.remove(b);
					frame.remove(c);
					frame.remove(d);
					question();
				}

				else{
					a.setVisible(false);
					b.setVisible(false);
					c.setVisible(false);
					d.setVisible(false);
					pane.setVisible(false);
					endScreen();
				}

			}
		});
		c.setOpaque(true);
		c.setBackground(Color.white);
		c.setFont(new Font(systemFont,1,20));

		//Setup d button---------------------
		d.setText(questions[questionAt][5]);
		d.setBounds(300, 375, 300, 225);
		d.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				d.setBorderPainted(false);
				//Add Right or Wrong colors and add to the points array
				if(questions[questionAt][0].equals("D")){
					d.setBackground(Color.green);
					points[questionAt]=1;
					if(questionAt<10){
						question();
					}
				}
				else{
					d.setBackground(Color.red);
					points[questionAt]=0;
					//Show the right answer
					if(questions[questionAt][1].equals("A")){
						a.setBorderPainted(false);
						a.setBackground(Color.green);
					}
					else if(questions[questionAt][1].equals("C")){
						c.setBorderPainted(false);
						c.setBackground(Color.green);
					}
					else if(questions[questionAt][1].equals("B")){
						b.setBorderPainted(false);
						b.setBackground(Color.green);
					}
				}
				if(questionAt<9){
					frame.remove(a);
					frame.remove(b);
					frame.remove(c);
					frame.remove(d);
					question();
				}

				else{
					a.setVisible(false);
					b.setVisible(false);
					c.setVisible(false);
					d.setVisible(false);
					pane.setVisible(false);
					endScreen();
				}

			}
		});
		d.setOpaque(true);
		d.setBackground(Color.white);
		d.setBorderPainted(true);
		d.setFont(new Font(systemFont,1,20));

		//Add components to the JFrame
		frame.add(pane);
		frame.add(a);
		frame.add(b);
		frame.add(c);
		frame.add(d);

	}
	private static void endScreen() {

	}

}
