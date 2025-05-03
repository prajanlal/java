import java.util.Arrays;

public class Sortarray  {

       public static void main(String[] args) { 
              
       int[] array1 = {12, 2, 34, 21, 10};
       int[] array2 = {30, 21, 12};
       int[] array3 = {20, 21, 40, 52};

   int totalLength = array1.length + array2.length + array3.length;

       int[] result = new int[totalLength]; 

       System.arraycopy(array1, 0, result, 0, array1.length);
       System.arraycopy(array2, 0, result, array1.length, array2.length);

         System.arraycopy(array3, 0, result, array1.length + array2.length, array3.length);
     
       System.out.println("Combined Array: "+ Arrays.toString(result));
       }
       }