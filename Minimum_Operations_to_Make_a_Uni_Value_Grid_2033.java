package LEETCODE;

public class Minimum_Operations_to_Make_a_Uni_Value_Grid_2033 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] grid = { { 2, 4 }, { 6, 8 } };
		int x = 2;
		System.out.println(minOperations(grid, x));
	}

	public static int minOperations(int[][] grid, int x) {
		int[] arr = new int[grid.length * grid[0].length];
		int idx = 0;
		for (int[] in : grid) {
			for (int v : in) {
				arr[idx++] = v;
			}
		}

		int mid = arr[arr.length / 2];

		int to = 0; // total operations
		for (int i : arr) {
			if (Math.abs(i - mid) % x != 0) {
				return -1;
			}
			to += Math.abs(i - mid) / x;
		}

		return to;
	}

}
