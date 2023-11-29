import java.util.Arrays;

public class Main {
    // insertion sort
//    public static void insertionSort(int[] array) {
//        for (int i = 1; i < array.length; i++) {
//            for (int j = i - 1; j >= 0; j--) {
//                if (array[j+1] < array[j]) {
//                    int temp = array[j+1];
//                    array[j+1] = array[j];
//                    array[j] = temp;
//                }
//            }
//        }
//    }
    
    public static void insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int temp = array[i];
            int j = i - 1;
            while (j >= 0 && temp < array[j]) {
                array[j + 1] = array[j];
                array[j] = temp;
                j--;
            }
        }
    }
    
    public static void main(String[] args) {
        int[] myArray = {4,2,6,5,1,3};
        
        /*
        *  temp = 1, array[j] = 5
        *  {4,2,6,1,5,3}
        * */
        
        insertionSort(myArray);
        
        System.out.println(Arrays.toString(myArray));
    }
}
