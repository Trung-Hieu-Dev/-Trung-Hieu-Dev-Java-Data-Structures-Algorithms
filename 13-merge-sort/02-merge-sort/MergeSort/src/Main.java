import java.util.Arrays;

public class Main {
    // merge 2 sorted arrays
    public static int[] merge(int[] array1, int[] array2) {
        int[] combine = new int[array1.length + array2.length];
        
        int index = 0, i = 0, j = 0;
        
        while (i < array1.length && j < array2.length) {
            if (array1[i] < array2[j]) {
                combine[index] = array1[i];
                index++;
                i++;
            } else {
                combine[index] = array2[j];
                index++;
                j++;
            }
        }
        
        while (i < array1.length) {
            combine[index] = array1[i];
            index++;
            i++;
        }
        
        while (j < array2.length) {
            combine[index] = array2[j];
            index++;
            j++;
        }
        
        return combine;
    }
    
    // merge 2 array
    public static int[] mergeSort(int[] array) {
        if (array.length == 1) return array;
        int midIndex = array.length / 2;
        int[] left = mergeSort(Arrays.copyOfRange(array, 0, midIndex));
        int[] right = mergeSort(Arrays.copyOfRange(array, midIndex, array.length));
        
        return merge(left, right);
        
        /*
         * Space complexity: O(n)
         * -> nhieu item can nhieu bo nho khi tach
         *
         * Time complexity: O(n * log(n))
         * -> khi tach doi mang (O(log(n))). 8 item tach 3 lan
         * -> khi nhap mang dung merge (O(n))
         *==> tong O(n * log(n))
         *
         * */
    }
    
    public static void main(String[] args) {
//        int[] num1 = {1,3,7,8};
//        int[] num2 = {2,4,5,6};
        int[] num3 = {3,1,4,2};
        
        System.out.println(Arrays.toString(mergeSort(num3)));
        
        /*
        * BEFORE: [3,1,4,2]
        * AFTER : [1,2,3,4]
        * */
    }
}
