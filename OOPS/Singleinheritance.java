public class Singleinheritance{
    String model;
    String color;
    String type;

    public void Single(){
           System.out.println("Hello JAGUAR");
           System.out.println("The model"+model+"name is F Type");
           System.out.println("My favourite"+color+"color is blue");
           System.out.println("This is the "+type+"Jaguar car company models");

    }
    class Kawasaki extends Singleinheritance {

        public void Single(){
            System.out.println("Hello Ducati");
            System.out.println("The model"+model+"name is Panigale V4");
            System.out.println("My favourite"+color+"color is red");
            System.out.println("This is the "+type+"Ducati bike company models");
        }
    }
}
            
