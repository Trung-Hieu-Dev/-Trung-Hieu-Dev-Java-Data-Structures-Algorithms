import java.util.HashMap;

public class Main {
    // find number in common between 2 array -> BigO = O(n^2)
//    public static boolean itemInCommon(int[] array1, int[] array2) {
//        for (int i : array1) {
//            for (int j : array2) {
//                if (i == j) return true;
//            }
//        }
//        return false;
//    }
    
    // find number in common between 2 array -> BigO = O(2n)
    public static boolean itemInCommon(int[] array1, int[] array2) {
        HashMap<Integer, Boolean> myHashMap = new HashMap<Integer, Boolean>();
        
        for (int i : array1) {
            myHashMap.put(i, true);
        }
        
        for (int j : array2) {
            if (myHashMap.get(j) != null) return true;
        }
        
        return false;
    }
    
    public static void main(String[] args) {
        
        int[] array1 = {1, 3, 5};
        int[] array2 = {2, 4, 5};
        
        System.out.println(itemInCommon(array1, array2));
    }
}
