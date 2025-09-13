package LEETCODE;

public class Largest_3_Same_Digit_Number_in_String_2264 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String num = "6777133339";
		System.out.println(largestGoodInteger(num));
	}

	public static String largestGoodInteger(String num) {
		String ans = "";
		for (int i = 0; i < num.length() - 2; i++) {
			if ((num.charAt(i) == num.charAt(i + 1)) && (num.charAt(i + 1) == num.charAt(i + 2))) {
				String s = "" + num.charAt(i) + num.charAt(i) + num.charAt(i);
				if (s.compareTo(ans) > 0) {
					ans = s;
					i += 2;
				}
			}
		}
		return ans;
	}
}
