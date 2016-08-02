package communicationClient;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;

import com.firebase.client.DataSnapshot;
import com.firebase.client.Firebase;
import com.firebase.client.FirebaseError;
import com.firebase.client.ValueEventListener;


public class Client extends Encrypt{

	JTextArea areaSend;
	JTextArea areaSee;

	JLabel sendLabel;
	JLabel seeLabel;
	JLabel message;

	JButton sendDone;
	JButton seeDone;

	JFrame SCC = new JFrame("Secure Communications Client");
	JFrame SEM = new JFrame("Send a Message");
	JFrame SEEM = new JFrame("See your Message");
	JFrame showMessage= new JFrame("Message");

	Firebase myFirebaseRef = new Firebase("https://securecommunication.firebaseio.com/");

	Font f = new Font("Arial",0,40);

	static ArrayList<String>encryptedState=new ArrayList<String>();

	String whoseMessage;
	String sendCipher;
	String seeCipher;
	String sendMessage;

	String computer="computer1";

	private static final long serialVersionUID = -9129944323140495149L;

	public static void main(String[] args) {

		//When the program is run, a new object is made using this class
		new Client();

	}

	public Client(){

		SCC.setSize(700, 700);

		initialize();

		SCC.setVisible(true);
	}

	private void initialize() {

		SCC.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		//create a JButton for sending a message
		JButton SendMessage = new JButton("Send a Message");
		SendMessage.setFont(f);

		//create a JButton for seeing a message
		JButton SeeMessage = new JButton("See your Message");
		SeeMessage.setFont(f);

		SCC.setLayout(null);

		//actionListener for SendMessage button
		SendMessage.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				System.out.println("Send");

				sendCipher();
			}
		});

		//actionListener for SeeMessage button
		SeeMessage.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				System.out.println("Recieve");

				enterWhoseMessage();
			}
		});


		SCC.add(SendMessage);
		SCC.add(SeeMessage);

		//Size and location of buttons is set
		SendMessage.setBounds(0, 0, 350, 700);
		SeeMessage.setBounds(350, 0, 350, 700);

	}

	public void sendCipher() {

		//set up JFrame
		SEM.setSize(700,700);
		SEM.setVisible(true);
		SEM.setLayout(null);

		//JLabel with instructions for user
		sendLabel=new JLabel("Please enter the cipher key.");
		sendLabel.setSize(700, 200);
		sendLabel.setLocation(0, 0);
		sendLabel.setFont(f);
		SEM.add(sendLabel);

		//JTextArea is the user's input box
		areaSend = new JTextArea();
		areaSend.setSize(700, 300);
		areaSend.setLocation(0, 200);
		areaSend.setLineWrap(true);
		SEM.add(areaSend);

		//Done button
		sendDone = new JButton("Done");
		sendDone.setFont(new Font("Arial", Font.PLAIN, 40));
		sendDone.setSize(700, 200);
		sendDone.setLocation(0, 500);


		//add actionListener
		sendDone.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				sendCipher=areaSend.getText();
				sendLabel.setVisible(false);
				sendDone.setVisible(false);

				writeMessage();
			}
		});

		SEM.add(sendDone);
	}

	public void enterWhoseMessage() {
		//set up JFrame
		SEEM.setSize(700,700);
		SEEM.setVisible(true);
		SEEM.setLayout(null);

		//JLabel with instructions for user
		seeLabel=new JLabel("Please enter whose message you want to see.");
		seeLabel.setSize(700, 200);
		seeLabel.setLocation(0, 0);
		seeLabel.setFont(new Font("Arial",0,32));
		SEEM.add(seeLabel);

		//JTextArea is the user's input box
		areaSee = new JTextArea();
		areaSee.setSize(700, 300);
		areaSee.setLocation(0, 200);
		areaSee.setLineWrap(true);
		SEEM.add(areaSee);

		//Done button
		seeDone = new JButton("Done");
		seeDone.setFont(new Font("Arial", Font.PLAIN, 40));
		seeDone.setSize(700, 200);
		seeDone.setLocation(0, 500);

		//add actionListener
		seeDone.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				whoseMessage=areaSee.getText();
				seeLabel.setVisible(false);
				seeDone.setVisible(false);
				enterSeeCipher();
			}
		});

		SEEM.add(seeDone);
	}

	public void writeMessage(){
		//JLabel with instructions for user
		JLabel writeLabel=new JLabel("Please enter your message");
		writeLabel.setSize(700, 200);
		writeLabel.setLocation(0, 0);
		writeLabel.setFont(f);
		SEM.add(writeLabel);

		//encrypt button
		JButton encryptButton = new JButton("Done");
		encryptButton.setFont(new Font("Arial", Font.PLAIN, 40));
		encryptButton.setSize(700, 200);
		encryptButton.setLocation(0, 500);

		//add actionListener
		encryptButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				myFirebaseRef.child(computer).setValue(areaSend.getText()/*encryptAndReturn(sendCipher,areaSend.getText())*/);
			}
		});

		SEM.add(encryptButton);

		//reset JTextArea
		areaSend.setText("");
	}

	public void enterSeeCipher(){
		//JLabel with instructions for user
		JLabel seeCipherLabel=new JLabel("Please enter the cipher key.");
		seeCipherLabel.setSize(700, 200);
		seeCipherLabel.setLocation(0, 0);
		seeCipherLabel.setFont(f);
		SEEM.add(seeCipherLabel);


		//reset JTextArea
				areaSee.setText("");

		//Decrypt button
		JButton decryptButton = new JButton("Done");
		decryptButton.setFont(new Font("Arial", Font.PLAIN, 40));
		decryptButton.setSize(700, 200);
		decryptButton.setLocation(0, 500);


		//add actionListener
		decryptButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				seeCipherLabel.setVisible(false);
				decryptButton.setVisible(false);
				areaSee.setVisible(false);

				//outputs requested data
				myFirebaseRef.child("/"+whoseMessage).addValueEventListener(new ValueEventListener() {
					public void onDataChange(DataSnapshot snapshot) {

						//JLabel with message
						message=new JLabel((String) snapshot.getValue());
						message.setSize(700,700);
						message.setLocation(0,0);
						message.setFont(new Font("Arial",0,16));

						//Set up JFrame
						showMessage.setSize(700,700);
						showMessage.setVisible(true);
						showMessage.setLayout(null);
						showMessage.add(message);
						SEEM.dispose();
					}
					public void onCancelled(FirebaseError error) { }
				});
			}
		});

		SEEM.add(decryptButton);


	}
}
