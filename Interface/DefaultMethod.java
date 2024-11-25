//Define the interface with Abstract method
interface Vehicle{
   //abstract method
   public void start();
  //default method
   default void stop(){
  System.out.println("the vehicle has stopped");
   }
}
  class car implements Vehicle{
    //@Override
   public void start(){
      System.out.println("The car is starting");
   }
    class bike implements Vehicle{
      public void start(){
        System.out.println("The bike is starting");
      }
    public class main{
      public static void main (String[] args){
        Car car =new Car();
        Bike bike =new Bike();
        car.start();
        bike.start();
          //call the default stop method on both instances
        car.stop();
        bike.stop();
      }
    }
        
        
     
