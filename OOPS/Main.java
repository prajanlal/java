abstract class Vehicle {
    
    String brand;
     Vehicle (String brand ) {
       this.brand = brand;
     }

      public static void icon(){
         System.out.println("Royal Enfield");
     };

    abstract void startEngine();
     
    abstract void kickStart();
    abstract void acceleration();

    abstract void Nitrobooster();
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
    void kickStart() {
        System.out.println("Kick-starting the Bullet with a classic sound");
    }
    void Nitrobooster() {
        System.out.println("Bullet does not have a Notrobooster");
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
class Supercar extends Vehicle {
    int speed;
    Supercar(String brand, int speed) {
        super(brand);
        this.speed = speed;
    }

    void startEngine() {
        System.out.println("Start Supercar Engine");
    }
    void acceleration() {
        System.out.println("Supercar acceleration is so fast and powerful");
    }
    void Nitrobooster() {
        System.out.println("Supercar already has a Nitrobooster");
    }
    void stopEngine() {
        System.out.println("Supercar engine stopped");
    }
    void displayinfo() {
        super.displayinfo();
        System.out.println("Type: Supercar");
        System.out.println("Brand:"+brand);
        System.out.println("Speed: " +speed + "km/h");
    }
}

class Car extends Vehicle {
    String speedy;
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
    void Nitrobooster() {
        System.out.println("Car: "+speedy + "km/h");
    }
    void stopEngine() {
    System.out.println("Car engine stopped");
    }
    
  void displayinfo() {
     super.displayinfo();
      System.out.println("Type: Car");
      System.out.println("Brand: "+brand);
      System.out.println("Doors:"+doors);
  }
}

class  Bike extends Vehicle {
    boolean hasGear;
    int speed;

    Bike(String brand, boolean hasGear) {
      super(brand);
        this.hasGear = hasGear;
}
    void startEngine() {
        System.out.println("Bike engine started with self-start");
    }
    void acceleration() {
        System.out.println("Bike acceleration gives an emotion to travel");
    }
         void Nitrobooster() {
            System.out.println("Bike Nitrobooster gets started");
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
        System.out.println("Speed: "+speed+ "km/h");
        System.out.println("Has Gear: " + (hasGear ? "Yes" : "No"));
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

              Supercar supercar = new Supercar("Bently GT", 120);
          supercar.displayinfo();
          supercar.startEngine();
          supercar.acceleration();
          supercar.Nitrobooster();
          supercar.stopEngine();
          
          System.out.println("\n---------------------------------\n");
          
        Car car = new Car("Toyota",4);
         car.displayinfo();
         car.startEngine();
         car.acceleration();
         car.Nitrobooster();
         car.stopEngine();

             System.out.println("\n----------------------------\n");

        Bike bike = new Bike("Honda", true);
          bike.displayinfo();
          bike.startEngine();
          bike.kickStart();
          bike.Nitrobooster();
          bike.stopEngine();
          
            System.out.println("\n--------------------------------------\n");

        Superbike superbike = new Superbike("Kawasaki", true);
          superbike.displayinfo();
          superbike.startEngine();
          superbike.acceleration();
          superbike.Nitrobooster();
          superbike.stopEngine();

    }
}