package Programs;


import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextArea;
import javax.swing.JTextPane;

public class Test implements ActionListener{
	static String title = "Mathemachine";
	static short width=700;
	static short height=650;


	static double Var3X=0;
	static double Var3Y=0;
	static double Var3Z=0;

	static String solveButtonName="Done";
	static String areaName="Please choose what problem you want to be solved";


	static JFrame frame=new JFrame(title);

	static JTextPane pane = new JTextPane();
	static JTextArea area =new JTextArea();
	static JMenuBar bar = new JMenuBar();


	public static void main(String args[]){
		new Test();

	}

	public Test(){

		initialize();
		frame.setVisible(true);
	}

	public void initialize(){
		frame.setLayout(null);
		frame.setSize(width,height);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		pane.setBounds(0,height/2-150,width,height/2);
		area.setBounds(0,0,width,height/2-150);

		area.setText(areaName);

		area.setBackground(Color.LIGHT_GRAY);

		area.setEditable(false);

		//---------------------------------
		JMenu basicMenu = new JMenu("Basic Math");

		String[] basic = {"Add","Subtract","Multiply","Divide","Factorial","Prime Numbers",
				"LCM","GCF"};

		for(String f: basic){
			JMenuItem f1 = new JMenuItem(f);
			f1.setActionCommand(f);
			f1.addActionListener(this);
			basicMenu.add(f1);
		}
		//----------------------------------

		//---------------------------------
		JMenu equationMenu = new JMenu("Equations");

		String[] equation = {"System of 2 variables","System of 3 variables"};

		for(String f: equation){
			JMenuItem f1 = new JMenuItem(f);
			f1.setActionCommand(f);
			f1.addActionListener(this);
			equationMenu.add(f1);
		}
		//----------------------------------
		bar.add(basicMenu);
		bar.add(equationMenu);


		frame.add(pane);
		frame.add(area);
		frame.setJMenuBar(bar);



	}


	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand().equals("System of 2 variables")) {
			System2Var();
		}
		if(e.getActionCommand().equals("System of 3 variables")) {
			System3Var();
		}
	}


	private void System3Var() {
		double x3;double y1; double y2;  double y3;
		double z1; double z2; double z3; double a1; double a2; double a3;
		
		area.setText("Please enter the coeffecient of x for the first equation.");
		
		JButton button = new JButton();
		button.setText(solveButtonName);
		button.setBounds(0,height-150,width,125);
		frame.add(button);
		button.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				double x1=Double.parseDouble(area.getText());
				JButton button = new JButton();
				button.setText(solveButtonName);
				button.setBounds(0,height-150,width,125);
				frame.add(button);
				button.addActionListener(new ActionListener(){
					public void actionPerformed(ActionEvent e){
						double x2=Double.parseDouble(area.getText());
						area.setText("pizza");
						
					}
				});
				
			}
		});
		
		
		/*
		
		double D=(x1*y2*z3+y1*z2*x3+z1*x2*y3)-(x3*y2*z1+y3*z2*x1+z3*x2*y1);
		double Dx=(a1*y2*z3+y1*z2*a3+z1*a2*y3)-(a3*y2*z1+y3*z2*a1+z3*a2*y1);
		double Dy=(x1*a2*z3+a1*z2*x3+z1*x2*a3)-(x3*a2*z1+a3*z2*x1+z3*x2*a1);
		double Dz=(x1*y2*a3+y1*a2*x3+a1*x2*y3)-(x3*y2*a1+y3*a2*x1+a3*x2*y1);
		Var3X=Dx/D;
		Var3Y=Dy/D;
		Var3Z=Dz/D;
*/

	}

	private void System2Var() {
		// TODO Auto-generated method stub

	}

}



