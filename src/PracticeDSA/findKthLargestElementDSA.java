package PracticeDSA;
import java.util.Arrays;
import java.util.PriorityQueue;

public class findKthLargestElementDSA {
	public int findKthLargest(int[] nums, int k) {
		Arrays.sort(nums); 
		return nums[nums.length - k];
	}

	public int findKthLargestUsingMinHeap(int[] nums, int k) {
		PriorityQueue<Integer> minHeap = new PriorityQueue<>();
		for (int num : nums) {
			minHeap.add(num); 
			if (minHeap.size() > k) {
				minHeap.poll(); // helps to remove smallest element
			}
		}
		return minHeap.peek(); 

	}
}
