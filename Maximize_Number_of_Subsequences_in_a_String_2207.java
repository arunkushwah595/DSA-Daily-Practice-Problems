package LEETCODE;

public class Maximize_Number_of_Subsequences_in_a_String_2207 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text = "abdcdbc", pattern = "ac";
		System.out.println(maximumSubsequenceCount(text, pattern));
	}

	public static long maximumSubsequenceCount(String text, String pattern) {
		long c = 0;
		long a = 0;
		long b = 0;
		for (char ch : text.toCharArray()) {
			if (ch == pattern.charAt(1)) {
				c += a;
				b++;
			}
			if (ch == pattern.charAt(0)) {
				a++;
			}
		}
		c += Math.max(a, b);
		return c;
	}

}
