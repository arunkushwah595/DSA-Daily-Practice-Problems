package LEETCODE;

import java.util.Arrays;

public class Candy_135 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ratings = { 1, 0, 2 };
		System.out.println(candy(ratings));
	}

	public static int candy(int[] ratings) {
		int ans[] = new int[ratings.length];
		Arrays.fill(ans, 1);
		int totalCandies = 0;

		for (int i = 1; i < ans.length; i++) {
			if (ratings[i] > ratings[i - 1]) {
				ans[i] = ans[i - 1] + 1;
			}
		}

		for (int i = ans.length - 2; i >= 0; i--) {
			if (ratings[i] > ratings[i + 1]) {
				ans[i] = Math.max(ans[i], 1 + ans[i + 1]);
			}
			totalCandies += ans[i];
		}

		totalCandies += ans[ans.length - 1];
		return totalCandies;
	}

}
