import java.util.Scanner;

public class ToUpperCase {
    public static void main(String[] args) {
      
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter a string: ");
        Object input = scanner.nextLine();

        String upperCaseString = ((String) input).toUpperCase();

        System.out.println("Uppercase String: " + upperCaseString);
        
    
        scanner.close();
    }
}
