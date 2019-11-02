public class Pizza
{
   private String crust;
   private String size;
   private String topping1;
   private String topping2;
   private String topping3;
   private double price;
   
   //Constructors
   
   public Pizza(String crust, String size, String topping1, String topping2, String topping3, double price)
   {
      this.crust = crust;
      this.size = size;   //if you didnt add this. to size crust and price it would assign it to itself
      this.topping1 = topping1; //didnt have to do this. for the toppings because it'll know
      this.topping2 = topping2;
      this.topping3 = topping3;
      this.price = price;
   }
      //default contructor
   public Pizza()
   {
      crust="Garlic";
      size="Medium";
      topping1="Pepperoni";
      topping2="Jalepeno";
      topping3="Onions";
      price=8.99;
   }
   //Method(?)
   public String toString()
   {
    String str="You ordered a "+size+""+crust+"Pizza with" +topping1+""+topping2+""+topping3+"for a total of $" + price;
    return str;
   }
 public Pizza(String crust, String size, String topping1, String topping2, String topping3)
   {
      this.crust=crust;
      this.size=size;   //if you didnt add this. to size crust and price it would assign it to itself
      this.topping1=topping1; //didnt have to do this. for the toppings because it'll know
      this.topping2=topping2;
      this.topping3=topping3;
      this.calcPrice();
   }
private void calcPrice()
   {
      switch(size.charAt(0))
      {
         case'S':case('s'):
            price=6.99;
            break;
         case'M':case('m'):
            price=8.99;
            break;
         case'l':case('L'):
            price=10.99;
            break;
         default:
            size="Medium";
            price=8.99;
      }
      //calculate the toppings add.75 per topping "none" means no topping
      //add .50 per crust "plain" you charge nothing
      if (topping1=="none" || topping2=="none" || topping3 =="none")
         price=price+1.50;
         
   }
}   