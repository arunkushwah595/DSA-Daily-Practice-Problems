package LEETCODE;

public class Lexicographically_Smallest_String_After_Reverse_leetcode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "dcab";
		System.out.println(lexSmallest(s));
	}

	public static String lexSmallest(String s) {
		String smallest = "{";
		int length = s.length();

		for (int k = 1; k <= length; k++) {
			String prefixReversed = reversePrefix(s, k);
			if (prefixReversed.compareTo(smallest) < 0)
				smallest = prefixReversed;

			String suffixReversed = reverseSuffix(s, k);
			if (suffixReversed.compareTo(smallest) < 0)
				smallest = suffixReversed;
		}

		return smallest;
	}

	private static String reversePrefix(String s, int k) {
		String prefix = new StringBuilder(s.substring(0, k)).reverse().toString();
		return prefix + s.substring(k);
	}

	private static String reverseSuffix(String s, int k) {
		int startIndex = s.length() - k;
		String suffix = new StringBuilder(s.substring(startIndex)).reverse().toString();
		return s.substring(0, startIndex) + suffix;
	}

}
