package PracticeDSA;

public class searchDSA {
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
}
