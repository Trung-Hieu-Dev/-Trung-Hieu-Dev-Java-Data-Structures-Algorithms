import java.util.ArrayList;
import java.util.HashMap;

public class Graph {
    private HashMap<String, ArrayList<String>> adjList = new HashMap<>();
    
    // print graph
    public void printGraph() {
        System.out.println(this.adjList);
    }
    
    // add vertex
    public boolean addVertex(String vertex) {
        if (this.adjList.get(vertex) == null) {
            this.adjList.put(vertex, new ArrayList<>());
            return true;
        }
        return false;
    }
    
    // add undirected edge
    public boolean addEdge(String vertext1, String vertext2) {
        if (this.adjList.get(vertext1) != null && this.adjList.get(vertext2) != null) {
            this.adjList.get(vertext1).add(vertext2);
            this.adjList.get(vertext2).add(vertext1);
            return true;
        }
        return false;
    }
    
    // remove undirected edge
    public boolean removeEdge(String vertext1, String vertext2) {
        if (this.adjList.get(vertext1) != null && this.adjList.get(vertext2) != null) {
            this.adjList.get(vertext1).remove(vertext2);
            this.adjList.get(vertext2).remove(vertext1);
            return true;
        }
        return false;
    }
}
