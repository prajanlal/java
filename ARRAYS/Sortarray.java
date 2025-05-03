public class Sortarray  {
       public static void main(String[] args){
        int[] numbers = {11, 21, 31, 41, 51, 61, 71};
        int[] nbrs = {12, 29, 39, 4};
        int[] result = new int[numbers.length + nbrs.length ];

           System.arraycopy(numbers, 0, result, 0, numbers.length);
           System.arraycopy(nbrs, 0, result ,numbers.length , nbrs.length);
           
                  }
}