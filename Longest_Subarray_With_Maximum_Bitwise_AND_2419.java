package LEETCODE;

public class Longest_Subarray_With_Maximum_Bitwise_AND_2419 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 311155, 311155, 311155, 311155, 311155, 311155, 311155, 311155, 201191, 311155 };
		System.out.println(longestSubarray(nums));
	}

	public static int longestSubarray(int[] nums) {
		int max = Integer.MIN_VALUE;
		int c = 0;
		for (int i : nums) {
			if (i > max) {
				max = i;
			}
		}
		int ans = 0;
		for (int i = 0; i < nums.length; i++) {
			int curr = nums[i];
			if (max == curr) {
				c++;
				ans = Math.max(ans, c);
			} else {
				c = 0;
			}

		}
		return ans;
	}

}
