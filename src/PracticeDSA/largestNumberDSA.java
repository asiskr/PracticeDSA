package PracticeDSA;
import java.util.Arrays;

public class largestNumberDSA {
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

}
