package LEETCODE;

import java.util.Arrays;

public class Lexicographically_Smallest_Permutation_Greater_Than_Target_leetcode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "abc", target = "bba";
		anss = "";
		isfound = false;

		char[] arr = s.toCharArray();
		Arrays.sort(arr);
		s = new String(arr);
		Print(s, "", target);
		System.out.println(anss);

	}

	static String anss;
	static boolean isfound;

	public static void Print(String ques, String ans, String target) {
		if (ques.length() == 0) {
			if (ans.compareTo(target) > 0) {
				anss = ans;
				isfound=true;
			}
			return;
		}
		
		for (int i = 0; i < ques.length(); i++) {
			char ch = ques.charAt(i);
			String s1 = ques.substring(0, i);
			String s2 = ques.substring(i + 1);
			Print(s1 + s2, ans + ch, target);
			if(isfound) {
				return;
			}
		}
	}

}
