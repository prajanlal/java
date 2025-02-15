public class StringEquals{
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "Hello";
        String str3 = "hello";

        // Using equals() to compare strings
        boolean result1 = str1.equals(str2);
        boolean result2 = str1.equals(str3);

        // Print the results
        System.out.println("str1 equals str2: " + result1); // true
        System.out.println("str1 equals str3: " + result2); // false
    }
}
