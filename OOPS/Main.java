abstract class Vehicle {
    
    String brand;
     Vehicle (String brand ) {
       this.brand = brand;
     }

      public static void icon(){
         System.out.println("Royal Enfield");
     };

    abstract void startEngine();

    abstract void acceleration();

    abstract void stopEngine();

   void displayinfo() {
       System.out.println("Brand: " +brand);
   }
}
class Bullet extends Vehicle {
    boolean bulbulbul;
    Bullet(String brand, boolean bulbulbul) {
        super(brand);
        this.bulbulbul = bulbulbul;
    }
    void acceleration() {
        System.out.println("Bullet engine started with bulbulbul sound");
    }
        void startEngine() {
        System.out.println("Powerful acceleration with a roar");
        
    }
        
    void stopEngine() {
        System.out.println("Bullet engine has stopped, blubewbew");
        
    }
    void displayinfo() {
        super.displayinfo();
        System.out.println("Type: Bullet");
        System.out.println( brand + "is a classic motorcycle");
        System.out.println("Is it as bullet sound " + (bulbulbul ? "True" : "False"));
       
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
    void acceleration() {
        System.out.println("Car acceleration is so smooth and powerful ");
    }
    void stopEngine() {
    System.out.println("Car engine stopped");
    }
    
  void display() {
     super.displayinfo();
      System.out.println("Type: Car");
      System.out.println("Brand: "+brand);
      System.out.println("Doors:"+doors);
  }
}

class Bike extends Vehicle() {
    int speed;

    Bike(String brand, int speed);
    super(brand);
        this.speed = speed;
}
    void startEngine() {
        System.out.println("Bike engine started with self-start");
    }
    void acceleration() {
        System.out.println("Bike acceleration gives an emotion to travel");
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
        System.out.println("Brand: "+brand);
        System.out.println("Speed: "+speed+ "km/h")
        System.out.println("Has Gear: "+(hasGear ? "true" : "false"));
    }
}

class SuperBike extends Vehicle {
       boolean booster;
     SuperBike(String brand, boolean booster) {
         super(brand);
         this.booster = booster;
     }
    void startEngine() {
        System.out.println("The Superbike v8 engine has started");
    }
    void acceleration() {
        System.out.println("The Superbike acceleration and the power is fabulous and thrilling to ride fast");
    }
    void stopEngine() {
System.out.println("The Superbike engine has stopped");
    }
    void Nitrobooster() {
        System.out.println("The SuperBike Nitrobooster onned");
    }
void displayinfo() {
    super.displayinfo();
    System.out.println("Type: SuperBike");
    System.out.println("Brand: "+brand);
    System.out.println("Booster: "+(booster ? "true" : "false"));
  }
}

public class Main {
    public static void main(String[] args) {

        Bullet bullet = new Bullet("Royal Enfined", true);
        bullet.displayinfo();
        bullet.startEngine();
        bullet.acceleration();
        bullet.stopEngine();

        System.out.println("\n -------------------------------\n");
        
        Car car = new Car("Toyota",4);
         car.displayinfo();
         car.startEngine();
         car.acceleration();
         car.stopEngine();

             System.out.println("\n----------------------------\n");

        Bike bike = new Bike("Honda",true);
         bike.displayinfo();
         bike.startEngine();
         bike.kickStart();
         bike.stopEngine();
            System.out.println("\n--------------------------------------\n");

        Superbike superbike = new Superbike("Kawasaki", true);
         superbike.displayinfo();
         superbike.startEngine();
         superbike.acceleration();
         superbike.stopEngine();
         superbike.Nitrobooster();

    }
}
        
