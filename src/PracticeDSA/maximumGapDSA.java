package PracticeDSA;
import java.util.Arrays;

public class maximumGapDSA {
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
}
