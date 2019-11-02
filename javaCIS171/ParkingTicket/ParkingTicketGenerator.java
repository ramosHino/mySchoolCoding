// Husam Alsheikh AND Omar Hinojosa

import java.util.Scanner;

public class ParkingTicketGenerator{
   public static void main(String[] args){
      Scanner keyboard = new Scanner(System.in);
      int exit = 420;
      
      Meter myMeter = new Meter(30);
      Officer myOfficer = new Officer("Buffy Doodle", 420);
      
      Ticket myTicket = new Ticket();
      
      System.out.println("Parking: Enter the make, model, color and plateNumber of your car");
      System.out.println("Set make: ");
      myTicket.setMake(keyboard.nextLine());
      System.out.println("Set model: ");
      myTicket.setModel(keyboard.nextLine());
      System.out.println("Set color: ");
      myTicket.setColor(keyboard.nextLine());
      System.out.println("Set Plate Number: ");
      myTicket.setPlateNum(keyboard.nextInt());
      
      do{
         int input = 10;
      
         // menu
         System.out.println("1- Purchase time on meter, enter '1'");
         System.out.println("2- Elapse Time, enter '2'");
         System.out.println("3- Make and inspection, enter '3'");
         System.out.println("4- Exit, enter '4'");
         System.out.println("\nEnter your choice: ");
         
         input = keyboard.nextInt();
         
         if(input == 1){
            System.out.println("\nEnter amount of time you want to park for on the meter");
            myTicket.setTime(keyboard.nextInt());
         }
         else if(input == 2){
            myTicket.elapseTime();
            System.out.println("20 min have passed");
            System.out.println("Meter Time is " + myTicket.getMeterTime());
         }
         else if(input == 3){
            if(myTicket.checkTime()){
               myTicket.printTicket();
            }
         }
         else if(input == 4){
            exit = 4;
         }
         else{
            System.out.println("\t\tError-Wrong input, please choose something from the menu");
         }
      }while(exit != 4);
   }
}