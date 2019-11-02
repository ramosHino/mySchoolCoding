import java.util.Random;
public class Dice
{
   public int roll;
   public static int getRandomRoll()
   {
         Random rand = new Random();
         int roll = rand.nextInt(6)+1;
         return roll;
   }
   public String toString()
       {  
         String str="ROLL:"+roll ;
         return str;
       }

      
   
}