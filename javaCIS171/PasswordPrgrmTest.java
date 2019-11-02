import java.util.Scanner;
public class PasswordPrgrmTest
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
      boolean validSpecial=password.matches(".*[!] .*");
      
     /* while(validSpecial==true)
      {
         System.out.println("Congrats you made a great password!");
         System.out.println("Special Character:"+validSpecial);
         System.exit(0);
      }
      while(validSpecial==false)
      {
         System.out.println("Invalid password:"+validSpecial);
        
         password=input.nextLine();
         passwordLength=password.length();
         validSpecial=password.matches(".*[!] .*");
         
         
         
         System.out.println("String has a special character: " + validSpecial);
         

      }*/
  
      String str = "abc$def^ghi#jkl";

      Pattern p = Pattern.compile("[^a-z0-9 ]", Pattern.CASE_INSENSITIVE);
      Matcher m = p.matcher(str);

      System.out.println(str);
      int count = 0;
      while (m.find()) {
         count = count+1;
         System.out.println("position "  + m.start() + ": " + str.charAt(m.start()));
      }
      System.out.println("There are " + count + " special characters");
   


   }
}
