package LEETCODE;

public class Check_If_Digits_Are_Equal_in_String_After_Operations_I_3461 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "3902";
		System.out.println(hasSameDigits(s));
	}

	public static boolean hasSameDigits(String s) {
		while (s.length() > 2) {
			StringBuilder sb = new StringBuilder();
			for (int i = 0; i < s.length() - 1; i++) {
				sb.append(((s.charAt(i) - '0') + (s.charAt(i + 1) - '0')) % 10);
			}
			s = sb.toString();
		}
		return s.charAt(0) == s.charAt(1);
	}

}
