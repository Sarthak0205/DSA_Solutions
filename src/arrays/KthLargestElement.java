package arrays;

import java.util.PriorityQueue;

public class KthLargestElement {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> heap=new PriorityQueue<>();
        for (int i:nums){
            heap.add(i);
            if (heap.size()>k) heap.poll();
        }

        return heap.peek();
    }
}
