package LEETCODE;

public class Jump_Game_55 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 2, 2, 1, 0, 4 };
		System.out.println(canJump(nums));
	}

	public static boolean canJump(int[] nums) {
		int last = nums.length - 1;

		for (int i = nums.length - 2; i >= 0; i--) {
			if (i + nums[i] >= last) {
				last = i;
			}
		}

		return last == 0;
	}

}
