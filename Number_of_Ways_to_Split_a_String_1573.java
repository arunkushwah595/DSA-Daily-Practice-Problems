package LEETCODE;

public class Number_of_Ways_to_Split_a_String_1573 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "10101";
		System.out.println(numWays(s));
	}

	public static int numWays(String s) {
		int mod = 1000000007;
		int n = s.length();
		int c1 = 0;
		for (char ch : s.toCharArray()) {
			if (ch == '1') {
				c1++;
			}
		}
		if (c1 == 0) {
			long ans = 0l;
			ans = (long) (n - 1) * (long) (n - 2) / 2;
			return (int) (ans % mod);
		}
		if (c1 % 3 != 0) {
			return 0;
		}

		int ones = c1 / 3;
		long fcut = 0, scut = 0;
		int c = 0;
		for (char ch : s.toCharArray()) {
			if (ch == '1') {
				c++;
			}
			if (c == ones) {
				fcut++;
			} else if (c == ones * 2) {
				scut++;
			}
		}
		long ans = (fcut * scut);
		return (int) (ans % mod);
	}

}
