package LEETCODE;

import java.util.ArrayList;
import java.util.Collections;

public class Reverse_Letters_Then_Special_Characters_in_String_leetcode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public String reverseByType(String s) {
		StringBuilder sb = new StringBuilder();
		ArrayList<Character> ll = new ArrayList<>();
		ArrayList<Character> nl = new ArrayList<>();
		for (char ch : s.toCharArray()) {
			if (ch >= 'a' && ch <= 'z') {
				ll.add(ch);
			} else {
				nl.add(ch);
			}
		}
		Collections.reverse(ll);
		Collections.reverse(nl);
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (ch >= 'a' && ch <= 'z') {
				sb.append(ll.get(0));
				ll.remove(0);
			} else {
				sb.append(nl.get(0));
				nl.remove(0);
			}
		}
		return sb.toString();
	}

}
