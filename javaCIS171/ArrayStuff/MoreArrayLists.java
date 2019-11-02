import java.util.ArrayList;
public class MoreArrayLists
{
   
   public static void main(String[]args)
   {
      ArrayList <Integer> myList= new ArrayList<>();
      
      int num=26; //Autoboxing, converts datatype to an object using wrapper class
      myList.add(num);
      System.out.println(myList.get(0));
      
      int x=myList.get(0); //Unboxing
      System.out.println(x);
      
      ArrayList<Employee> emps= new ArrayList<Employee>();
      emps.add(new Employee("Rick" , "Grimes", 18500));
      emps.add(new Employee("Daryl","Dixon",145000));
      emps.add(new Employee("Maggie" , "Green", 150000));      
      System.out.println(emps);
      //set last name to "Rhee"
     //  Employee e=emps.get(2);
//       e.setLastName("Rhee");
//       System.out.println(e);
      //myList.add(7,"Rhee");
      //print that Employee
    }
}//end main
   class Employee
   {
         private String first;
         private String last;
         private double salary;
         public Employee(String f,String l,double s)
         {
            first=f;
            last=l;
            salary=s;
         }  
         void setLast(String l)
         {
            last=l;
         }
         public String toString()
         {
         return (first + " " + last + " " + salary);
         }
    }
