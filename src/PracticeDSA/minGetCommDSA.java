package PracticeDSA;
import java.util.HashSet;

public class minGetCommDSA {
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


}
