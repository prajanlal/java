public class OneDimensionalArray {
    public static void main(String[] args) {
        // Declare and initialize the array
        int[] numbers = new int[5];
        
        // Assign values to the array
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        numbers[3] = 4;
        numbers[4] = 5;
        
        // Print the array values
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Element at index " + i + " : " + numbers[i]);
        }
    }
}
