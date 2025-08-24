package LEETCODE;

public class GCD_of_Odd_and_Even_Sums_leetcode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 4;
		System.out.println(gcdOfOddEvenSums(n));
	}

	public static int gcdOfOddEvenSums(int n) {
		int es = n * (n + 1);
		int os = n * n;
		return gcd(os, es);
	}

	public static int gcd(int divisor, int divident) {
		while (divident % divisor != 0) {
			int rem = divident % divisor;
			divident = divisor;
			divisor = rem;
		}
		return divisor;
	}

}
