package LEETCODE;

public class Complete_Prime_Number {

	public static void main(String[] args) {
		int nums = 23;
		System.out.println(isCompletePrimeNumber(nums));
	}

	public static boolean isCompletePrimeNumber(int num) {
		String s = String.valueOf(num);
		for (int i = 1; i <= s.length(); i++) {
			int pre = Integer.parseInt(s.substring(0, i));
			if (!isPrime(pre)) {
				return false;
			}
		}
		for (int i = 0; i < s.length(); i++) {
			int suf = Integer.parseInt(s.substring(i));
			if (!isPrime(suf)) {
				return false;
			}
		}
		return true;
	}

	public static boolean isPrime(int n) {
		if (n <= 1) {
			return false;
		}
		if (n <= 3) {
			return true;
		}
		if (n % 2 == 0 || n % 3 == 0) {
			return false;
		}
		for (int i = 5; i * i <= n; i += 6) {
			if (n % i == 0 || n % (i + 2) == 0) {
				return false;
			}
		}
		return true;
	}
}
