public class Main {
    // factorial: 4! = 4 * 3 * 2 * 1
    public static int factorial(int num) {
        if (num == 1) return 1;
        return num * factorial( num - 1);
    }
    
    public static void main(String[] args) {
        int factorial = factorial(5);
        System.out.println(factorial);
    }
}
