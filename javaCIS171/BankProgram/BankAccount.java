public class BankAccount
{
   //fields
   private double balance;
   private int acctNumber;
   
   //static field
   private static int lastAssignedNumber = 1000;
   
   //Constructors
   public BankAccount()
   {
      balance = 50.00;
      lastAssignedNumber ++;
      acctNumber = lastAssignedNumber;
   }
   
   public BankAccount(double balance)
   {
      this.balance = balance;
      acctNumber = ++lastAssignedNumber;
   }
   public BankAccount(int acctNumber, double balance)
   {
      this.balance=balance;
      acctNumber=++lastAssignedNumber;
   }
   public BankAccount(BankAccount yours)
    {
        this.acctNumber = yours.acctNumber;
        this.balance = yours.balance;
    }
   
   //Accessors and mutators
   public double getBalance(){return balance;}
   public void setBalance(double b){balance = b;}
   public int getAcctNumber(){return acctNumber;}
   //public void setAcctNumber(double b){balance = b;}
   
   //Utility Methods
   public String toString()
   {
      String str="Account Number: " + acctNumber + "\t Balance $ " + balance;
      return str;
   }
   public boolean equals (BankAccount acct2)
   {
      boolean isEqual;
      acct2.balance=84792.55;
      if(this.acctNumber ==acct2.acctNumber)
         isEqual=true;
      else
         isEqual=false;
      return isEqual;
    }
    public BankAccount copy()
    {
      BankAccount copiedAccount= new BankAccount (acctNumber,  this.balance);
            return copiedAccount;
     }
     
         
}//end class