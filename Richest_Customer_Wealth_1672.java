package LEETCODE;

public class Richest_Customer_Wealth_1672 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] accounts = { { 1, 2, 3 }, { 3, 2, 1 } };
		System.out.println(maximumWealth(accounts));
	}

	public static int maximumWealth(int[][] accounts) {
		int Maxsum = Integer.MIN_VALUE;
		for (int[] arr : accounts) {
			int sum = 0;
			for (int i : arr) {
				sum += i;
			}
			Maxsum = Math.max(Maxsum, sum);
		}
		return Maxsum;
	}

}
