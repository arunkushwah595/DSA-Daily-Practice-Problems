package LEETCODE;

import java.util.Arrays;

public class Non_overlapping_Intervals_435 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] intervals = { { 1, 2 }, { 2, 3 }, { 3, 4 }, { 1, 3 } };
		System.out.println(eraseOverlapIntervals(intervals));
	}

	public static int eraseOverlapIntervals(int[][] intervals) {
		Arrays.sort(intervals, (a, b) -> a[1] - b[1]);
		int prev = intervals[0][1];
		int c = 0;
		for (int i = 1; i < intervals.length; i++) {
			if (intervals[i][0] < prev) {
				c++;
			}

			else {
				prev = intervals[i][1];
			}
		}
		return c;

	}

}
