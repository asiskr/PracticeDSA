package PracticeDSA;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.PriorityQueue;

public class ArrayOperations {

	public void traversal(int[] arr) {
		System.out.println("Array Traversal:");

		for(int i =0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	public void removeDuplicates(int[] arr) {
		HashSet<Integer> uniques = new HashSet<Integer>();
		System.out.println("\nUnique Elements:");

		for(int i =0; i<arr.length; i++) {
			if(!uniques.contains(arr[i])) {
				System.out.print(arr[i] + " ");
				uniques.add(arr[i]);
			}
		}
		System.out.println();
	}
	public void insertionAtFront(int[] arr, int ele) {
		System.out.println("\nArray after Insertion at Front:");

		for (int i = arr.length - 1; i >=1; i--) {
			arr[i] = arr[i - 1];
		}
		arr[0] = ele;

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	public void deletionionAtFront(int[] arr) {
		System.out.println("\nArray after Deletion at Front:");

		for (int i = 1; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	public void deletionionAtLast(int[] arr) {
		System.out.println("\nArray after Deletion at Last:");

		for (int i = 0; i < arr.length-1; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	public void deletionAtSpecificPosition(int[] arr, int n) {
		System.out.println("\nArray after Deletion at Specific Position:");

		for (int i = n; i < arr.length - 1; i++) {
			arr[i] = arr[i + 1];
		}

		for (int i = 0; i < arr.length - 1; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	public void insertionSpecificPosition(int[] arr, int n, int ele) {
		int newArr[]= new int[arr.length+1];
		for(int i=0; i<n; i++) {
			newArr[i]= arr[i];
		}
		newArr[n]=ele;
		for(int i=n; i<arr.length; i++) {
			newArr[i+1]= arr[i];
		}
		System.out.println("\nArray after insertion at specific location:");
		for (int i = 0; i < newArr.length; i++) {
			System.out.print(newArr[i] + " ");
		}
		System.out.println();
	}

	//Brute force Approach
	public int getCommon(int[] nums1, int[] nums2) {

		HashSet<Integer> set = new HashSet<Integer>();
		for(int i =0; i<nums1.length;i++) {
			set.add(nums1[i]);
		}
		int min=Integer.MAX_VALUE;

		for(int j=0;j<nums2.length;j++) {
			if(set.contains(nums2[j])) {
				min=Math.min(min, nums2[j]);
			}
		}	
		return min == Integer.MAX_VALUE ? -1 : min;
	}

	//good Approach
	public int minGetComm(int[] nums1, int[] nums2) {
		int i=0;
		int j=0;
		while(i<nums1.length && j<nums2.length) {

			if(nums1[i]== nums2[j]) {
				return nums1[i];
			}
			else if(nums1[i]<nums2[j]){
				i++;
			}
			else {
				j++;
			}
		}
		return -1;
	}

	//Maximun count
	public int maximumCount(int[] nums) {
		int k =0;
		int j =0;
		for(int i=0;i<nums.length;i++) {
			if(nums[i]>0) {
				k ++;
			}
			if(nums[i]<0) {
				j++;
			}
		}
		return k<j?j:k;
	}

	//Check If N and Its Double Exist
	public boolean checkIfExist(int[] arr) {
		HashSet<Integer> set = new HashSet<>();

		for (int i = 0; i < arr.length; i++) {
			if (set.contains(2 * arr[i]) || (arr[i] % 2 == 0 && set.contains(arr[i] / 2))) {
				return true;
			}
			set.add(arr[i]);
		}

		return false;
	}
	public boolean containsDuplicate(int[] nums) {
		HashSet<Integer> set = new HashSet<>();

		for (int num : nums) {
			if(set.contains(num)) {
				return true;
			}
			set.add(num);
		}
		return false;
	}

	public int search(int[] nums, int target) {
		//		HashSet<Integer> set = new HashSet<Integer>();
		for(int i=0;i<nums.length;i++) {
			if(nums[i]==target) {
				return i;
			}
			//			set.add(nums[i]);
		}
		return -1;
	}
	/*

	 */

	public String largestNumber(int[] nums) {
		StringBuilder ans = new StringBuilder();
		int left = 0;
		int right = nums.length - 1;

		String[] strNums = new String[nums.length];
		for (int i = 0; i < nums.length; i++) {
			strNums[i] = String.valueOf(nums[i]);
		}

		Arrays.sort(strNums, (a, b) -> (b + a).compareTo(a + b));

		if (strNums[0].equals("0")) {
			return "0";
		}

		while (left <= right) {
			ans.append(strNums[left]);
			left++;
		}
		return ans.toString();
	}

	public int[] bubbleSort(int[] nums) {
		Arrays.sort(nums);
		return nums;

	}
	public void selectionSort(int[] nums) {
		int minIndex=-1;
		for(int i=0;i<nums.length-1;i++) {
			minIndex=i;
			for(int j=i+1;j<nums.length;j++) {
				if(nums[minIndex]>nums[j]) {
					minIndex=j;
				}
			}
			int temp=nums[minIndex];
			nums[minIndex]=nums[i];
			nums[i]=temp;
		}
		for(int num:nums)
			System.out.print(num);
	}
	public void insertionSort(int[] nums) {
		for(int i=1;i<nums.length;i++) {
			int key =nums[i];
			int j =i-1;
			while(j>=0 && nums[j]>key) {
				nums[j+1]=nums[j]; 
				j--;
			}
			nums[j+1]=key;
		}
		for(int num:nums)
			System.out.print(num);	       
	}

	public void quickSort(int[] nums, int low, int high) {
		if (low < high) {
			int pivotIndex = partition(nums, low, high);
			quickSort(nums, low, pivotIndex - 1);
			quickSort(nums, pivotIndex + 1, high);
		}
	}

	private int partition(int[] nums, int low, int high) {
		int pivot = nums[high];
		int i = low - 1;

		for (int j = low; j < high; j++) {
			if (nums[j] < pivot) {
				i++;
				swap(nums, i, j);
			}
		}
		swap(nums, i + 1, high);
		return i + 1;
	}
	private void swap(int[] nums, int i, int j) {
		int temp = nums[i];
		nums[i] = nums[j];
		nums[j] = temp;
	}


	public int max(int[] nums) {
		Arrays.sort(nums);
		return -1;
	}

	//O(NlogN)
	public int maximumGap(int[] nums) {
		int max=Integer.MIN_VALUE;
		Arrays.sort(nums);
		if(nums.length==0) {
			return 0;
		}
		for(int i =0;i<nums.length-1;i++) {
			int ans=nums[i+1]-nums[i];
			if(ans>max) {
				//				System.out.println(ans);
				max=ans;

			}

		}
		//		System.out.println(max);
		return max==Integer.MIN_VALUE ? 0 : max;
	}


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
	public static void main(String args[]) {
		ArrayOperations trav = new ArrayOperations();
		int arr[] = {3,6,9,1};
		int arr2[] = {3,2,1,5,6,4};
		//		trav.traversal(arr);
		//		trav.removeDuplicates(arr);
		//		trav.insertionSpecificPosition(arr, 6, 69);
		//		trav.insertionAtFront(arr, 34);
		//		trav.deletionionAtFront(arr);
		//		trav.deletionionAtLast(arr);
		//		trav.deletionAtSpecificPosition(arr, 3);
		//		int result = trav.getCommon(arr, arr2);
		//		System.out.println("Output: " + result);
		//		int resultMin = trav.minGetComm(arr, arr2);
		//		System.out.println("Output Min: " + resultMin);
		//		int resultMax = trav.maximumCount(arr);
		//		System.out.println("Output Max: " + resultMax);
		//		boolean output = trav.containsDuplicate(arr2);
		//		System.out.println("Output : " + output);
		//		int resultMax =trav.search(arr2, 3);
		//		System.out.println("Output Max: " + resultMax);
		//		int[] resultMax =trav.bubbleSort(arr2);
		//		System.out.println("Output Max: " + resultMax);
		//		trav.bubbleSort(arr2);
		//		trav.insertionSort(arr2);
		int resultMax =trav.findKthLargest(arr2, 2);
		System.out.println("Output Max: " + resultMax);
		//
		//		trav.selectionSort(arr2);
	}
}
