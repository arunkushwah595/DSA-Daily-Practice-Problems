package LEETCODE;

import java.lang.String;

public class Mirror_Distance_of_an_Integer_leetcode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 25;
		System.out.println(mirrorDistance(n));
	}

	public static int mirrorDistance(int n) {
		return Math.abs(n - reverse(n));
	}

	public static int reverse(int n) {
		int s = 0;
		while (n > 0) {
			s = s * 10 + n % 10;
			n /= 10;
		}
		return s;
	}

}
