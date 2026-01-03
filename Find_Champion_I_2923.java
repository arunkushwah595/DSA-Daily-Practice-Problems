package LEETCODE;

public class Find_Champion_I_2923 {

	public static void main(String[] args) {
		int[][] grid = { { 0, 1 }, { 0, 0 } };
		System.out.println(findChampion(grid));
	}

	public static int findChampion(int[][] grid) {
		int[] in = new int[grid.length];
		for (int i = 0; i < in.length; i++) {
			for (int j = 0; j < in.length; j++) {
				if (grid[i][j] == 1) {
					in[j]++;
				}
			}
		}
		for (int i = 0; i < in.length; i++) {
			if (in[i] == 0) {
				return i;
			}
		}
		return -1;
	}
}
