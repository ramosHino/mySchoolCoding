import java.text.DecimalFormat;
public class BankAccountProgram
{
   public static void main(String [] args)
   {
      BankAccount mine = new BankAccount();
      BankAccount yours = new BankAccount();
      BankAccount theirs = new BankAccount(250);
      
      System.out.println("My account number: " + mine.getAcctNumber());
      System.out.println("My balance: " + mine.getBalance());
      
      System.out.println("My account number: " + yours.getAcctNumber());
      System.out.println("My balance: $" + yours.getBalance());
      
      System.out.println("My account number: " + theirs.getAcctNumber());
      System.out.println("My balance: %.2f" + theirs.getBalance());
   
      System.out.printf("My balance %.2f", mine.getBalance());
      String result=String.format("%.2f",yours.getBalance());
      System.out.println("Your balance $" + result);
      
      DecimalFormat df=new DecimalFormat("#,###.00");
      System.out.println("Their balance: " + df.format (theirs.getBalance()));
      
      System.out.println(mine.toString());
      System.out.println(mine);
      if (mine.equals(yours))
         System.out.println("Same");
      else
         System.out.println("Different");
      BankAccount copied= theirs.copy();
      System.out.println(copied);
      BankAccount our=new BankAccount(yours);
      System.out.println(yours);

   }
}