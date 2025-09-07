package LEETCODE;

import java.util.Arrays;

public class Minimum_Operations_to_Transform_String_leetcode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "xyza";
		System.out.println(minOperations(s));
	}

	public static int minOperations(String s) {
		return min_oprn(s);
	}

	public static int min_oprn(String s) {
		char[] arr = s.toCharArray();
		Arrays.sort(arr);
		if (arr[arr.length - 1] == 'a') {
			return 0;
		}
		char ch = 'a';
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 'a') {
				continue;
			} else {
				ch = arr[i];
				break;
			}
		}
		char end = arr[arr.length - 1];
		int opr = end - ch;
		opr = opr + 1 + (int) ('z' - end);
		return opr;
	}

}
