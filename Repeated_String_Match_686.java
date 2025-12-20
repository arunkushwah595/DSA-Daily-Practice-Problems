package LEETCODE;

public class Repeated_String_Match_686 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "abc", b = "cabcabca";
		System.out.println(repeatedStringMatch(a, b));
	}

	public static int repeatedStringMatch(String a, String b) {
		int c = 0;
		String temp = "";
		while (temp.length() < b.length()) {
			temp += a;
			c++;
		}
		if (temp.contains(b)) {
			return c;
		}

		temp += a;
		c++;
		if (temp.contains(b)) {
			return c;
		}
		return -1;
	}

}
