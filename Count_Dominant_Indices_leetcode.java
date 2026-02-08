package LEETCODE;

public class Count_Dominant_Indices_leetcode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 50, 98, 75, 26 };
		System.out.println(dominantIndices(nums));
	}

	public static int dominantIndices(int[] nums) {
		if (nums.length == 1) {
			return 0;
		}
		double[] avg = new double[nums.length];
		for (int i = nums.length - 2; i >= 0; i--) {
			avg[i] = (double) ((double) nums[i + 1] + avg[i + 1]);
		}
		int c = 0;
		for (int i = 0; i < nums.length - 1; i++) {
			if (nums[i] > (avg[i] / (nums.length - 1 - i))) {
				c++;
			}
		}
		return c;
	}

}
