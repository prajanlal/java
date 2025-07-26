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
    
    void displayinfo() {
       super.displayinfo();
        System.out.println("Type: Bike");
        System.out.println("Has Gear: "+(hasGear ? "Yes" : "No"));
    }
}

class SuperBike extends Vehicle {
       boolean booster;
     SuperBike(String brand, boolean booster) {
         super(brand);
         this.booster;
     }
    void startEngine() {
        System.out.println("The Superbike v8 engine has started");
    }
    void stopEngine() {
System.out.println("The Superbike engine has stopped");
    }
    void Nitrobooster() {
        System.out.println("The SuperBike Nitrobooster onned");
    }
void displayinfo() {
    super.displayinfo();
    System.out.println("Type: SuperBike);
    System.out.println("Booster: "+(booster ? "Yes" : "No"));
  }
}

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Toyota",4);
         car.displayInfo();
         car.startEngine();
         car.opentruck();
         car.stopEngine();

             System.out.printin("\n----------------------------\n");

        Bike bike = new Bike("Honda", true);
         bike.displayinfo();
         bike.startEngine();
         bike.kickStart();
         bike.stopEngine();

            System.out.println("\n--------------------------------------\n);
        Superbike superbike = new Superbike("Kawasaki", true);
         superbike.displayinfo();
         superbike.startEngine();
         superbike.stopEngine();
         superbike.Nitrobooster();
    }
}
        
