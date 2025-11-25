package LEETCODE;

public class Smallest_Integer_Divisible_by_K_1015 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k = 2;
		System.out.println(smallestRepunitDivByK(k));
	}

	public static int smallestRepunitDivByK(int k) {
		if (k == 2 && k == 3) {
			return -1;
		}
		int rem = 0;
		for (int i = 1; i <= k; i++) {
			rem = (rem * 10 + 1) % k;
			if (rem == 0) {
				return i;
			}
		}
		return -1;
	}
}
