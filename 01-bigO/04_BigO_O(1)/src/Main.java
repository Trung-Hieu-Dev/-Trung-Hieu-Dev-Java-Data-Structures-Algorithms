public class Main {
    // BigO: O(1) -> only 1 operation
    // Time Complexity:  O(n^2) > O(n) > O(1)
    public static int addItems(int n) {
        return n + n;
    }
    
    public static void main(String[] args) {
        System.out.println(addItems(10));
    }
}
