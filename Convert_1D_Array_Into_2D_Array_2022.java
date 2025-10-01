package LEETCODE;

public class Convert_1D_Array_Into_2D_Array_2022 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] original = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int m = 5, n = 2;
		for (int[] arr : convert(original, m, n)) {
			for (int i : arr) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
	}

	public int[][] construct2DArray(int[] original, int m, int n) {
		return construct2DArray(original, m, n);
	}

	public static int[][] convert(int[] arr, int row, int col) {
		if (arr.length != row * col) {
			return new int[0][0];
		}
		int[][] ans = new int[row][col];
		for (int i = 0; i < arr.length; i++) {
			int r = i / col;
			int c = i % col;
			ans[r][c] = arr[i];
		}
		return ans;
	}

}
