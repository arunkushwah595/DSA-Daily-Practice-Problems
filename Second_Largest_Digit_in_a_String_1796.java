package LEETCODE;

public class Second_Largest_Digit_in_a_String_1796 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "dfa12321afd";
		System.out.println(secondHighest(s));
		System.out.println(second_Highest(s));
	}

	public static int secondHighest(String s) {
		int max = -1;
		int second_max = -1;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
				int x = s.charAt(i) - '0';
				if (x > max) {
					second_max = max;
					max = x;
				} else if (x > second_max) {
					second_max = x;
				}
			}
		}
		return second_max;
	}

	public static int second_Highest(String s) {
		int c = 2;
		for (char i = '9'; i >= '0'; i--) {
			if (s.indexOf(i) != -1) {
				c--;
				if (c == 0) {
					return i - '0';
				}
			}
		}
		return -1;
	}

}
