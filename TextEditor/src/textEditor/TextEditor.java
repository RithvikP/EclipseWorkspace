package textEditor;

import java.awt.Font;
import java.awt.Toolkit;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;


//Text editor class that is a type of JFrame
public class TextEditor extends JFrame implements ActionListener{
	//The Text Editor class owns a text area
	int caretPosition;
	String Text;
	JTextArea area;

	File myFile;
	boolean writtenToFileAlready = false;

	public static void main(String[] args) {
		new TextEditor();
	}
	//When the program is run, a new object is made using this class
	//Constructor for a new text editor

	int size;

	public TextEditor(){
		//Tell JFrame's constructor to run
		super("Text Editor");
		setSize(700, 700);

		initialize();

		//make the JFrame visible
		setVisible(true);
		
		
	}

	private void initialize() {
		area = new JTextArea(30,20);
		add(area);


		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JMenuBar bar = new JMenuBar();
		setJMenuBar(bar);



		//---------------------------------
		JMenu fileMenu = new JMenu("File");

		String[] file = {"New","Open","Save","Save as","Quit","Print"};

		for(String f: file){
			JMenuItem f1 = new JMenuItem(f);
			f1.setActionCommand(f);
			f1.addActionListener(this);
			fileMenu.add(f1);
		}
		//----------------------------------
		JMenu editMenu = new JMenu("Edit");

		String[] edit = {"Undo","Redo","Copy","Cut","Paste","Shakesperian", "Find"};


		for(String e: edit){
			JMenuItem e1 = new JMenuItem(e);
			e1.setActionCommand(e);
			e1.addActionListener(this);
			editMenu.add(e1);
		}
		//--------------------------------
		JMenu formatMenu = new JMenu("Format");

		String[] format = {"Font","Bold","Italic","Underline","Strikethrough",
				"Superscript","Subscript","Lowercase","Uppercase", "Clear Formatting"};


		for(String fo: format){
			JMenuItem fo1 = new JMenuItem(fo);
			fo1.setActionCommand(fo);
			fo1.addActionListener(this);
			formatMenu.add(fo1);
		}
		//-----------------------------------
		/*//Make a filter menu
		JMenu filterMenu = new JMenu("Filters");

		String[] filters = {};

		for(String fi: filters){
			JMenuItem fi1 = new JMenuItem(fi);
			fi1.setActionCommand(fi);
			fi1.addActionListener(this);
			filterMenu.add(fi1);
		}
		*/
		

		//----------------------------------
		
		bar.add(fileMenu);
		bar.add(editMenu);
		bar.add(formatMenu);
		//bar.add(filterMenu);
		

}

	//-------------------------------	
	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println(e.getActionCommand());

		if(e.getActionCommand().equals("Cut")) {
			Cut();
		}

		if(e.getActionCommand().equals("New")) {
			new TextEditor();
		}

		if(e.getActionCommand().equals("Save as")){
			saveFileAs();
		}

		if(e.getActionCommand().equals("Open")){
			openFile();
		}

		if(e.getActionCommand().equals("Save")){
			saveFile();
		}
		if(e.getActionCommand().equals("Quit")){
			quit();
		}

		if(e.getActionCommand().equals("Print")){

		}

		if(e.getActionCommand().equals("Undo")){
			undo();
		}

		if(e.getActionCommand().equals("Copy")) {
			Copy();
		}

		if(e.getActionCommand().equals("Paste")){
			Paste();
		}

		if(e.getActionCommand().equals("Font")){
			Font();
		}
		
		if(e.getActionCommand().equals("Bold")){
			Bold();
		}

