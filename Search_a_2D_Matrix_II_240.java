package LEETCODE;

public class Search_a_2D_Matrix_II_240 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = { { 1, 3, 5, 7 }, { 10, 11, 16, 20 }, { 23, 30, 34, 60 } };
		int target = 5;
		System.out.println(search(arr, target));
	}

	public static boolean search(int[][] arr, int target) {
		int r = 0;
		int c = arr[0].length - 1;
		while (r < arr.length && c >= 0) {
			if (arr[r][c] == target) {
				return true;
			} else if (arr[r][c] > target) {
				c--;
			} else {
				r++;
			}
		}
		return false;
	}

}
