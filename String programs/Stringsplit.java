public class Stringsplit{
    public static void main(String[] args) {
        // Define a string with a delimiter
        String str = "apple,banana,orange,grape";

        // Split the string using the comma as a delimiter
        String[] fruits = str.split(",");

        // Print the resulting array
        System.out.println("Splitting the string: " + str);
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}
