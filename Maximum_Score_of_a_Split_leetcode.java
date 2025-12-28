package LEETCODE;

public class Maximum_Score_of_a_Split_leetcode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 10, -1, 3, -4, -5 };
		System.out.println(maximumScore(nums));
	}

	public static long maximumScore(int[] nums) {
		long[] pre = new long[nums.length];
		long[] suff = new long[nums.length];
		pre[0] = nums[0];
		for (int i = 1; i < suff.length; i++) {
			pre[i] = pre[i - 1] + nums[i];
		}
		suff[nums.length - 1] = Long.MAX_VALUE;
		for (int i = nums.length - 2; i >= 0; i--) {
			suff[i] = Math.min(suff[i + 1], nums[i + 1]);
		}
		long ans = Long.MIN_VALUE;
		for (int i = 0; i < suff.length; i++) {
			ans = Math.max(ans, pre[i] - suff[i]);
		}
		return ans;
	}

}
