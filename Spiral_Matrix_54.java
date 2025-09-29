package LEETCODE;

import java.util.ArrayList;
import java.util.List;

public class Spiral_Matrix_54 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		System.out.println(spiralOrder(matrix));
	}

	public static List<Integer> spiralOrder(int[][] matrix) {
		List<Integer> ll = new ArrayList<Integer>();
		Print(matrix, ll);
		return ll;
	}

	public static void Print(int[][] arr, List<Integer> ll) {
		// TODO Auto-generated method stub
		int minc = 0, minr = 0, maxc = arr[0].length - 1, maxr = arr.length - 1;
		int t = arr.length * arr[0].length;
		while (t > 0) {
			for (int i = minc; i <= maxc && t > 0; i++) {
				ll.add(arr[minr][i]);
				t--;

			}
			minr++;
			for (int i = minr; i <= maxr && t > 0; i++) {
				ll.add(arr[i][maxc]);
				t--;
			}
			maxc--;
			for (int i = maxc; i >= minc && t > 0; i--) {
				ll.add(arr[maxr][i]);
				t--;
			}
			maxr--;
			for (int i = maxr; i >= minr && t > 0; i--) {
				ll.add(arr[i][minc]);
				t--;
			}
			minc++;

		}
	}

}
