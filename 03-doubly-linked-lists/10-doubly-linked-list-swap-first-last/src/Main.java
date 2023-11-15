public class Main {
    public static void main(String[] args) {
        DoublyLinkedList myDLL = new DoublyLinkedList(1);
        myDLL.append(2);
        myDLL.append(3);
        myDLL.append(4);
        myDLL.append(5);
        
        System.out.println("DLL before swapFirstLast():");
        myDLL.printList();
        System.out.println();
        
        myDLL.swapFirstLast();
        System.out.println("DLL after swapFirstLast():");
        myDLL.printList();
        
        

        /*
            EXPECTED OUTPUT:
            ----------------
            DLL before swapFirstLast():
            1
            2
            3
            4
            5
            
            DLL before swapFirstLast():
            5
            2
            3
            4
            1

        */
    }
}
