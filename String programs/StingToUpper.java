import java.util.Scanner;

public class ToUpperCase {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.println("Enter a string: ");
        String input = scanner.nextLine();

        // Convert the string to uppercase
        String upperCaseString = input.toUpperCase();

        // Display the uppercase string
        System.out.println("Uppercase String: " + upperCaseString);
        
        // Close the scanner
        scanner.close();
    }
}
