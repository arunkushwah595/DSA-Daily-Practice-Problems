package LEETCODE;

import java.util.ArrayList;
import java.util.List;

public class Letter_Case_Permutation_784 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "a1b2";
		System.out.println(letterCasePermutation(s));

	}

	public static List<String> letterCasePermutation(String s) {
		List<String> ll = new ArrayList<String>();
		permutation(s, 0, ll, "");
		return ll;
	}

	public static void permutation(String s, int i, List<String> ll, String ans) {
		if (i == s.length()) {
			ll.add(ans);
			return;
		}

		if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
			permutation(s, i + 1, ll, ans + s.charAt(i));
		} else {
			permutation(s, i + 1, ll, ans + s.charAt(i));
			if (s.charAt(i) >= 65 && s.charAt(i) <= 90) {
				char ch = (char) (s.charAt(i) + 32);
				permutation(s, i + 1, ll, ans + ch);
			} else {
				char ch = (char) (s.charAt(i) - 32);
				permutation(s, i + 1, ll, ans + ch);
			}
		}
	}

}
