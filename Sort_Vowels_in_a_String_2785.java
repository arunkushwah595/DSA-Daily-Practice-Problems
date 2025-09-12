package LEETCODE;

import java.util.ArrayList;
import java.util.Collections;

public class Sort_Vowels_in_a_String_2785 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "lEetcOde";
		System.out.println(sortVowels(s));

	}

	public static String sortVowels(String s) {
		return Swap(s);
	}

	public static String Swap(String s) {
		ArrayList<Character> ll = new ArrayList<Character>();
		StringBuilder ans = new StringBuilder();
		for (char i : s.toCharArray()) {
			if (i == 'a' || i == 'e' || i == 'i' || i == 'o' || i == 'u' || i == 'A' || i == 'E' || i == 'I' || i == 'O'
					|| i == 'U') {
				ll.add(i);
			}
		}
		Collections.sort(ll);
		int idx = 0;
		for (char i : s.toCharArray()) {
			if (i == 'a' || i == 'e' || i == 'i' || i == 'o' || i == 'u' || i == 'A' || i == 'E' || i == 'I' || i == 'O'
					|| i == 'U') {
				ans.append(ll.get(idx++));
			} else {
				ans.append(i);
			}
		}
		return ans.toString();
	}

}
