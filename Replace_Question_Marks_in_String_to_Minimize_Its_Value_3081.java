package LEETCODE;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class Replace_Question_Marks_in_String_to_Minimize_Its_Value_3081 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "a?a?";
		System.out.println(minimizeStringValue(s));
	}

	public static String minimizeStringValue(String s) {
		HashMap<Character, Integer> map = new HashMap<>();
		int c = 0;
		for (char ch : s.toCharArray()) {
			if (ch != '?') {
				map.put(ch, map.getOrDefault(ch, 0) + 1);
			} else {
				c++;
			}
		}
		ArrayList<Character> ll = new ArrayList<>();
		for (int i = 0; i < c; i++) {
			int min = Integer.MAX_VALUE;
			for (char ch = 'a'; ch <= 'z'; ch++) {
				min = Math.min(min, map.getOrDefault(ch, 0));
			}
			for (char ch = 'a'; ch <= 'z'; ch++) {
				int v = map.getOrDefault(ch, 0);
				if (min == v) {
					ll.add(ch);
					map.put(ch, v + 1);
					break;
				}
			}
		}
		Collections.sort(ll);
		StringBuilder sb = new StringBuilder();
		for (char ch : s.toCharArray()) {
			if (ch == '?') {
				sb.append(ll.remove(0));
			} else {
				sb.append(ch);
			}
		}
		return sb.toString();
	}
}
