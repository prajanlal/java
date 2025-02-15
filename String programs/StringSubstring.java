public class StringSubstring{
    public static void main(String[] args) {
        String str = "Hello, World!";
        
        // Extracting substring from index 7 to the end
        String substr1 = str.substring(7);
        System.out.println("Substring from index 7: " + substr1);

        // Extracting substring from index 0 to 4 (endIndex is exclusive)
        String substr2 = str.substring(0, 5);
        System.out.println("Substring from index 0 to 4: " + substr2);
    }
}
