public class BinarySearchTree {
    public Node root;
    
    class Node {
        public int value;
        public Node left;
        public Node right;
        
        Node(int value) {
            this.value = value;
        }
    }
    
    // insert: return boolean
    public boolean insert(int value) {
        Node newNode = new Node(value);
        
        // Case 1: Empty
        if (root == null) {
            root = newNode;
            return true;
        }
        
        // Case 2: Not empty
        Node temp = root;
        while (true) {
            if (newNode.value == temp.value) return false;
            // Insert left if value < root
            if (newNode.value < temp.value) {
                // Case left has no leaf
                if (temp.left == null) {
                    temp.left = newNode;
                    return true;
                }
                // move temp to next
                temp = temp.left;
            } else { // Insert left if value > root
                // Case left has no leaf
                if (temp.right == null) {
                    temp.right = newNode;
                    return true;
                }
                // move temp to next
                temp = temp.right;
            }
        }
    }
    
    // contains: return boolean
    public boolean contains(int value) {
        Node newNode = new Node(value);
        
        if (root == null) return false;
        
        Node temp = root;
        while (temp != null) {
            if (value < temp.value) {
                temp = temp.left;
            } else if (value > temp.value) {
                temp = temp.right;
            } else {
              return true;
            }
        }
        
        return false;
    }
    
    // recursive contains
    private boolean rContains(Node currentNode, int value) {
        // case 1: empty
        if (currentNode == null) return false;
        
        // case 2: return true if value in tree
        if (currentNode.value == value) return true;
        
        // recursive loop to find element
        if (value < currentNode.value) {
           return rContains(currentNode.left, value);
        } else {
            return rContains(currentNode.right, value);
        }
    }
    
    public boolean rContains(int value) {
        return rContains(root, value);
    }
}
