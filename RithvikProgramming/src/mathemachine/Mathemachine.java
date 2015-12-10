package mathemachine;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextArea;
import javax.swing.JTextPane;

public class Mathemachine implements ActionListener{
	static String title = "Mathemachine";
	static short width=700;
	static short height=700;


	static double Var3X=0;
	static double Var3Y=0;
	static double Var3Z=0;

	static String solveButtonName="Done";
	static String areaName="Please enter the coeffecient of x for the first equation.";


	static JFrame frame=new JFrame(title);

	static JTextPane pane = new JTextPane();
	static JTextArea area =new JTextArea();
	static JButton button = new JButton();
	static JMenuBar bar = new JMenuBar();


	public static void main(String args[]){
		new Mathemachine();

	}

	public Mathemachine(){

		initialize();
		frame.setVisible(true);
	}

	public void initialize(){
		frame.setSize(width,height);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		pane.setBounds(0,height/2-100,width,height/2);
		area.setBounds(0,0,width,height/2-100);
		button.setBounds(0,height-100,width,100);

		button.setText(solveButtonName);
		area.setText(areaName);


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

		frame.add(pane);
		frame.add(button);
		frame.add(area);
		frame.setJMenuBar(bar);



	}
	
	public static void solveFor3VariablesMath(double x1, double x2, double x3, double y1, double y2, double y3, double z1, double z2, double z3, double a1, double a2, double a3){
		double D=(x1*y2*z3+y1*z2*x3+z1*x2*y3)-(x3*y2*z1+y3*z2*x1+z3*x2*y1);
		double Dx=(a1*y2*z3+y1*z2*a3+z1*a2*y3)-(a3*y2*z1+y3*z2*a1+z3*a2*y1);
		double Dy=(x1*a2*z3+a1*z2*x3+z1*x2*a3)-(x3*a2*z1+a3*z2*x1+z3*x2*a1);
		double Dz=(x1*y2*a3+y1*a2*x3+a1*x2*y3)-(x3*y2*a1+y3*a2*x1+a3*x2*y1);
		Var3X=Dx/D;
		Var3Y=Dy/D;
		Var3Z=Dz/D;
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
		// TODO Auto-generated method stub
		
	}

	private void System2Var() {
		// TODO Auto-generated method stub
		
	}

}

