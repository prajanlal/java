
import java.util.Scanner;

public class Scanner {

    public static void main(String[] args) {

        // creates an object of Scanner
        Scanner input = new Scanner(System.in);           //INPUT

        System.out.println("Enter your name: ");                    //NAME

        // takes input from the keyboard
        String name = input.nextLine();                     //INPUT

        System.out.println("Enter your thoughts: ");                   //THOUGHTS

        String thoughts = input.nextLine();             //INPUT
        // prints the name
        System.out.println("My name is " + name);           //NAME ANSWER

        System.out.println("This is the message to you son nobody is like you so smile shine your life and show them your power" + thoughts);          //THOUGHTS ANSWER
        // closes the scanner
        input.close();
    }
}
