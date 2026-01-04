package LEETCODE;

public class Largest_Even_Number_leetcode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "1221";
		System.out.println(largestEven(s));
	}

	public static String largestEven(String s) {
		for (int i = s.length() - 1; i >= 0; i--) {
			if (s.charAt(i) == '2') {
				return s.substring(0, i + 1);
			}
		}
		return "";
	}

}
