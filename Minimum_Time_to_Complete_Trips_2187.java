package LEETCODE;

public class Minimum_Time_to_Complete_Trips_2187 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] time = { 1, 2, 3 };
		int totalTrips = 5;
		System.out.println(minimumTime(time, totalTrips));
	}

	public static long minimumTime(int[] time, int totalTrips) {
		long min = Long.MAX_VALUE;
		for (int i : time) {
			min = Math.min(i, min);
		}
		long lo = min;
		long hi = lo * totalTrips;
		while (lo < hi) {
			long mid = lo + (hi - lo) / 2;
			if (isitpossible(mid, time, totalTrips)) {
				hi = mid;
			} else {
				lo = mid + 1;
			}
		}
		return lo;
	}

	private static boolean isitpossible(long mid, int[] time, int totalTrips) {
		// TODO Auto-generated method stub
		long c = 0;
		for (int i : time) {
			c += mid / i;
		}
		if (c >= totalTrips) {
			return true;
		}
		return false;
	}

}
