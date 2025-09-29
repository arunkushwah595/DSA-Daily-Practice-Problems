package LEETCODE;

public class Set_Matrix_Zeroes_73 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matrix = { { 1, 1, 1 }, { 1, 0, 1 }, { 1, 1, 1 } };
		setZeroes(matrix);
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}

	}

	public static void setZeroes(int[][] matrix) {
		set(matrix);
	}

	public static void set(int[][] arr) {
		int row = arr.length;
		int col = arr[0].length;
		boolean firstcol = false;
		boolean firstrow = false;

		for (int c = 0; c < col; c++) {
			if (arr[0][c] == 0) {
				firstrow = true;
				break;
			}
		}
		for (int r = 0; r < row; r++) {
			if (arr[r][0] == 0) {
				firstcol = true;
				break;
			}
		}

		for (int r = 1; r < row; r++) {
			for (int c = 1; c < col; c++) {
				if (arr[r][c] == 0) {
					arr[r][0] = 0;
					arr[0][c] = 0;
				}
			}
		}

		for (int r = 1; r < row; r++) {
			if (arr[r][0] == 0) {
				for (int c = 1; c < col; c++) {
					arr[r][c] = 0;
				}
			}
		}
		for (int c = 1; c < col; c++) {
			if (arr[0][c] == 0) {
				for (int r = 1; r < row; r++) {
					arr[r][c] = 0;
				}
			}
		}

		if (firstrow) {
			for (int c = 0; c < col; c++) {
				arr[0][c] = 0;
			}
		}

		if (firstcol) {
			for (int r = 0; r < row; r++) {
				arr[r][0] = 0;
			}
		}

	}

}
