package LEETCODE;

public class Longest_Balanced_Substring_I_leetcode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "abbac";
		System.out.println(longestBalanced(s));
	}

	public static int longestBalanced(String s) {
		int n = s.length();
		int max_len = 0;
		for (int i = 0; i < n; i++) {
			int[] freq = new int[26];

			for (int j = i; j < n; j++) {
				freq[s.charAt(j) - 'a']++;

				int min = Integer.MAX_VALUE, max = 0;
				for (int f : freq) {
					if (f > 0) {
						min = Math.min(min, f);
						max = Math.max(max, f);
					}
				}
				if (min == max) {
					max_len = Math.max(max_len, j - i + 1);
				}
			}
		}
		return max_len;
	}

}
