import java.util.Arrays;

public class Main {
    // bubble sort
    public static void bubbleSort(int[] array) {
        for (int i = array.length - 1; i > 0; i--) { // times of steps = n -1
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
    
    public static void main(String[] args) {
        int[] nums = {4,2,6,5,1,3};
        
        bubbleSort(nums);
        
        System.out.println(Arrays.toString(nums));
    }
}
