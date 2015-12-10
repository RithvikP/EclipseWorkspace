package Programs;


import java.util.Scanner;
import java.util.ArrayList;

/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/

/**
 *
 * @author Rithvik
 */
public class PhoneAddressArray {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        ArrayList <String> address= new ArrayList<String>();
        ArrayList <String> phoneNumber= new ArrayList<String>();
        
        
        for(int x = 0; x<5;x++){
            System.out.println("Input address.");
            address.add(keyboard.nextLine());
            System.out.println("Input phone number.");
            phoneNumber.add(keyboard.nextLine());
            
            
        }
        
        for(int i=0;i<5;i++){
            System.out.print("Address: "+ address.get(i) + " ");
            System.out.println("Phone Number: "+phoneNumber.get(i));
        }
        
    }
}
