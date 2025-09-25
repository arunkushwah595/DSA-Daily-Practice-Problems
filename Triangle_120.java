package LEETCODE;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Triangle_120 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] triangles = { { 2 }, { 3, 4 }, { 6, 5, 7 }, { 4, 1, 8, 3 } };
		List<List<Integer>> triangle = new ArrayList<List<Integer>>();
		for (int[] arr : triangles) {
			List<Integer> ll = new ArrayList<Integer>();
			for (int i : arr) {
				ll.add(i);
			}
			triangle.add(ll);
		}
		System.out.println(minimumTotal(triangle));
	}

	public static int minimumTotal(List<List<Integer>> triangle) {
		int[][] dp = new int[triangle.size()][triangle.size()];
		for (int[] a : dp) {
			Arrays.fill(a, Integer.MAX_VALUE);
		}
		return min_path_sum(triangle, 0, 0, dp);
	}

	public static int min_path_sum(List<List<Integer>> ll, int i, int j, int[][] dp) {
		if (i >= ll.size() || j >= ll.get(i).size()) {
			return 0;
		}
		if (dp[i][j] != Integer.MAX_VALUE) {
			return dp[i][j];
		}
		int val = ll.get(i).get(j);
		int f = val + min_path_sum(ll, i + 1, j, dp);
		int s = val + min_path_sum(ll, i + 1, j + 1, dp);
		return dp[i][j] = Math.min(f, s);
	}

}
