public class StringEndWith {
    public static void main(String[] args) {
        String str = "Hello, world!";
        
        // Check if the string ends with "world!"
        if (str.endsWith("world!")) {
            System.out.println("The string ends with 'world!'");
        } else {
            System.out.println("The string does not end with 'world!'");
        }
        
        // Check if the string ends with "Hello"
        if (str.endsWith("Hello")) {
            System.out.println("The string ends with 'Hello'");
        } else {
            System.out.println("The string does not end with 'Hello'");
        }
    }
    }
