abstract class Vehicle {
    
    String brand;
     Vehicle (String brand ) {
       this.brand = brand;
     }
    abstract void startEngine();
    abstract void stopEngine();

   void displayinfo() {
       System.out.println("Brand: " +brand);
   }
}
class Car extends Vehicle {
    int doors;
    Car (String brand, int doors) {
        super(brand);
         this.doors = doors;
     }
    void startEngine() {
        System.out.println("Car engine started");
    }
    void stopEngine() {
    System.out.println("Car engine stopped");
    }
  void display() {
     super.displayinfo();
      System.out.println("Type: Car");
      System.out.println("Doors:"+doors);
  }
}
class Bike extends Vehicle() {
    boolean hasGear;

     Bike (String brand,boolean hasGear) {
        super(brand);
         this.hasGear=hasGear;
    }
    void startEngine() {
        System.out.println("Bike engine started with self-start");
    }
    void stopEngine(){
        System.out.println("Bike engine stopped");
    }
    void kickStart() {
        System.out.println("Kick-starting the bike");
    }
    void display() {
       super.displayinfo();
        System.out.println("Type: Bike");
        System.out.println("Has Gear: "+(hasGear ? "Yes" : "No"));
    }
}
public class Main {
    public static void main(String[] args) {
        Car car = new Car("Toyota",4);
         car.displayInfo();
         car.startEngine();
         car.opentruck();
         car.stopEngine();

             System.out.printin("\n-------------------------\n");

        Bike bike = new Bike("Honda", true);
         bike.displayinfo();
         bike.startEngine();
         bike.kickStart();
         bike.stopEngine();
    }
}
        
    
      
    
    
