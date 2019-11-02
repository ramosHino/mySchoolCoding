import java.util.ArrayList;
public class ArrayListExample {
   public static void main(String[]args){
      ArrayList<String> myList=new ArrayList<String>();
      myList.add("CIS 125");
      myList.add("CIS 170");
      myList.add("CIS 171");
      myList.add("CIS 230");
      System.out.println("My list contains: " + myList);
      
      System.out.println("\nThe size is: " + myList.size());
      
      for(int x=0; x<myList.size();++x)
      {
      System.out.println(""+myList.get(x));
      }
      
      for(String course: myList)
      {
      System.out.println("\n "+course);
      }
      
      //Inserts it into the array and when it inserts it adds to the size
      myList.add(0,"CIS100"); 
      myList.add(1,"CIS112"); 
      myList.remove("CIS112");
      System.out.println("\n Now "+myList);
      myList.remove(2);
      System.out.println("\n Now "+myList);
      
      
      // if(myList.contains(myCourse))
//       
//          System.out.println("Found");
//       
//       else 
//          System.out.println("Not Found");
       if(myList.isEmpty())
       
          System.out.println("Empty");
      
      else 
         System.out.println("Full");
      
      myList.clear(); 
      
      if(myList.isEmpty())
       
          System.out.println("Empty");
      
      else 
         System.out.println("Full");
      ArrayList<String> myList=new ArrayList<String>(50); //Reserves 50 spots for elements
   
   }
}   