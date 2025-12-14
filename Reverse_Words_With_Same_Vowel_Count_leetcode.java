package LEETCODE;

import java.util.*;

public class Reverse_Words_With_Same_Vowel_Count_leetcode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "cat and mice";
		System.out.println(reversess(s));
	}

	public static String reversess(String s) {
		String[] arr = s.split(" ");
		int fc = cVowels(arr[0]);
		for (int i = 1; i < arr.length; i++) {
			if (cVowels(arr[i]) == fc) {
				arr[i] = new StringBuilder(arr[i]).reverse().toString();
			}
		}
		return String.join(" ", arr);
	}

	private static int cVowels(String s) {
		int c = 0;
		for (char ch : s.toCharArray()) {
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				c++;
			}
		}
		return c;
	}

}
