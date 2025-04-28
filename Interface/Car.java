public class Car implements Vehicle {
    @Override
    public void start(){
        System.out.println("The car has been started");
    }
    @Override
    public void stop(){
        System.out.println("The car has been stopped");
    }
    @Override
    public void accelerate( ){
        System.out.println("The accleration has been started");
    }
    @Override
    public void brake( ){
        System.out.println("The car has been stopped because of the brake ");
    }
    @Override
    public void refuel( ){
        System.out.println("The car has been refuelled");
    }
    @Override
    public void displaystatus(){
        System.out.println("The status");
    }
    @Override
    public void Engine(){
        System.out.println(" Engine power per km is higher than a bike");
    }
    @Override
    public void HP(){
        System.out.println("Horse Power per km is about 1000kmph");
    }
   @Override
    public int getTopSpeed(){
        return 1000;
    }
}