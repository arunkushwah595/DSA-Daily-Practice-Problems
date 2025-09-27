package LEETCODE;

import java.util.Arrays;

public class Koko_Eating_Bananas_875 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] piles = { 3, 6, 7, 11 };
		int h = 8;
		System.out.println(minEatingSpeed(piles, h));
	}

	public static int minEatingSpeed(int[] piles, int h) {
		return minSpeed(piles, h);
	}

	public static int minSpeed(int[] arr, int h) {
		int lo = 1; // lowest speed
		int hi = Arrays.stream(arr).max().getAsInt(); // highest speed
		int ans = 0;
		while (lo <= hi) {
			int mid = lo + (hi - lo) / 2;
			if (isitpossible(arr, mid, h)) {
				ans = mid;
				hi = mid - 1;
			}

			else {
				lo = mid + 1;
			}
		}
		return ans;
	}

	private static boolean isitpossible(int[] arr, int mid, int h) {
		// TODO Auto-generated method stub
		int totalhrs = 0;
		for (int i : arr) {
			totalhrs += Math.ceil((double) i / mid);
		}

		return totalhrs <= h;
	}

}
