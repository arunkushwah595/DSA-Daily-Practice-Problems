package LEETCODE;

public class Minimum_Value_to_Get_Positive_Step_by_Step_Sum_1413 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { -3, 2, -3, 4, 2 };
		System.out.println(minStartValue(nums));
	}

	public static int minStartValue(int[] nums) {
		int[] pref = new int[nums.length];
		pref[0] = nums[0];
		int min = pref[0];
		for (int i = 1; i < nums.length; i++) {
			pref[i] = pref[i - 1] + nums[i];
			min = Math.min(pref[i], min);
		}
		if (min <= 0) {
			return (1 - min);
		}
		return 1;
	}

}
