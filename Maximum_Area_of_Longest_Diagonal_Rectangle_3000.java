package LEETCODE;

public class Maximum_Area_of_Longest_Diagonal_Rectangle_3000 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] dimensions = { { 3, 4 }, { 4, 3 } };
		System.out.println(areaOfMaxDiagonal(dimensions));

	}

	public static int areaOfMaxDiagonal(int[][] dimensions) {
		int ans = 0;
		int maxd = 0;
		for (int[] arr : dimensions) {
			int l = arr[0];
			int b = arr[1];
			int currd = l * l + b * b;
			if (currd > maxd || (currd == maxd && l * b > ans)) {
				maxd = currd;
				ans = l * b;
			}
		}
		return ans;

	}

}
