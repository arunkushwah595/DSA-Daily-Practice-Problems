package LEETCODE;

public class Equal_Score_Substrings_leetcode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "adcb";
		System.out.println(scoreBalance(s));
	}

	public static boolean scoreBalance(String s) {
		int total = 0;
		for (char ch : s.toCharArray()) {
			total += (ch - 'a' + 1);
		}
		int sum = 0;
		for (int i = 0; i < s.length(); i++) {
			sum += (s.charAt(i) - 'a' + 1);
			if (2 * sum == total) {
				return true;
			}
		}
		return false;
	}
}
