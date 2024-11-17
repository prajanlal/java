import java.util.Scanner;

public class StartsWithExample {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.print("Enter the main string: ");
        String mainString = scanner.nextLine();

        // Prompt the user to enter the prefix
        System.out.print("Enter the prefix to check: ");
        String prefix = scanner.nextLine();

        // Check if the main string starts with the given prefix
        if (mainString.startsWith(prefix)) {
            System.out.println("The main string starts with the prefix.");
        } else {
            System.out.println("The main string does not start with the prefix.");
        }

        // Close the scanner
        scanner.close();
    }
}
