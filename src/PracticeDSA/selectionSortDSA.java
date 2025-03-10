package PracticeDSA;

public class selectionSortDSA {
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
}
