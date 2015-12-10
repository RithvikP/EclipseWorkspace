package Programs;


import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Scanner;

/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/

/**
 *
 * @author Rithvik
 */
public class HashTable {
    public static void main (String args[]){
        Hashtable information = new Hashtable();
        Scanner keyboard = new Scanner(System.in);
        Enumeration keys;
        
        for(int i=0;i<5;i++){
            System.out.println("Input address.");
            String address=keyboard.nextLine();
            System.out.println("Input phone number.");
            String phoneNumber=keyboard.nextLine();
            
            information.put(address,phoneNumber);
            
        }
        
        keys=information.keys(); 
       
        for(int j=0;j<5;j++){
            String key = (String) keys.nextElement();
            System.out.println(key+" "+information.get(key));
            
        }
        
    }
    
}
