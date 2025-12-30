package LEETCODE;

public class Find_the_Town_Judge_997 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 2;
		int[][] trust = { { 1, 2 } };
		System.out.println(findJudge(n, trust));
	}

	public static int findJudge(int n, int[][] trust) {
		if (trust.length == 0 && n == 1) {
			return 1;
		}
		int[] arr = new int[n + 1];
		for (int[] a : trust) {
			arr[a[0]]--;
			arr[a[1]]++;
		}

		for (int a = 0; a < arr.length; a++) {
			if (arr[a] == n - 1) {
				return a;
			}
		}
		return -1;
	}

}
