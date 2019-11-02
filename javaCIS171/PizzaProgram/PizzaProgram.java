public class PizzaProgram
{
   public static void main(String[]args)
   {
      Pizza myPizza=new Pizza();
      Pizza theirPizza=new Pizza("plain","large", "Pepperoni", "none", "Black Olives", 11.00 );
      
      System.out.println(myPizza);
      System.out.println(theirPizza);
      Customer cust= new Customer("Joe");
      System.out.println(cust);
      PizzaOrder order1=new PizzaOrder();
      System.out.println(order1);
   }
   
}
