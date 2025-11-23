package LEETCODE;

public class Concatenate_Non_Zero_Digits_and_Multiply_by_Sum_I_leetcode {

	public static void main(String[] args) {
		int n = 10203004;
		System.out.println(sumAndMultiply(n));
	}

	public static long sumAndMultiply(int n) {
		long x = 0;
		long sum = 0;
		String s = "" + n;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) != '0') {
				x = (x * 10) + (s.charAt(i) - '0');
				sum += (s.charAt(i) - '0');
			}
		}
		return x * sum;
	}

}
