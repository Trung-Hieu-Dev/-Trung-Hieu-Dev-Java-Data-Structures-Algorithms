import java.util.ArrayList;
import java.util.List;

public class Heap {
    private List<Integer> heap;
    
    public Heap() {
        this.heap = new ArrayList<>();
    }
    
    public List<Integer> getHeap() {
        return new ArrayList<>(heap);
    }
    
    private int leftChildIndex(int index) {
        return (index * 2) + 1;
    }
    
    private int rightChildIndex(int index) {
        return this.leftChildIndex(index) + 1;
    }
    
    private int parent(int index) {
        return (index - 1) / 2;
    }
    
    private void swap(int index1, int index2) {
        int temp = this.heap.get(index1);
        this.heap.set(index1, this.heap.get(index2));
        this.heap.set(index2, temp);
    }
    
    // sinkDown: điều chỉnh lại cây nhị phân sau khi xóa.
    private void sinkDown(int index) {
        int maxIndex = index;
        
        while (true) {
            int leftIndex = leftChildIndex(index);
            int rightIndex = rightChildIndex(index);
            
            if (leftIndex < this.heap.size() && this.heap.get(maxIndex) < this.heap.get(leftIndex)) {
                maxIndex = leftIndex;
            }
            
            if (rightIndex < this.heap.size() && this.heap.get(maxIndex) < this.heap.get(rightIndex)) {
                maxIndex = rightIndex;
            }
            
            if (maxIndex != index) {
                this.swap(index, maxIndex);
                index = maxIndex;
            } else {
                return;
            }
        }
    }
    
    // insert
    public void insert(int value) {
        this.heap.add(value);
        // current index of new node
        int currentIndex = this.heap.size() - 1;
        // swap if new node > parent and index > 0
        while (currentIndex > 0 && this.heap.get(currentIndex) > this.heap.get(parent(currentIndex))) {
            this.swap(currentIndex, this.parent(currentIndex));
            currentIndex = parent(currentIndex);
        }
        
    }
    
    // remove: in heap when removing, always remove the top root
    public Integer remove() {
        if (this.heap.isEmpty()) return null;
        
        if (this.heap.size() == 1) return this.heap.remove(0);
        
        int maxValue = this.heap.get(0);
        this.heap.set(0, this.heap.remove(this.heap.size() - 1));
        sinkDown(0);
        
        return maxValue;
    }
    
    
}
