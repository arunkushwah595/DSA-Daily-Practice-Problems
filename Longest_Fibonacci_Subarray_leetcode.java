package LEETCODE;

public class Longest_Fibonacci_Subarray_leetcode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 5, 2, 7, 9, 16 };
		System.out.println(longestSubarray(nums));
	}

	public static int longestSubarray(int[] nums) {
		int ans = 2;
		int si = 0, ei = 2, i = 0;

		while (si < ei && ei < nums.length) {
			if (nums[i] + nums[i + 1] == nums[ei]) {
				i++;
				ei++;
			} else {
				si = i + 1;
				i++;
				ei++;
			}
			ans = Math.max(ans, ei - si);
		}

		return ans;
	}

}
