 
public  class Array {
    public static void main(String[] args) {
       int[] numbers = {5, 10, 15, 20, 25, 30, 35, 40, 45 50, 60};
       int sum = 0;
        
       for(int number : numbers) {
        sum += number;

       }
        System.out.println("Sum of array elements: "+sum);
    }
}
