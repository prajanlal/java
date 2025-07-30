class Shape {
   String shape;
   int shapeSize;
   String shapeColor;
    
   public void display() {
      System.out.println("Inside display");
   }
}
class Rectangle extends Shape {
   public void area() {
      System.out.println("Inside area");
   
   System.out.println("Shape of an rectange: " +shape);
   System.out.println("Size of an rectangle: " +shapeSize);
   System.out.println("Color of an rectangle: "+shapeColor);
   System.out.println("Area of the rectangle is: " + (shapeSize * shapeSize));

   }
}
class Cube extends Rectangle {
   public void volume() {
      System.out.println("Inside volume");
      System.out.println("Shape of an cube: " +shape);
      System.out.println("Size of an cube: " +shapeSize);
      System.out.println("Color of an cube: "+shapeColor);
      System.out.println("Volume of the cube is: " + (shapeSize * shapeSize * shapeSize));
      
   }
}
public class Multilevelinheritance {
   public static void main(String[] arguments) {

      Rectangle rectangle = new Rectangle();
      rectangle.shape = "Rectangle";
      rectangle.shapeSize = 5;
      rectangle.shapeColor = "Blue";
      rectangle.area();
      rectangle.display();
           System.out.println("\n ----------------------------------\n")
      Cube cube = new Cube();
      cube.shape = "Cube";
      cube.shapeSize = 3;
      cube.shapeColor = "Reed";
      cube.volume();
      cube.display();
   }
}
