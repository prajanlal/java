public class indexOf {
    public static void main(String[] args) {
        // Sample string
        String str = "Hello, welcome to the Java world!";
        
        // Substring to find
        String subStr = "Java";
        
        // Using indexOf() to find the first occurrence of "Java"
        int index = str.indexOf(subStr);
        
        // Check if the substring was found
        if (index != -1) {
            System.out.println("The substring '" + subStr + "' is found at index: " + index);
        } else {
            System.out.println("The substring '" + subStr + "' is not found.");
        }
    }
}
