package communicationClient;

import com.firebase.client.DataSnapshot;
import com.firebase.client.Firebase;
import com.firebase.client.FirebaseError;
import com.firebase.client.ValueEventListener;

public class Server {
	static boolean returnWhat=false;
	
	static Firebase ref=new Firebase("https://reminderhackathon.firebaseio.com/");
	
	public static void main(String args[]){
		/*
		if(checkUsername("nishant","pity"))
		System.out.println("foo");*/
		//addReminder("pizza",0,"nishant");
		ref.child("Test").setValue("h");
		System.out.println("foo");
	}
	
	public static boolean checkUsername(String username, String password){
		
		ref.child("/"+username).addValueEventListener(new ValueEventListener() {
			
			public void onDataChange(DataSnapshot snapshot) {
				String webPassword=(String)snapshot.getValue();
				if(webPassword.equals(password)){
					returnWhat=true;
				}
			}

			@Override
			public void onCancelled(FirebaseError arg0) {
			}
		});
		if(returnWhat==true){ 
			return true;
		}
		
		return false;
	}
	
	public static void addReminder(String reminder, int time, String username){
		ref.child(username).setValue(reminder);
		//ref.child(username).setValue(time);
		
	}
}
