import java.lang.Math;
public class Game
{
   public int score;
   public int highscore;
   private Player player;

   public static int Score()
   {
      Dice roll1=new getRandomRoll();
      Dice roll2=new getRandomRoll();
      Dice roll3=new getRandomRoll();
      Dice roll4=new getRandomRoll();
      Dice roll4=new getRandomRoll();
      roll1*roll2=score;
      score/roll3=score;
      score+roll4=score;
      score-roll5=score;
      return score;
   }
   
   public Players()
   {
         play=new Player("Sam");
   }
      
   public String toString()
   {  
      String str="Player:"+player+"has a score of"+score;
      return str;
   }
 

}