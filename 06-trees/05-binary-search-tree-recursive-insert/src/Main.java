public class Main {
    public static void main(String[] args) {
        BinarySearchTree myBST = new BinarySearchTree();
        
        myBST.rInsert(2);
        myBST.rInsert(1);
        myBST.rInsert(3);
        
        /*
        * THE LINE ABOVE CREATED THIS TREE
        *       2
        *    /      \
        *   1       3
        *
        * */
        
        System.out.println("\nRoot: " + myBST.root.value);
        System.out.println("\nRoot->Left: " + myBST.root.left.value);
        System.out.println("\nRoot->Right: " + myBST.root.right.value);

        /*
            EXPECTED OUTPUT:
            ----------------
            Root: 2
            Root->Left: 1
            Root->Right: 3

        */
    }
}
