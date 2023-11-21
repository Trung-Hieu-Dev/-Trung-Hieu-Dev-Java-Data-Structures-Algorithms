public class Main {
    public static void main(String[] args) {
        Heap myHeap = new Heap();
        
        myHeap.insert(95);
        myHeap.insert(75);
        myHeap.insert(80);
        myHeap.insert(55);
        myHeap.insert(60);
        myHeap.insert(50);
        myHeap.insert(65);
        
        System.out.println("Before remove");
        System.out.println(myHeap.getHeap());
        
        System.out.println("\nAfter remove");
        System.out.println("Removed: " + myHeap.remove());
        System.out.println(myHeap.getHeap());
        
        System.out.println("\nAfter remove");
        System.out.println("Removed: " + myHeap.remove());
        System.out.println(myHeap.getHeap());
        
        /*
        * Expected:
        *
            Before remove:
            [95, 75, 80, 55, 60, 50, 65]
            
            After remove, heap will order for the right:
            Removed: 95
            [80, 75, 65, 55, 60, 50]
            
            After remove, heap will order for the left:
            Removed: 80
            [75, 60, 65, 55, 50]
        
        * */
        
    }
}
