import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

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
    
    // recursive insert
    private Node rInsert(Node currentNode, int value) {
        if (currentNode == null) {
            return new Node(value);
        }
        
        if (value < currentNode.value) {
            currentNode.left = rInsert(currentNode.left, value);
        } else if (value > currentNode.value){
            currentNode.right = rInsert(currentNode.right, value);
        }
        
        return currentNode;
    }
    
    public void rInsert(int value) {
        if (root == null) root = new Node(value);
        rInsert(root, value);
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
    
    // min value
    public int mintValue(Node currentNode) {
        while (currentNode.left != null) {
            currentNode = currentNode.left;
        }
        return currentNode.value;
    }
    
    // recursive delete
    private Node delete(Node currentNode, int value) {
        // case 1: if node is not in tree
        if (currentNode == null) return null;
        
        if (value < currentNode.value) {
            currentNode.left = delete(currentNode.left, value);
        } else if (value > currentNode.value) {
            currentNode.right = delete(currentNode.right, value);
        } else {
            // find the node and delete
            if (currentNode.left == null && currentNode.right == null) { // case 1: have no leaf
                return null;
            } else if (currentNode.left == null) { // case 2: have right leaf
                currentNode = currentNode.right;
            } else if (currentNode.right == null) { // case 3: have left leaf
                currentNode = currentNode.left;
            } else { // have both left and right leaf
                int subTreeMin = mintValue(currentNode.right); // find min on the right
                currentNode.value = subTreeMin; // copy min value to the current
                currentNode.right = delete(currentNode.right, subTreeMin); // remove the min in subtree
            }
        }
        
        return currentNode;
    }
    
    public void delete(int value) {
        delete(root, value);
    }
    
    // breath first search
    public ArrayList<Integer> BFS() {
        Node currentNode = root;
        ArrayList<Integer> results = new ArrayList<>();
        Queue<Node> queue = new LinkedList<>();
        queue.add(currentNode);
        
        while (!queue.isEmpty()) {
            currentNode = queue.remove();
            results.add(currentNode.value);
            
            if (currentNode.left != null) {
                queue.add(currentNode.left);
            }
            
            if (currentNode.right != null) {
                queue.add(currentNode.right);
            }
        }
        
        return results;
    }
    
    // depth first search preorder
    public ArrayList<Integer> DFSPreOrder() {
        ArrayList<Integer> results = new ArrayList<>();
        
        // using nested loop, but in java does not allow creating nested loop
        // this is a trick for that (create a class and use constructor)
        class Traversal {
            public Traversal(Node currentNode) {
                results.add(currentNode.value);
                if (currentNode.left != null) {
                    new Traversal(currentNode.left);
                }
                if (currentNode.right != null) {
                    new Traversal(currentNode.right);
                }
            }
        }
        
        new Traversal(root);
        
        return results;
    }
    
    // depth first search postorder
    public ArrayList<Integer> DFSPostOrder() {
        ArrayList<Integer> results = new ArrayList<>();
        
        class Traversal {
            public Traversal(Node currentNode) {
                if (currentNode.left != null) {
                    new Traversal(currentNode.left);
                }
                if (currentNode.right != null) {
                    new Traversal(currentNode.right);
                }
                results.add(currentNode.value);
            }
        }
        
        new Traversal(root);
        
        return results;
    }
    
    // depth first search in-order
    public ArrayList<Integer> DFSInOrder() {
        ArrayList<Integer> results = new ArrayList<>();
        
        class Traversal {
            public Traversal(Node currentNode) {
                if (currentNode.left != null) {
                    new Traversal(currentNode.left);
                }
                results.add(currentNode.value);
                if (currentNode.right != null) {
                    new Traversal(currentNode.right);
                }
            }
        }
        
        new Traversal(root);
        
        return results;
    }
}
