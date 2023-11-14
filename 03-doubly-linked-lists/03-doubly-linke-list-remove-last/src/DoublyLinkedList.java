public class DoublyLinkedList {
    
    private Node head;
    private Node tail;
    private int length;
    
    class Node {
        int value;
        Node next;
        Node prev;
        
        Node(int value) {
            this.value = value;
        }
    }
    
    public DoublyLinkedList(int value) {
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
    
    // append
    public void append(int value) {
        // create new node
        Node newNode = new Node(value);
        
        if (length == 0) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        length++;
    }
    
    // remove last
    public Node removeLast() {
        if (length == 0) return null;
        Node temp = tail;
        tail = tail.prev;
        temp.next = null;
        temp.prev = null;
        length--;
        return temp;
    }
}