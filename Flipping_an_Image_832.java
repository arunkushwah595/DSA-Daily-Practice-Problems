package LEETCODE;

public class Flipping_an_Image_832 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] image = { { 1, 1, 0 }, { 1, 0, 1 }, { 0, 0, 0 } };
		int[][] ans = flipAndInvertImage(image);
		for (int i = 0; i < ans.length; i++) {
			for (int j = 0; j < ans[0].length; j++) {
				System.out.print(ans[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static int[][] flipAndInvertImage(int[][] image) {
		return flip(image);
	}

	public static int[][] flip(int[][] arr) {
		int n = arr.length;
		for (int i = 0; i < arr.length; i++) {
			int l = 0;
			int r = arr.length - 1;
			while (l <= r) {
				if (arr[i][l] == arr[i][r]) {
					arr[i][l] = 1 - arr[i][l];
					arr[i][r] = arr[i][l];
				}
				l++;
				r--;
			}
		}
		return arr;
	}

}
