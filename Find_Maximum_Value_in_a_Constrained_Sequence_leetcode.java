package LEETCODE;

import java.util.Arrays;

public class Find_Maximum_Value_in_a_Constrained_Sequence_leetcode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 10;
		int[][] restrictions = { { 3, 1 }, { 8, 1 } };
		int[] diff = { 2, 2, 3, 1, 4, 5, 1, 1, 2 };
		System.out.println(findMaxVal(n, restrictions, diff));
	}

	public static int findMaxVal(int n, int[][] restrictions, int[] diff) {
		int[] arr = new int[n];
		Arrays.fill(arr, Integer.MAX_VALUE);
		arr[0] = 0;
		for (int[] r : restrictions) {
			int i = r[0];
			int v = r[1];
			arr[i] = Math.min(arr[i], v);
		}
		for (int i = 0; i < n - 1; i++) {
			arr[i + 1] = Math.min(arr[i + 1], arr[i] + diff[i]);
		}
		for (int i = n - 2; i >= 0; i--) {
			arr[i] = Math.min(arr[i], arr[i + 1] + diff[i]);
		}
		int max = 0;
		for (int i : arr) {
			max = Math.max(max, i);
		}
		return max;
	}
}
