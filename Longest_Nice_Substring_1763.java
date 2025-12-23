package LEETCODE;

import java.util.HashSet;

public class Longest_Nice_Substring_1763 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "YazaAay";
		System.out.println(longestNiceSubstring(s));
	}

	public static String longestNiceSubstring(String s) {
		return niceSubstr(s);
	}

	private static String niceSubstr(String s) {
		// TODO Auto-generated method stub
		if (s.length() < 2) {
			return "";
		}
		HashSet<Character> set = new HashSet<>();
		for (char ch : s.toCharArray()) {
			set.add(ch);
		}
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (set.contains(Character.toLowerCase(ch)) && set.contains(Character.toUpperCase(ch))) {
				continue;
			}
			String l = niceSubstr(s.substring(0, i));
			String r = niceSubstr(s.substring(i + 1));
			if (l.length() >= r.length()) {
				return l;
			}
			return r;
		}
		return s;
	}

}
