package LEETCODE;

public class Jump_Game_IX_leetcode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 2, 3, 1 };
		for (int i : maxValue(nums)) {
			System.out.println(i);
		}
	}

	public static int[] maxValue(int[] nums) {
		int n = nums.length;
		int[] ans = new int[nums.length];
		int[] preffix = new int[nums.length];
		preffix[0] = nums[0];
		int[] suffix = new int[nums.length];
		suffix[suffix.length - 1] = nums[nums.length - 1];
		for (int i = 1; i < suffix.length; i++) {
			preffix[i] = Math.max(preffix[i - 1], nums[i]);
		}
		for (int i = nums.length - 2; i >= 0; i--) {
			suffix[i] = Math.min(suffix[i + 1], nums[i]);
		}

		for (int i = 0; i < suffix.length; i++) {
			nums[i] = Math.max(suffix[i], preffix[i]);
		}
		int start = 0;
		int curMax = nums[0];

		for (int i = 0; i < n - 1; ++i) {
			curMax = Math.max(curMax, nums[i]);
			if (preffix[i] <= suffix[i + 1]) {
				for (int j = start; j <= i; ++j) {
					ans[j] = curMax;
				}
				start = i + 1;
				if (start < n) {
					curMax = nums[start];
				}
			}
		}
		curMax = Math.max(curMax, nums[n - 1]);
		for (int j = start; j < n; ++j) {
			ans[j] = curMax;
		}
		return ans;
	}

}
