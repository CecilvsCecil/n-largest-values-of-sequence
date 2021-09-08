import java.util.*;
public class NLargestCounter<T extends Comparable<? super T>> implements NLargest<T>{
    
    private int maxCount;
    private PriorityQueue<T> minHeap;
    
    public NLargestCounter(int n){
        
        minHeap = new PriorityQueue<>(n);
        maxCount = n;
        
    }
    
    public void count(T x){
        
        if(minHeap.size() < maxCount){
           
            minHeap.add(x);
            
        }
        
        else if(x.compareTo(minHeap.peek()) > 0){
            
            minHeap.poll();
            minHeap.add(x);
            
        }
        
    }
    
    public List<T> nlargest(){
        
        LinkedList<T> sorted = new LinkedList<>();
        int heapSize = minHeap.size(); 
        
        for(int i = 0; i < heapSize; i++){
            
            sorted.add(minHeap.poll());
            
        }
        
        for(T element : sorted){
            
            minHeap.add(element);
            
        }
   
        return sorted;
        
    }
    
}