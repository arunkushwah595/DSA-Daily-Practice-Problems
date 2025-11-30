package LEETCODE;

import java.util.HashSet;

public class Maximum_Substrings_With_Distinct_Start_leetcode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "abab";
		System.out.println(maxDistinct(s));
	}

	public static int maxDistinct(String s) {
		HashSet<Character> set = new HashSet<>();
		for (char ch : s.toCharArray()) {
			if (!set.contains(ch)) {
				set.add(ch);
			}
		}
		return set.size();
	}

}
