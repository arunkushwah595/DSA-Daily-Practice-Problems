package LEETCODE;

import java.util.Arrays;

public class Minimum_Number_of_Days_to_Make_m_Bouquets_1482 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] bloomDay = { 1, 10, 3, 10, 2 };
		int m = 3, k = 1;
		System.out.println(minDays(bloomDay, m, k));
	}

	public static int minDays(int[] bloomDay, int m, int k) {
		if ((long) m * k > bloomDay.length) {
			return -1;
		}
		int lo = 1;
		int hi = Arrays.stream(bloomDay).max().getAsInt();
		while (lo < hi) {
			int mid = lo + (hi - lo) / 2;
			if (isitPossible(bloomDay, m, k, mid)) {
				hi = mid;
			} else {
				lo = mid + 1;
			}
		}
		return lo;
	}

	private static boolean isitPossible(int[] bloomDay, int m, int k, int mid) {
		// TODO Auto-generated method stub
		int t = 0;
		for (int i = 0; i < bloomDay.length; i++) {
			int c = 0;
			while (i < bloomDay.length && c < k && bloomDay[i] <= mid) {
				c++;
				i++;
			}
			if (c == k) {
				t++;
				i--;
			}
			if (t >= m) {
				return true;
			}
		}
		return false;
	}

}
