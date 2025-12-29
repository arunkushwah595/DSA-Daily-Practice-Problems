package LEETCODE;

public class Sum_of_All_Subset_XOR_Totals_1863 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 5, 1, 6 };
		System.out.println(XORSum(nums, 0, 0));
	}

	public static int XORSum(int[] nums, int i, int xor) {
		if (i == nums.length) {
			return xor;
		}
		int inc = XORSum(nums, i + 1, xor ^ nums[i]);
		int exc = XORSum(nums, i + 1, xor);
		return inc + exc;
	}
}
