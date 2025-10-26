package LEETCODE;

public class Remove_Zeros_in_Decimal_Representation_leetcode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 1020030;
		System.out.println(removeZeros(n));
	}

	public static long removeZeros(long n) {
		String s = String.valueOf(n);
		StringBuilder sb = new StringBuilder();
		for (char ch : s.toCharArray()) {
			if (ch == '0') {
				continue;
			}
			sb.append(ch);
		}
		return Long.parseLong(sb.toString());
	}

}
