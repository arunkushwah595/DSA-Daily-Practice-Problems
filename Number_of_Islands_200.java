package LEETCODE;

public class Number_of_Islands_200 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[][] grid = { { '1', '1', '0', '0', '0' }, { '1', '1', '0', '0', '0' }, { '0', '0', '1', '0', '0' },
				{ '0', '0', '0', '1', '1' } };
		System.out.println(numIslands(grid));
	}

	public static int numIslands(char[][] grid) {
		int island = 0;
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[0].length; j++) {
				if (grid[i][j] == '1') {
					Search_Island(grid, i, j);
					island++;
				}
			}
		}
		return island;
	}

	public static void Search_Island(char[][] arr, int i, int j) {
		if (i < 0 || i >= arr.length || j < 0 || j >= arr[0].length || arr[i][j] == '0') {
			return;
		}
		arr[i][j] = '0';
		Search_Island(arr, i + 1, j);
		Search_Island(arr, i, j + 1);
		Search_Island(arr, i - 1, j);
		Search_Island(arr, i, j - 1);
	}

}
