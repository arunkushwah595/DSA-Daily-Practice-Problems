package LEETCODE;

import java.util.ArrayList;
import java.util.Collections;

public class Special_Binary_String_761 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "11011000";
		System.out.println(special_string(s));
	}

	public static String special_string(String s) {
		int i = 0;
		int c = 0;
		ArrayList<String> ll = new ArrayList<>();
		for (int j = 0; j < s.length(); j++) {
			if (s.charAt(j) == '1') {
				c++;
			} else {
				c--;
			}
			if (c == 0) {
				ll.add("1" + special_string(s.substring(i + 1, j)) + "0");
				i = j + 1;
			}
		}
		ll.sort(Collections.reverseOrder());
		StringBuilder sb = new StringBuilder();
		for (String ss : ll) {
			sb.append(ss);
		}
		return sb.toString();
	}

}
