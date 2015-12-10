package Utilities;
import java.util.Random;

public class Number {
    public static boolean isNumber(String input){
        try{
            Integer.parseInt(input);
        }
        catch(Exception e){
            return false;
        }
        return true;
    }
    
    public static int[] randomNumber(int maxNumber,int howMany){
    	int[] numbers=new int[howMany];
    	for(int i=0;i<howMany;i++){
    		Random rand=new Random();
    		numbers[i]=rand.nextInt(maxNumber+1);
    	}
    	return numbers;
    	
    }
    
}
