package LEETCODE;

public class Count_Occurrences_of_Anagrams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "cbaebabacd", p = "abc";
		System.out.println(count_occurrence(s, p));

	}

	public static int count_occurrence(String s, String p) {
		int c = 0;
		if (p.length() > s.length()) {
			return 0;
		}
		int k = p.length();
		for (int i = 0; i < s.length() - p.length() + 1; i++) {
			if (isanagram(s.substring(i, i + k), p)) {
				c++;
			}
		}
		return c;
	}

	private static boolean isanagram(String substring, String p) {
		// TODO Auto-generated method stub
		int[] freq = new int[26];
		for (int i = 0; i < p.length(); i++) {
			freq[p.charAt(i) - 'a']++;
		}
		for (int i = 0; i < substring.length(); i++) {
			freq[substring.charAt(i) - 'a']--;
			if (freq[substring.charAt(i) - 'a'] < 0) {
				return false;
			}
		}
		return true;
	}

}
