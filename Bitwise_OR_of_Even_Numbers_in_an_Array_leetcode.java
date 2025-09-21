package LEETCODE;

public class Bitwise_OR_of_Even_Numbers_in_an_Array_leetcode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 1, 2, 3, 4, 5, 6 };
		System.out.println(evenNumberBitwiseORs(nums));
	}

	public static int evenNumberBitwiseORs(int[] nums) {
		return even_number(nums);
	}

	public static int even_number(int[] arr) {
		int ans = 0;
		boolean isitpossible = false;
		for (int i : arr) {
			if (i % 2 == 0) {
				ans = ans | i;
				isitpossible = true;
			}
		}
		if (isitpossible) {
			return ans;
		} else {
			return 0;
		}
	}
}
