package LEETCODE;

import java.util.*;

public class Count_Days_Without_Meetings_3169 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int days = 10;
		int[][] meetings = { { 5, 7 }, { 1, 3 }, { 9, 10 } };
		System.out.println(countDays(days, meetings));
	}

	public static int countDays(int days, int[][] meetings) {
		Arrays.sort(meetings, Comparator.comparingInt(a -> a[0]));
		int prevd = 0;
		for (int[] arr : meetings) {
			int s = Math.max(prevd + 1, arr[0]);
			int l = arr[1] - s + 1;
			days -= Math.max(l, 0);
			prevd = Math.max(arr[1], prevd);
		}
		return days;
	}

}
