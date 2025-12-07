package LEETCODE;

import java.util.Arrays;

public class Sort_Integers_by_Binary_Reflection_leetcode {

	public static void main(String[] args) {

	}

	public int[] sortByReflection(int[] nums) {
		Integer[] arr = new Integer[nums.length];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = nums[i];
		}
		Arrays.sort(arr, (a, b) -> {
			int ra = reverse(a);
			int rb = reverse(b);
			if (ra != rb) {
				return ra - rb;
			}
			return a - b;
		});
		for (int i = 0; i < arr.length; i++) {
			nums[i] = arr[i];
		}
		return nums;
	}

	public static int reverse(int n) {
		String s = Integer.toBinaryString(n);
		s = new StringBuilder(s).reverse().toString();
		return Integer.parseInt(s, 2);
	}

}
