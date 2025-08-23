package LEETCODE;

public class Find_the_Minimum_Area_to_Cover_All_Ones_I_3195 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] grid = { { 0, 1, 0 }, { 1, 0, 1 } };
		System.out.println(minimumArea(grid));
	}

	public static int minimumArea(int[][] grid) {
		int minc = Integer.MAX_VALUE, minr = Integer.MAX_VALUE, maxc = Integer.MIN_VALUE, maxr = Integer.MIN_VALUE;
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[0].length; j++) {
				if (grid[i][j] == 1) {
					minc = Math.min(minc, j);
					minr = Math.min(minr, i);
					maxc = Math.max(maxc, j);
					maxr = Math.max(maxr, i);
				}
			}
		}
		return (maxc - minc + 1) * (maxr - minr + 1);

	}

}
