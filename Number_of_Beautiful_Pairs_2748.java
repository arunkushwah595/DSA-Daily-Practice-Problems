package LEETCODE;

public class Number_of_Beautiful_Pairs_2748 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 2, 5, 1, 4 };
		System.out.println(countBeautifulPairs(nums));
	}

	public static int countBeautifulPairs(int[] nums) {
		int c = 0;
		for (int i = 0; i < nums.length; i++) {
			int f = Integer.parseInt("" + ("" + nums[i]).charAt(0));
			for (int j = i + 1; j < nums.length; j++) {
				int l = nums[j] % 10;
				if (gcd(f, l) == 1) {
					c++;
				}
			}
		}
		return c;
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
