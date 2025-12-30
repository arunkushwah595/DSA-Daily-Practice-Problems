package LEETCODE;

import java.util.HashSet;

public class Magic_Squares_In_Grid_840 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] grid = { { 4, 3, 8, 4 }, { 9, 5, 1, 9 }, { 2, 7, 6, 2 } };
		System.out.println(numMagicSquaresInside(grid));
	}

	public static int numMagicSquaresInside(int[][] grid) {
		int row = grid.length;
		int col = grid[0].length;
		if (row < 3 || col < 3) {
			return 0;
		}
		int cnt = 0;
		for (int r = 0; r < grid.length - 2; r++) {
			for (int c = 0; c < grid[0].length - 2; c++) {
				if (check(grid, r, c)) {
					cnt++;
				}
			}
		}
		return cnt;
	}

	private static boolean check(int[][] arr, int r, int c) {
		// TODO Auto-generated method stub
		HashSet<Integer> set = new HashSet<Integer>();
		boolean[] freq = new boolean[9];
		for (int i = r; i < r + 3; i++) {
			int sum = 0;
			for (int j = c; j < c + 3; j++) {
				sum += arr[i][j];
				if (arr[i][j] == 0 || arr[i][j] > freq.length || freq[arr[i][j] - 1]) {
					return false;
				}
				freq[arr[i][j] - 1] = true;
			}
			if (set.isEmpty()) {
				set.add(sum);
			} else if (!set.contains(sum)) {
				return false;
			}
		}
		for (int j = c; j < c + 3; j++) {
			int sum = 0;
			for (int i = r; i < r + 3; i++) {
				sum += arr[i][j];
			}
			if (!set.contains(sum)) {
				return false;
			}
		}

		int i = r;
		int j = c;
		int sum = 0;
		while (i < r + 3 && j < c + 3) {
			sum += arr[i][j];
			i++;
			j++;
		}
		if (!set.contains(sum)) {
			return false;
		}
		i = r;
		j = c + 2;
		sum = 0;
		while (i < r + 3 && j >= 0) {
			sum += arr[i][j];
			i++;
			j--;
		}
		if (!set.contains(sum)) {
			return false;
		}
		return true;
	}

}
