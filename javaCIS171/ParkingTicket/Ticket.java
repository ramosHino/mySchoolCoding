public class Ticket
{
   private Car myCar;
   private Meter myMeter;
   private Officer myOfficer;
   
   private int meterTime;

   private double fine;
   private String ticketDate;
   private int overdue;
   
   public int getMeterTime(){return meterTime;}
   
   // for car
   public void setMake(String make){
      myCar.setMake(make);
   }
   public void setModel(String model){
      myCar.setModel(model);
   }
   public void setColor(String color){
      myCar.setColor(color);
   }
   public void setPlateNum(int plateNum){
      myCar.setLicensePlate(plateNum);
   }
   
   // for meter
   public void setTime(int time){
      myMeter.setTimePurchased(time);
      
      meterTime = myMeter.getTimePurchased();
   }
   
   // for officer
   public void setBadge(int badge){
      myOfficer.setBadgeNumber(badge);
   }
   public void setName(String name){
      myOfficer.setOfficerName(name);
   }
   
   //** Constructor */
   public Ticket()
   {
      myCar = new Car("", "", "", 2);
      myMeter = new Meter();
      myOfficer = new Officer();
   }
   
   // functions
   public void elapseTime(){
      meterTime -= 20;
   }
   
   public boolean checkTime(){
      if(meterTime <= 0){
         System.out.println("Your meter has expired");
         return true;
      }
      else{
         System.out.println("Time on your meter: " + meterTime);
         return false;
      }
   }
   
   public void printTicket(){
      System.out.println("\n\tYou got a Ticket!");
      System.out.println("\n\tTicket Info:");
      System.out.println("Car: " + myCar.getMake() + ", " + myCar.getModel() + ", " + myCar.getColor() + ", " + myCar.getLicensePlate());
      System.out.println("Officer: " + myOfficer.getOfficerName() + ", Badge: " + myOfficer.getBadgeNumber());
   }
}