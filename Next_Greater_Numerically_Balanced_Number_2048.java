package LEETCODE;

public class Next_Greater_Numerically_Balanced_Number_2048 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 1000;
		System.out.println(nextBeautiful(n));
	}

	public static int nextBeautiful(int n) {
		for (int i = n + 1;; i++) {
			if (isitpossible(i)) {
				return i;
			}
		}
	}

	private static boolean isitpossible(int n) {
		// TODO Auto-generated method stub
		String s = String.valueOf(n);
		int[] freq = new int[10];
		for (char ch : s.toCharArray()) {
			freq[ch - '0']++;
		}
		for (char ch : s.toCharArray()) {
			int digit = ch - '0';
			if (digit == 0 || freq[digit] != digit) {
				return false;
			}
		}
		return true;
	}
}
