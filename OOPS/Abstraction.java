abstract class Vehicle {
    String brand;
     Vehicle(String brand ) {
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
     Car(String brand, int doors) {
         super(brand);
         this.doors = doors;
     }
    void startEngine() {
        System.out.println("Car engine started");
    }
    
    
