import java.util.Scanner;
public class PasswordPrgrm2
{   
   public static void main(String[]args)
   {
      String password;
      Scanner input= new Scanner(System.in);
      //String special="!@#$%^&*()_+~{}|:<>?`-=[]\',,./";
      //char[] specialChars=special.toCharArray();
      System.out.println("Enter your password");
      password=input.nextLine();
      int passwordLength=password.length();
      
      
      while (passwordLength<10)
      {
       System.out.println("Invalid: Password has to be at least 10 characters");
       password=input.nextLine();
       passwordLength=password.length();
      }
      boolean validLength=passwordLength>=10;
      boolean validNum=password.matches(".*[0-9].*");
      System.out.println("String has a number: " + validNum);
      boolean validLower=password.matches(".*[a-z].*");
      System.out.println("String has a lower case letter: " + validLower);
      boolean validUpper=password.matches(".*[A-Z].*");
      System.out.println("String has an upper case letter: " + validUpper);
      boolean validSpecial=password.matches(".*[!] .*");
      System.out.println("String has a special character: " + validSpecial);
      boolean validConsecutive=password.matches(".*[1900-2019] .*");
      System.out.println("String has a a birthdate: " + validConsecutive);
      
      while(validNum==true && validLower==true && validUpper==true && validLength==true && validSpecial==true)
      {
         System.out.println("Congrats you made a great password!");
         System.exit(0);
      }
      while(validNum==false || validLower==false || validUpper==false || validLength==false || validSpecial==false)
      {
         System.out.println("Invalid password try again with these conditions:");
         /*System.out.println("1.Must have at least one capital letter");
         System.out.println("2.Must have at least one number");
         System.out.println("3.Must have at least one lower case letter");
         */
         password=input.nextLine();
         passwordLength=password.length();
         validNum=password.matches(".*[0-9].*");
         validLower=password.matches(".*[a-z].*");
         validUpper=password.matches(".*[A-Z].*");
         validSpecial=password.matches("[^a-zA-Z]");
         validLength=passwordLength>=10;
         
         System.out.println("String has a number: " + validNum);
         System.out.println("String has a lower case letter: " + validLower);
         System.out.println("String has an upper case letter: " + validUpper);
         System.out.println("String has a special character: " + validSpecial);
         System.out.println("String has a a birthdate: " + validConsecutive);

      }
     
      
   }
}   





