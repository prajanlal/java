
import java.util.Arrays;

public class Sortarray  {

       public static void main(String[] args) { 
       int[] array1 = {12, 2, 34, 21, 10};
       int[] array2 = {30, 21, 12};
       int[] array3 = {20, 30, 40};

       int[] result = new int[array1.length + array2.length +array3.length]; 

       System.arraycopy(array1, 0, result, 0, array1.length);
       System.arraycopy(array2, 0, result, 0, array2.length);
       System.arraycopy(array3, 0, result, 0, array3.length);

       System.arraycopy(array2, 0, result, 0, array2.length);
       System.arraycopy(array2, 0, result, array1.length , array2.length, array3.length);

       System.out.println("Combined Array: "+ Arrays.toString(result));

       }
       }