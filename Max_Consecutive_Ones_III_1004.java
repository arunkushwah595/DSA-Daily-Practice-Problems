package LEETCODE;

public class Max_Consecutive_Ones_III_1004 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 0, 0, 0, 1, 1, 1, 1 };
		int k = 3;
		System.out.println(longestOnes(nums, k));
	}

	public static int longestOnes(int[] nums, int k) {
		int si = 0;
		int ei = 0;
		int flip = 0;
		int ans = 0;

		while (ei < nums.length) {

			if (nums[ei] == 0) {
				flip++;
			}

			while (flip > k && si <= ei) {
				if (nums[si] == 0) {
					flip--;
				}
				si++;
			}

			ans = Math.max(ans, ei - si + 1);
			ei++;

		}
		return ans;
	}

}
