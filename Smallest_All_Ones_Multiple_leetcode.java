package LEETCODE;

public class Smallest_All_Ones_Multiple_leetcode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k = 3;
		System.out.println(minAllOneMultiple(k));
	}

	public static int minAllOneMultiple(int k) {
		if (k % 2 == 0 || k % 5 == 0) {
			return -1;
		}
		int n = 0;
		for (int i = 1; i <= k; i++) {
			n = (n * 10 + 1) % k;
			if (n == 0) {
				return i;
			}
		}
		return -1;
	}

}
