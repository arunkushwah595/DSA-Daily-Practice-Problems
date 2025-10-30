package LEETCODE;

public class Decode_String_394 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "2[2[abc]3[cd]]ef";
		i = 0;
		System.out.println(decode(s));
	}

	static int i = 0;

	public String decodeString(String s) {
		i = 0;
		return decode(s);
	}

	public static String decode(String s) {
		int n = 0;
		StringBuilder sb = new StringBuilder();
		while (i < s.length()) {
			char ch = s.charAt(i);
			if (Character.isDigit(ch)) {
				n = n * 10 + (ch - '0');
				i++;
			} else if (ch == '[') {
				i++;
				String ans = decode(s);
				while (n-- > 0) {
					sb.append(ans);
				}
				n = 0;
			} else if (ch == ']') {
				i++;
				return sb.toString();
			} else {
				sb.append(ch);
				i++;
			}
		}
		return sb.toString();
	}

}
