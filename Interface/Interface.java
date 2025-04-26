public class Interface {
    public static void main(String[] args){
            Vehicle Bike = new Bike();
            Vehicle Car = new Car();
            System.out.println("\n");
            System.out.println("The Bike Behaviours");
            System.out.println("\n");
            Bike.Engine();
            Bike.HP();
            System.out.println("Bike Top Speed: "+Bike.getTopSpeed()+"km/h");
            

            System.out.println("\n");
            System.out.println("The Car Behaviours");
            System.out.println("\n");
             Car.Engine();
             Car.HP();
             System.out.println("Car Top Speed: "+Car.getTopSpeed()+ "km/h");
             
    }
} 
