package LEETCODE;

import java.util.Arrays;

public class Rearrange_Words_in_a_Sentence_1451 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text = "Leetcode is cool";
		System.out.println(arrangeWords(text));

	}

	public static String arrangeWords(String text) {
		String[] arr = text.split(" ");
		Arrays.sort(arr, (a, b) -> a.length() - b.length());
		for (int i = 0; i < arr.length; i++) {
			if (i == 0) {
				arr[i] = capitalized(arr[i]);
			} else {
				arr[i] = arr[i].toLowerCase();
			}
		}
		return String.join(" ", arr);
	}

	private static String capitalized(String s) {
		// TODO Auto-generated method stub
		String ans = s.substring(0, 1).toUpperCase() + s.substring(1).toLowerCase();
		return ans;
	}

}
