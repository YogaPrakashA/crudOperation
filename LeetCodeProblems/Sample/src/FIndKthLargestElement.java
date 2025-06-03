import java.util.PriorityQueue;

public class FIndKthLargestElement {

    public static void main(String[] args) {
        int[] nums = {3, 2, 1, 5, 6, 4};
        int k = 2;

        System.out.println("Kth largest: " + findKthLargest(nums, k)); // Output: 5

    }

    public static int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for (int num : nums) {
            minHeap.offer(num);
            if (minHeap.size() > k) {
                minHeap.poll(); // remove smallest in heap
            }
        }

        return minHeap.peek(); // kth largest
    }
}
