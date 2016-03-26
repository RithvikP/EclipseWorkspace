

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


public class Server{

	static Firebase myFirebaseRef = new Firebase("https://securecommunication.firebaseio.com/");

	

	public static void main(String[] args) {
		myFirebaseRef.child("Test").setValue("h");
		//When the program is run, a new object is made using this class
		

	}

		
}