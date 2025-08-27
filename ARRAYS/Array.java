 
public  class Array {
    public static void main(String[] args) {
       int[] numbers = {5, 10, 20, 30, 40, 50, 60};
       int sum = 0;
        
       for(int number : numbers) {
        sum += number;

       }
        System.out.println("Sum of array elements: "+sum);
    }
}
