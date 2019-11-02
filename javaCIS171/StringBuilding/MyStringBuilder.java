import java.util.Scanner;
public class MyStringBuilder
{
public static void main(String[]args)
   {
       String str1,str2;
       Scanner input= new Scanner(System.in);
       StringBuilder eventString=new StringBuilder("Programming Gaming Event");
       StringBuilder myString=null;
       myString= new StringBuilder("CIS 171");
       int myCapacity=myString.capacity();
       System.out.println("Capacity is " + myCapacity);  
      
       System.out.println("Enter a string");
       str1=input.nextLine();
       System.out.println("Enter another string");
       str2=input.nextLine();
      
      //  str2="See ya";
       if(str1.equals(str2))
          System.out.println("Same");
       else 
         System.out.println("Different");

   }
}