package LEETCODE;

import java.util.HashMap;

public class Sum_of_Numbers_With_Units_Digit_K_2310 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 58, k = 9;
		System.out.println(minimumNumbers(num, k));
	}

	public static int minimumNumbers(int num, int k) {
		if (num == 0) {
			return 0;
		}
		if (num < k) {
			return -1;
		}
		if (num == k) {
			return 1;
		}
		if (k % 2 == 0 && num % 2 != 0) {
			return -1;
		}
		int ud = num % 10;
		if (k == 5 && (ud != 0 && ud != 5)) {
			return -1;
		}
		for (int i = 1; i <= 10; i++) {
			int m = k * i;
			int mu = m % 10;
			if (m <= num && mu == ud) {
				return i;
			}
			if (m > num) {
				break;
			}
		}
		return -1;
	}

}
