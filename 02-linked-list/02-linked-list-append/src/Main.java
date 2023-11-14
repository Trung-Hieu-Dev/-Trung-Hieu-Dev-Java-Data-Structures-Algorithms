public class Main {
    public static void main(String[] args) {
        
        LinkedList myLinkedList = new LinkedList(4);
        
        System.out.println("\nLinked List:");
        
        myLinkedList.append(2);
        
        myLinkedList.printList();

        /*
            EXPECTED OUTPUT:
            ----------------
            
            Linked List:
            4
            2
        */
        
    }
}
