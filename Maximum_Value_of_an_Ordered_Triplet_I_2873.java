package LEETCODE;

public class Maximum_Value_of_an_Ordered_Triplet_I_2873 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 12, 6, 1, 2, 7 };
		System.out.println(maximumTripletValue(nums));
	}

	public static long maximumTripletValue(int[] nums) {
		long maxTriplet = 0, maxNum = 0, maxDiff = 0;
		for (int i : nums) {
			maxTriplet = Math.max(maxTriplet, maxDiff * i);
			maxNum = Math.max(maxNum, i);
			maxDiff = Math.max(maxNum - i, maxDiff);
		}
		return maxTriplet;
	}

}
