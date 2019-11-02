import java.util.Scanner;
public class PasswordPrgrm2
{   
   public static void main(String[]args)
   {
      String password;
      Scanner input= new Scanner(System.in);
      
      System.out.println("Enter your password");
      password=input.nextLine();
      int passwordLength=password.length();
      
      while (passwordLength<10)
      {
       System.out.println("Invalid: Password has to be at least 10 characters");
       password=input.nextLine();
       passwordLength=password.length();
      }

      
   }
}   





