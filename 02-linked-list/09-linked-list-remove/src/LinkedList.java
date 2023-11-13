public class LinkedList {
    // CREATE CLASS VARIABLES, NODE CLASS, AND CONSTRUCTOR HERE //
    //                                                          //
    //                                                          //
    //                                                          //
    //                                                          //
    //////////////////////////////////////////////////////////////
    
    private Node head;
    private Node tail;
    private int length;
    
    class Node {
        int value;
        Node next;
        
        Node(int value) {
            this.value = value;
        }
    }
    
    public LinkedList(int value) {
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }
    
    
    
    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }
    
    public void getHead() {
        if (head == null) {
            System.out.println("Head: null");
        } else {
            System.out.println("Head: " + head.value);
        }
    }
    
    public void getTail() {
        if (head == null) {
            System.out.println("Tail: null");
        } else {
            System.out.println("Tail: " + tail.value);
        }
    }
    
    public void getLength() {
        System.out.println("Length: " + length);
    }
    
    // WRITE APPEND METHOD HERE //
    //                          //
    //                          //
    //                          //
    //                          //
    //////////////////////////////
    public void append(int value) {
        Node newNode = new Node(value);
        if (length == 0) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        length++;
    }
    
    // WRITE REMOVELAST METHOD HERE //
    //                              //
    //                              //
    //                              //
    //                              //
    //////////////////////////////////
    public Node removeLast() {
        // Case 1: Empty LinkedList
        if (length == 0) return null;
        
        // Case 2: Not Empty LinkedList
        // Step 1: loop through entire of list until the end is null
        Node temp = head; // flag to loop entire of list
        Node pre = head; // variable for keeping value of temp
        while(temp.next != null) {
            pre = temp; // keeping temp value
            temp = temp.next; // set temp value = next node
        }
        // Step 2: stop looping at the last node. And removing the last node by setting tail value = prev node
        tail = pre; // set tail value == prev node
        tail.next = null; // set linked value of the last node = null
        length--; // decrease length of list
        
        // Case 3: LinkedList has only 1 element
        if (length == 0) { // in case list length = 1. removing node will be return head & tail = null
            head = null;
            tail = null;
        }
        
        return temp; // value of the removed node
    }
    
    // WRITE PREPEND METHOD HERE //
    //                           //
    //                           //
    //                           //
    //                           //
    ///////////////////////////////
    public void prepend(int value) {
        // Step 1: Create new node, that will be added to the LinkedList
        Node newNode = new Node(value);
        
        // Step 2: Re-value for the Head Node and Pointer the current node to next node
        if (length == 0) { // Case 1: Empty List
            head = newNode; // pointer head to new node
            tail = newNode; // pointer tail to new node
        } else { // Case 2: Not Empty List
            newNode.next = head; // pointer the added node to the next node
            head = newNode; // pointer head to new node, that added to list
        }
        length++; // increase length to 1
    }
    
    // WRITE REMOVEFIRST METHOD HERE //
    //                               //
    //                               //
    //                               //
    //                               //
    ///////////////////////////////////
    public Node removeFirst() {
        // Step 1: Removing node
        // Case 1: Empty List.
        if (length == 0) return null;  // Pointer head & tail to null. And return the removed node = null
        // Case 2: Not Empty List
        Node temp = head; // create flag, this flag keeping the value for removed node
        head = head.next; // pointer head to next node
        temp.next = null; // pointer next of removed node = null
        
        // Step 2: decrease the length
        length--;
        if (length == 0) { // after removing node, if List has only 1 item, new length = 0
            tail = null; // Pointer tail to null, this move back tail to prev node
        }
        
        return temp; // return the removed node
    }
    
    /// WRITE GET METHOD HERE ///
    //                         //
    //                         //
    //                         //
    //                         //
    /////////////////////////////
    public Node get(int index) {
        // Step 1: loop to the index item
        if (index < 0 || index >= length) return null; // Case 1: return null if index out of list
        Node temp = head; // create a flag, set equal to head to get {value:?, next: ?}
        for(int i = 0; i < index; i++) {
            temp = temp.next; // Step 2: change the current node to next node
        }
        return temp; // Return the current node
    }
    
    /// WRITE SET METHOD HERE ///
    //                         //
    //                         //
    //                         //
    //                         //
    /////////////////////////////
    public boolean set(int index, int value) {
        Node temp = get(index);
        if (temp != null) {
            temp.value = value;
            return true;
        }
        return false;
    }
    
    /// WRITE INSERT METHOD HERE ///
    //                         //
    //                         //
    //                         //
    //                         //
    /////////////////////////////
    public boolean insert(int index, int value)  {
        // Case 1: Index out of length
        if (index < 0 || index > length) return false;
        
        // Case 2: Add to the beginning
        if (index == 0) {
            prepend(value);
            return true;
        }
        
        // Case 3: Add to the end
        if (index == length) {
            append(value);
            return true;
        }
        
        // Case 3: Add to the between
        Node newNode = new Node(value);
        Node temp = get(index - 1);
        newNode.next = temp.next;
        temp.next = newNode;
        length++;
        return true;
    }
    
    /// WRITE REMOVE METHOD HERE ///
    //                         //
    //                         //
    //                         //
    //                         //
    /////////////////////////////
    public Node remove(int index) {
        if (index < 0 || index >= length) return null;
        if (index == 0) return removeFirst();
        if (index == length - 1) return removeLast();
        
        Node prev = get(index - 1);
        Node temp = prev.next;
        
        prev.next = temp.next;
        temp.next = null;
        length--;
        return temp;
    }
}
