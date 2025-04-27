 public class Bike implements Vehicle { 

 @Override
 public void start(){
  System.out.println("The biek has been started");
 }

 @Override
 public void stop(){
  System.out.println("The bike has been stopped");
 }

 @Override
 public void accelerate(int increase){
  System.out.println("The acceleration has been starteed");
 }

 @Override
 public void brake(int decrease){
  System.out.println("It's time to brake");
 }

 @Override
 public void refuel(int fuelAdded){
  System.out.println("The bike fuel has been refuelled");
 }

 @Override
 public void displaystatus(){
  System.out.println("The status ");
 }
 
    @Override
    public void Engine() {
        System.out.println("Engine type is V7");
    }

    @Override
      public void HP() {
        System.out.println("Horse Power per km is 100 ");
      }

      @Override
      public int getTopSpeed() {
        return 800;
      }
}