public class Main {
    public static void main(String[] args) {
        BinarySearchTree myBST = new BinarySearchTree();
        
        myBST.insert(47);
        myBST.insert(21);
        myBST.insert(76);
        myBST.insert(18);
        myBST.insert(27);
        myBST.insert(52);
        myBST.insert(82);
        
        System.out.println(myBST.BFS());
        System.out.println(myBST.DFSPreOrder());
        System.out.println(myBST.DFSPostOrder());
        
        /*
        * EXPECTED OUTPUT
        * ---------------
        * Breadth First Search:
        * [47, 21, 76, 18, 27, 52, 82]
        *
        * Depth First Search Preorder:
        * [47, 21, 18, 27, 76, 52, 82]
        *
        * Depth First Search postorder:
        * [18, 27, 21, 52, 82, 76, 47]
        * */
    }
}
