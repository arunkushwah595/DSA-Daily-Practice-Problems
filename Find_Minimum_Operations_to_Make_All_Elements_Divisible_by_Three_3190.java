package LEETCODE;

public class Find_Minimum_Operations_to_Make_All_Elements_Divisible_by_Three_3190 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 1, 2, 3, 4 };
		System.out.println(minimumOperations(nums));
	}

	public static int minimumOperations(int[] nums) {
		int opr = 0;
		for (int i : nums) {
			if (i % 3 != 0) {
				opr++;
			}
		}
		return opr;
	}

}
