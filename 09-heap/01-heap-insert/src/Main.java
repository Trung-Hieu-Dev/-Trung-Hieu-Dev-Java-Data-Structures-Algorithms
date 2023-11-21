public class Main {
    public static void main(String[] args) {
        Heap myHeap = new Heap();
        
        myHeap.insert(99);
        myHeap.insert(72);
        myHeap.insert(61);
        myHeap.insert(58);
        
        System.out.println("First heap: ");
        System.out.println(myHeap.getHeap());
        
        System.out.println("\nAfter 100: ");
        myHeap.insert(100);
        System.out.println(myHeap.getHeap());
        
        System.out.println("\nAfter 75: ");
        myHeap.insert(75);
        System.out.println(myHeap.getHeap());
        
        /*
        * Expected:
        *
            First heap:
            [99, 72, 61, 58]
            
            After 100:
            [100, 99, 61, 58, 72]
            
            After 75:
            [100, 99, 75, 58, 72, 61]
        
        * */
        
    }
}
