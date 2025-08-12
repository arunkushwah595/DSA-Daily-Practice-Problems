package LEETCODE;

import java.util.Arrays;

public class Minimum_Time_to_Repair_Cars_2594 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ranks = { 4, 2, 3, 1 };
		int cars = 10;

	}

	public static long repairCars(int[] ranks, int cars) {
		long l = 1;
		long r = (long) Arrays.stream(ranks).min().getAsInt() * cars * cars;

		while (l < r) {
			long mid = (l + r) / 2;
			if (isitpossible(ranks, cars, mid)) {
				r = mid;
			} else {
				l = mid + 1;
			}
		}
		return l;
	}

	private static boolean isitpossible(int[] ranks, int cars, long mid) {
		// TODO Auto-generated method stub
		int rp = 0;
		for (int i : ranks) {
			rp += Math.sqrt(mid / i);
			if (rp >= cars) {
				return true;
			}
		}

		return false;
	}

}
