import java.util.Arrays;

public class Main {
    private static void swap(int[] array, int firstIndex, int secondIndex) {
        int temp = array[firstIndex];
        array[firstIndex] = array[secondIndex];
        array[secondIndex] = temp;
    }
    
    private static int pivot(int[] array, int pivotIndex, int endIndex) {
        int swapIndex = pivotIndex;
        
        for (int i = pivotIndex + 1; i <= endIndex; i++) {
            if (array[i] < array[pivotIndex]) {
                swapIndex++;
                swap(array, swapIndex, i);
            }
        }
        swap(array, pivotIndex, swapIndex);
        
        return swapIndex;
    }
    
    public static void main(String[] args) {
        int[] array = {4,6,1,7,3,2,5};
        
        int returnedIndex = pivot(array, 0, array.length - 1);
        
        System.out.println("The returned index: " + returnedIndex); // 3
        
        System.out.println(Arrays.toString(array)); // [2, 1, 3, 4, 6, 7, 5] -> pivot number: 4
    }
}
