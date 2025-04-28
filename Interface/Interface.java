
import java.util.Scanner;


public class Interface {

     public static void main(String[] args) {

         try (Scanner scanner = new Scanner(System.in)) {
             Vehicle Bike = new Bike();
             Vehicle Car = new Car();
             System.out.println("\n");
             System.out.println("The Bike Behaviours");
             System.out.println("\n");
             
             Bike.start();
             Bike.stop();
             Bike.accelerate();
             Bike.brake();
             Bike.refuel( );
             Bike.displaystatus();
             Bike.Engine();
             Bike.HP();
             System.out.println("Bike Top Speed: "+Bike.getTopSpeed()+"km/h");
             
             System.out.println("\n");
             System.out.println("The Car Behaviours");
             System.out.println("\n");
             Car.Engine();
             Car.HP();
             System.out.println("Car Top Speed: "+Car.getTopSpeed()+ "km/h");
             
             OUTER:
             while (true) {
                 System.out.println("\nVehicle Manager");
                 System.out.println("1. Start a Car");
                 System.out.println("2. Start a Bike");
                 System.out.println("3. Exit ");
                 System.out.println("Choose a vehicle type (1-4): ");
                 String choice = scanner.nextLine().trim();
                 Vehicle vehicle;
                 switch (choice) {
                     case "1" -> {
                         vehicle = new Car();
                         vehicle.accelerate();
                         vehicle.Engine();
                         vehicle.displaystatus();
                         vehicle.HP();
                         vehicle.getTopSpeed();
                         vehicle.refuel();
                         vehicle.start();
                         vehicle.stop();
                     }
                     case "2" -> {
                         vehicle = new Bike();
                         vehicle.accelerate();
                         vehicle.displaystatus();
                         vehicle.Engine();
                         vehicle.HP();
                         vehicle.start();
                         vehicle.getTopSpeed();
                         vehicle.brake();
                         vehicle.stop();
                     }
                     case "3" -> {
                         System.out.println("Exit ");
                         break OUTER;
                     }
                     default -> System.out.println("Invalid option, please try again");
                 }
             }
         }
    }
} 