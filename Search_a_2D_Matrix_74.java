package LEETCODE;

public class Search_a_2D_Matrix_74 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matrix = { { 1, 3, 5, 7 }, { 10, 11, 16, 20 }, { 23, 30, 34, 60 } };
		int target = 3;
		System.out.println(searchMatrix(matrix, target));
	}

	public static boolean searchMatrix(int[][] matrix, int target) {
		return binary_search(matrix, target);
	}

	public static boolean binary_search(int[][] arr, int k) {
		int r = arr.length;
		int c = arr[0].length;
		int lo = 0;
		int hi = r * c - 1;

		while (lo <= hi) {
			int mid = (lo + hi) / 2;
			int i = mid / c;
			int j = mid % c;
			if (arr[i][j] == k) {
				return true;
			} else if (arr[i][j] > k) {
				hi = mid - 1;
			} else {
				lo = mid + 1;
			}
		}
		return false;
	}

}
