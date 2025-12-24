package LEETCODE;

public class Lexicographically_Smallest_String_After_Substring_Operation_2734 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "aaa";
		System.out.println(smallestString(s));

	}

	public static String smallestString(String s) {
		StringBuilder sb = new StringBuilder();
		int i = 0;
		while (i < s.length() && s.charAt(i) == 'a') {
			i++;
			if (i != s.length()) {
				sb.append('a');
			}
		}
		if (i == s.length()) {
			return sb.append('z').toString();
		}
		while (i < s.length() && s.charAt(i) != 'a') {
			sb.append((char) (s.charAt(i) - 1));
			i++;
		}
		while (i < s.length()) {
			sb.append(s.charAt(i));
			i++;
		}
		return sb.toString();
	}

}
