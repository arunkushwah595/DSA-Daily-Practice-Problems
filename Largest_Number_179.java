package LEETCODE;

import java.util.Arrays;

public class Largest_Number_179 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 3, 30, 34, 5, 9 };
		System.out.println(largestNumber(nums));

	}

	public static String largestNumber(int[] nums) {
		String[] arr = new String[nums.length];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = String.valueOf(nums[i]);
		}
		Arrays.sort(arr, (a, b) -> (b + a).compareTo(a + b));
		if (arr[0].equals("0")) {
			return "0";
		}
		StringBuilder sb = new StringBuilder();
		for (String s : arr) {
			sb.append(s);
		}
		return sb.toString();
	}

}
