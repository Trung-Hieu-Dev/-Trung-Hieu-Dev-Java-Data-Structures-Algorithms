public class Main {
    public static void main(String[] args) {
        DoublyLinkedList myDLL = new DoublyLinkedList(1);
        myDLL.append(2);
        myDLL.append(3);
        myDLL.append(2);
        myDLL.append(1);
        
        System.out.println("DLL list:");
        myDLL.printList();
        System.out.println();
        
        System.out.println("DLL list is Palindrome: " + myDLL.isPalindrome());
        
        

        /*
            EXPECTED OUTPUT:
            ----------------
            DLL list:
            1
            2
            3
            2
            1
            
            DLL list is Palindrome: true

        */
    }
}
