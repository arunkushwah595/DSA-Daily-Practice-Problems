package LEETCODE;

public class Count_Substrings_That_Satisfy_K_Constraint_I_3258 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "010101";
		int k = 1;
		System.out.println(countKConstraintSubstrings(s, k));
	}

	public static int countKConstraintSubstrings(String s, int k) {
		int count = 0;
		int si = 0;
		int ei = 0;
		int c0 = 0;
		int c1 = 0;

		while (ei < s.length()) {
			if (s.charAt(ei) == '0') {
				c0++;
			} else {
				c1++;
			}

			while (c1 > k && c0 > k) {
				if (s.charAt(si) == '0') {
					c0--;
				} else {
					c1--;
				}
				si++;
			}

			count += (ei - si + 1);
			ei++;
		}

		return count;
	}

}
