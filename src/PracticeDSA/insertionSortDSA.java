package PracticeDSA;

public class insertionSortDSA {
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
}
