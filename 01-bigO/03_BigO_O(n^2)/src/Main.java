public class Main {
    // BigO: O(2^n) -> loop n * n
    // O(n) run faster than O(n^n)
    // => Time O(n) Complexity is less than O(n^n)
    public static void printItems(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println(i + " " + j);
            }
        }
    }
    
    public static void main(String[] args) {
        printItems(10);
    }
}
