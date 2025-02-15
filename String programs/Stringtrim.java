public class Stringtrim {
    public static void main(String[] args) {
        String str = "   Hello, World!   ";
        System.out.println("Original String: '" + str + "'");

        String trimmedStr = str.trim();
        System.out.println("Trimmed String: '" + trimmedStr + "'");
    }
}
