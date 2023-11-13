public class Main {
    public static void main(String[] args) {
        
        LinkedList myList = new LinkedList(1);
        myList.append(2);
        myList.append(3);
        myList.append(4);
        myList.append(5);
        
        Boolean hasLoop = myList.hasLoop();
        System.out.println(hasLoop); // Output: false
        
    }
}
