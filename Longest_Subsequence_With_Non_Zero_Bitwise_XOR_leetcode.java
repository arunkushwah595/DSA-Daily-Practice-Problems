package LEETCODE;

public class Longest_Subsequence_With_Non_Zero_Bitwise_XOR_leetcode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 1, 2, 3 };
		System.out.println(longestSubsequence(nums));
	}

	public static int longestSubsequence(int[] nums) {
		boolean isallzero = true;
		int n = nums.length;
		int xor = 0;
		for (int i : nums) {
			xor = xor ^ i;
			if (i != 0) {
				isallzero = false;
			}
		}
		if (isallzero) {
			return 0;
		}
		if (xor != 0) {
			return n;
		}
		return n - 1;
	}

}
