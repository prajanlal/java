lnimport java.util.Scanner;

public class ToLowerCase {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.println("Enter a string: ");
        String input = scanner.nextLine();

        // Convert the string to lowercase
        String lowerCaseString = input.toLowerCase();

        // Display the lowercase string
        System.out.println("Lowercase String: " + lowerCaseString);
        
        // Close the scanner
        scanner.close();
    }
}
