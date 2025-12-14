package LEETCODE;

import java.util.Arrays;

public class Minimum_Moves_to_Balance_Circular_Array_leetcode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] balance = { 5, 1, -4 };
		System.out.println(minMoves(balance));
	}

	public static long minMoves(int[] balance) {
		int n = balance.length;
		long sum = 0;
		int idx = -1;
		for (int i = 0; i < balance.length; i++) {
			if (balance[i] < 0) {
				idx = i;
			}
			sum += balance[i];
		}
		if (sum < 0) {
			return -1;
		}
		if (idx == -1) {
			return 0;
		}

		int need = -balance[idx];
		long arr[][] = new long[n - 1][2];
		int index = 0;
		for (int i = 0; i < n; i++) {
			if (balance[i] > 0) {
				int d = Math.abs(i - idx);
				int dist = Math.min(d, n - d);
				arr[index][0] = dist;
				arr[index++][1] = balance[i];
			}
		}
		Arrays.sort(arr, (a, b) -> Long.compare(a[0], b[0]));
		long moves = 0;
		for (long[] src : arr) {
			if (need == 0) {
				break;
			}
			long take = Math.min(src[1], need);
			need -= take;
			moves += take * src[0];
		}

		return moves;
	}

}