		if(e.getActionCommand().equals("Lowercase")){
			lowercase();
		}
		if(e.getActionCommand().equals("Uppercase")){
			uppercase();
		}
		if(e.getActionCommand().equals("Shakesperian")){
			Shakesperian();
		}
	}
	//-----------------------------------

	

	public void openFile(){

		JFileChooser chooser = new JFileChooser();
		int result = chooser.showOpenDialog(this);
		if(result == JFileChooser.APPROVE_OPTION){
			File f = chooser.getSelectedFile();
			try {
				String content = ("");
				Scanner s = new Scanner(f);
				//While there is another line of input, append a line of input
				while(s.hasNextLine()){
					//\n adds a new line
					content = content + "\n" + s.nextLine();
				}
				area.setText(content);
			} catch (FileNotFoundException e) {
				System.out.println("Not a file.");
				//e.printStackTrace();
			}
		}
	}



	public void saveFile(){
		JFileChooser chooser = new JFileChooser();
		int result = chooser.showSaveDialog(this);
		if(!writtenToFileAlready){
			result = chooser.showSaveDialog(this);
		}

		if(result == JFileChooser.APPROVE_OPTION){
			File file = chooser.getSelectedFile();

			// if file doesnt exists, then create it
			if (!file.exists()) {
				try {
					file.createNewFile();
					FileWriter fw = new FileWriter(file.getAbsoluteFile());
					BufferedWriter bw = new BufferedWriter(fw);
					bw.write(area.getText());
					bw.close();
					writtenToFileAlready = true;
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}



		}
	}

	public void saveFileAs(){
		JFileChooser chooser = new JFileChooser();
		int result = chooser.showSaveDialog(this);
		if(result == JFileChooser.APPROVE_OPTION){
			File file = chooser.getSelectedFile();

			// if file doesn't exists, then create it
			try {
				FileWriter fw = new FileWriter(file.getAbsoluteFile());
				BufferedWriter bw = new BufferedWriter(fw);
				bw.write(area.getText());
				bw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}


	private void Cut() {
		
		
		Text = area.getSelectedText();
		String areaContent = area.getText();
		areaContent = areaContent.replaceAll(" " + area.getSelectedText(),"");
		area.setText(areaContent);
		
	}

	private void undo() {

	}


	private void Copy() {
		Text = area.getSelectedText();

	}

	private void Paste() {
		area.insert(Text, area.getCaretPosition());
		
	}



	private void quit() {
		WindowEvent wev = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
		Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(wev);
	}


	private void Font() {
		
		String font = JOptionPane.showInputDialog("What font?");
		
		String input = JOptionPane.showInputDialog("What size?");
		
		int s = Integer.parseInt(input);
		Font f = new Font(font, 0, s);
		size = s;
		
		
		area.setFont(f);
	}
	
	private void Bold() {
		
	}

	private void lowercase() {
		/*//Get Whatever is in the text area
		String content = area.getText();
		//Mess with it
		content = content.toLowerCase();
		//Put it back in
		area.setText(content);*/
		
		int start = area.getSelectionStart();
		int end = area.getSelectionEnd();
		String replace = area.getSelectedText().toLowerCase();
		area.replaceRange(replace, start, end);
		
		
		
	}

	private void uppercase() {
		/*//Get Whatever is in the text area
		String content = area.getText();
		//Mess with it
		content = content.toUpperCase();

		//Put it back in
		area.setText(content);*/
		
		int start = area.getSelectionStart();
		int end = area.getSelectionEnd();
		String replace = area.getSelectedText().toUpperCase();
		area.replaceRange(replace, start, end);
	
		
	}

	private void Shakesperian() {
		//Get Whatever is in the text area
		String content = area.getSelectedText();
		int start = area.getSelectionStart();
		int end = area.getSelectionEnd();
		//Mess with it
		//the (?i) makes something case insensitive
		content = content.replaceAll("(?i)\\byou\\b","thou");
		content = content.replaceAll("(?i)\\byour\\b","thy");
		content = content.replaceAll("(?i)\\bdo\\b","doth");
		content = content.replaceAll("(?i)\\bhas\\b","hath");
		content = content.replaceAll("(?i)\\bare\\b","art");


		//Put it back in
		//area.setText(content);
		
		area.replaceRange(content, start, end);
	}

	

}


