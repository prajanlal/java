
import java.util.Arrays;

public class Sortarray {

    public static void main(String[] args) {

        int[] array1 = {12, 42, 45, 23};
        int[] array2 = {35, 32, 42, 25};
        int[] array3 = {13, 22, 41, 25};
        int[] array4 = {41, 40, 31, 100};

        int totalLength = array1.length + array2.length + array3.length + array4.length;

        int[] result = new int[totalLength];

        System.arraycopy(array1, 0, result, 0, array1.length);
        System.arraycopy(array2, 0, result, array1.length, array2.length);

        System.arraycopy(array3, 0, result, array1.length + array2.length, array3.length);
        System.arraycopy(array4, 0, result, array1.length + array2.length + array3.length, array4.length);
        System.out.println("Arrays: " + Arrays.toString(result));
    }
}
