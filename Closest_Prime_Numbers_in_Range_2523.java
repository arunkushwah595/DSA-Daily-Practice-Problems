package Daily_Questions;

import java.util.*;

public class Closest_Prime_Numbers_in_Range_2523 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int left = 10, right = 19;
		for (int i : name(left, right)) {
			System.out.println(i);
		}

	}

	public static int[] name(int left, int right) {
		boolean prime[] = PrimeSieve(right);
		ArrayList<Integer> ll = new ArrayList<Integer>();
		for (int i = left; i <= right; i++) {
			if (prime[i] == false) {
				ll.add(i);
			}
		}
		int minGap = Integer.MAX_VALUE;
		int[] result = { -1, -1 };

		for (int i = 1; i < ll.size(); i++) {
			int gap = ll.get(i) - ll.get(i - 1);
			if (gap < minGap) {
				minGap = gap;
				result[0] = ll.get(i - 1);
				result[1] = ll.get(i);
			}
		}

		return result;
	}

	public static boolean[] PrimeSieve(int n) {
		boolean[] ans = new boolean[n + 1];
		ans[0] = ans[1] = true;
		;
		for (int i = 2; i * i <= ans.length; i++) {
			if (ans[i] == false) {// i prime hai
				for (int j = 2; i * j < ans.length; j++) {
					ans[i * j] = true;
				}
			}
		}
		return ans;

	}

}
