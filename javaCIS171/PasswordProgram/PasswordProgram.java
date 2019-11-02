import java.util.Scanner;
public class PasswordProgram
{
public static void main(String[]args)
   {
      String password;
      Scanner input= new Scanner(System.in);
      
      System.out.println("Enter your password");
      password=input.nextLine();
      int passwordLength=password.length();
      boolean valid;
      valid=passwordLength>=10;
      //Tests if its more than 10 characters
      
      while (valid==false)
      {
       System.out.println("Invalid: Password has to be at least 10 characters");
       password=input.nextLine();
       passwordLength=password.length();
       valid=passwordLength>=10;

      }
      
      
      /*char char1=password.charAt(0);
      System.out.println("First Character "+ char1);
      
      boolean valid=Character.isDigit(password.charAt(0));
      System.out.println("Boolean value: "+ valid);
      */
      
      boolean  validNum
      int i=0;
      while(validNum==false)
      {
         System.out.println("Invalid: Password has to have a digit ");
         System.out.println("Boolean value:"+ valid);
         password=input.nextLine();
         valid=Character.isDigit(password.charAt(i));
         i++;
      }
      boolean validSpecial=password.matches(".*[~!@#$%^&*()_+{}|:<>?/.,;'\\=`-] .*");

      
      /*
      boolean validLower;
      valid=Character.isLowerCase(password.charAt(i));
      while(valid==false)
      {
         valid=Character.isLowerCase(password.charAt(i));
         System.out.println("Invalid: Password has to have a lower case letter");
         System.out.println("Boolean value:"+ valid);
         password=input.nextLine();
         i++;
      } */
      
           
      /*
      boolean validUpper;
      
      int x=0;
      while(valid==true)
      {
         valid=Character.isDigit(password.charAt(x));
         System.out.println("Invalid: Password has to have a digit Boolean value:"+ valid);
         System.out.println("Boolean value:"+ valid);
         password=input.nextLine();
         x++;
      }      */

      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
               
   }
}