package LEETCODE;

public class Vowels_Game_in_a_String_3227 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "leetcoder";
		System.out.println(doesAliceWin(s));
	}

	public static boolean doesAliceWin(String s) {
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				return true;
			}
		}
		return false;
	}

}
