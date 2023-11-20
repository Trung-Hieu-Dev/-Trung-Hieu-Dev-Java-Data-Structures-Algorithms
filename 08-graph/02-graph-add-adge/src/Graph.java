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
}
