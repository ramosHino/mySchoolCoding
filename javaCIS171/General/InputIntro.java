import javax.swing.JOptionPane;
import java.util.Scanner;
public class InputIntro

{
   public static void main(String [] args )
   {
      System.out.println("Test" + 2 + 5 );
      System.out.println("Test" + (2+5));
      byte littleInt=22;
      long debt=22540969256125L; // you need the L because it won't recognize it as a long at first
      boolean wantPizza=true;
      int age=2;
      boolean isAdult = (age>=18);
      System.out.println(littleInt);
      System.out.println(debt);
      System.out.println(isAdult);
      float num=2.549F; // important when trying to conserve memory add the F at the end
      String name ="Joe";
      char myline='\n';
      char myquote='\"';
      System.out.println( "Hello" + name + myline + "You rock" + myquote);
      Scanner Keyboard = new Scanner(System.in);
      
      System.out.println("Enter a byte: ");
      byte inbyte= Keyboard.nextByte();
      System.out.println("Your byte is " + inbyte);
      
      System.out.println("Enter a float: ");
      float infloat= Keyboard.nextFloat();
      System.out.println("Your float is: " + infloat);

      System.out.println("Enter a string: ");
      String message= Keyboard.nextLine();
      Keyboard.nextLine();
      System.out.println(message);
      
      char intial;
      System.out.println("Enter your initial");
              message =Keyboard.nextLine();
              intial = message.charAt(0);
      System.out.println("--"+intial+"--");
            
      
      name=JOptionPane.showInputDialog("Enter your name");
      JOptionPane.showMessageDialog(null,"Hello " +name);
      int num1,num2;
      String input;
      input=JOptionPane.showInputDialog("Enter a number");
      num1=Integer.parseInt(input);
      
      input=JOptionPane.showInputDialog("Enter a number");
      num2=Integer.parseInt(input);
      String myformat=String.format("\n Hey %d \t %.2f", 26,1.275);
      JOption.Pane.showMessageDialog(null,myformat);
  
     }
}