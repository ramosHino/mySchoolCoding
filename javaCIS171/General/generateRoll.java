// using java.util.Random; 
import java.util.Random; 
  
public class generateRoll
{ 
  
    public static void main(String args[]) 
    { 
         Random rand = new Random();
         int roll = rand.nextInt(6)+1;
         System.out.println("Random Integers: "+roll);
         
      
    }
} 