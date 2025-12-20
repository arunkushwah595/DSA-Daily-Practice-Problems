package LEETCODE;

import java.util.Arrays;

public class Largest_Time_for_Given_Digits_949 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 6, 0, 6, 0 };
		System.out.println(largestTimeFromDigits(arr));
	}

	public static String largestTimeFromDigits(int[] arr) {
		Arrays.sort(arr);
		for (int h = 23; h >= 0; h--) {
			for (int m = 59; m >= 0; m--) {
				int[] time = { h / 10, h % 10, m / 10, m % 10 };
				Arrays.sort(time);
				if (Arrays.equals(time, arr)) {
					String ans = "" + h + ":";
					if (h < 10) {
						ans = "0" + ans;
					}
					if (m < 10) {
						ans = ans + "0";
					}
					return ans + m;
				}
			}
		}
		return "";
	}

}
