import java.util.Scanner;
public class Register
{
   private double price;
   private int itemCount;
   private double subTotal;
   private double salesTax;
   private double finalTotal;
   private int sum;
   private double payment;
   private double change;
   
   // // for car
//    public void setPrice(doublePrice){
//       myRegister.setMake(make);
//    }
//    public void setModel(String model){
//       myCar.setModel(model);
//    }
//    public void setColor(String color){
//       myCar.setColor(color);
//    }
//    public void setPlateNum(int plateNum){
//       myCar.setLicensePlate(plateNum);
//    }
//    
//    // for meter
//    public void setTime(int time){
//       myMeter.setTimePurchased(time);
//       
//       meterTime = myMeter.getTimePurchased();
//    }
//    
//    // for officer
//    public void setBadge(int badge){
//       myOfficer.setBadgeNumber(badge);
//    }
//    public void setName(String name){
//       myOfficer.setOfficerName(name);
//    }

   //Constructors
   public Register()
   {
      this.price = price;
      this.itemCount = itemCount;   
      this.subTotal = subTotal; 
      this.salesTax = salesTax;
      this.finalTotal = finalTotal;
      this.sum = sum;
      this.payment = payment;
      this.change = change;
      price=0;
      itemCount=0;
      subTotal=0;
      salesTax=0;
      finalTotal=0;
      sum=0;
      payment=0;
      change=0;
   }

 public Register(int itemCount, double price, double subTotal, double salesTax, double finalTotal, int sum, double payment, double change)
    {
     this.price = price;
     this.itemCount = itemCount;   
     this.subTotal = subTotal; 
     this.salesTax = salesTax;
     this.finalTotal = finalTotal;
     this.sum = sum;
     this.payment = payment;
     this.change = change;
   }
   
   
   //Methods
   
   public double Purchase(int itemCount, double price, double subTotal)
   {
      while (itemCount>1){
      itemCount=0;
      itemCount = itemCount + 1;
      subTotal=price+subTotal;
      }
      return subTotal;
   }
   
   public double Payment(double payment)
   {
      Scanner input = new Scanner(System.in);
      System.out.print("Enter payment: ");
    	double myPayment = input.nextDouble();
    	System.out.println("Payment entered = " + myPayment);
      return payment;   
   }
   public double Change()
   {
      change=subTotal-payment;
      return change;
   }
   public double SalesTax(double subTotal,double salesTax)
   {
      salesTax=subTotal*.06;
      return salesTax;
   }
   
   public double FinalTotal(double salesTax, double subTotal)
   {
   finalTotal=salesTax+subTotal;
   return finalTotal;
   }
   public String toString()
   {
   String str="You ordered "+itemCount+" items"+"\nSub Total: " +subTotal+"\nSales Tax: "+salesTax+"\nFinal Total of: "+finalTotal+"\nPayment: " + payment + "\nChange: " + change;
   return str;
   }
}   
