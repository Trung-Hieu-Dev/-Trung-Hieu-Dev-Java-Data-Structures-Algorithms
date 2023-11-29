import java.util.Arrays;

public class Main {
    
    public static int[] merge(int[] array1, int[] array2) {
        int[] combine = new int[array1.length + array2.length];
        
        int index = 0;
        int i = 0;
        int j = 0;
        
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
    
    public static void main(String[] args) {
        int[] nums1 = {1,3,7,8};
        int[] nums2 = {2,4,5,6};
        int[] combine = merge(nums1, nums2);
        System.out.println(Arrays.toString(combine));
    }
}
