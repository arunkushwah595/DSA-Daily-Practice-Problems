package LEETCODE;

public class Make_Three_Strings_Equal_2937 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "abc", s2 = "abb", s3 = "ab";
		System.out.println(findMinimumOperations(s1, s2, s3));
	}

	public static int findMinimumOperations(String s1, String s2, String s3) {
		int n = Math.min(s1.length(), Math.min(s2.length(), s3.length()));
		int i = 0;
		while (i < n) {
			if (s1.charAt(i) == s2.charAt(i) && s1.charAt(i) == s3.charAt(i)) {
				i++;
				continue;
			}
			break;
		}
		if (i == 0) {
			return -1;
		}
		int opr = 0;
		opr += s1.length() - i;
		opr += s2.length() - i;
		opr += s3.length() - i;
		return opr;
	}

}
