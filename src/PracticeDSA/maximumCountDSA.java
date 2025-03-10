package PracticeDSA;

public class maximumCountDSA {
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
}
