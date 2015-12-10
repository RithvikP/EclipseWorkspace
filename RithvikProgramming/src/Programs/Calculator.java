package Programs;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;


public class Calculator extends JFrame implements ActionListener {

	JButton one;
	
	public static void main(String[] args) {
		new Calculator();
	}
	
	public Calculator(){
		super("Calculator");
		setSize(400,500);
		initialize();
		setVisible(true);
	}
	
	private void initialize() {
		JTextField field = new JTextField("1",15);
		field.setText("Hello");
		add(field);
		
		one = new JButton();
		field.add(one);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		
	}
	
	

}
