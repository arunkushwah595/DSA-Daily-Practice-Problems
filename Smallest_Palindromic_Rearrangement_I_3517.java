package LEETCODE;

import java.util.ArrayList;
import java.util.Collections;

public class Smallest_Palindromic_Rearrangement_I_3517 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "babab";
		System.out.println(smallestPalindrome(s));
	}

	public static String smallestPalindrome(String s) {
		int idx = s.length() / 2;
		ArrayList<Character> ll = new ArrayList<Character>();
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < idx; i++) {
			ll.add(s.charAt(i));
		}
		Collections.sort(ll);
		for (char ch : ll) {
			sb.append(ch);
		}
		String ans = sb.toString();
		if (s.length() % 2 != 0) {
			ans += (s.charAt(idx));
		}
		ans += sb.reverse().toString();
		return ans;
	}

}
