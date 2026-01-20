package LEETCODE;

public class Vowel_Consonant_Score_leetcode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "cooear";
		System.out.println(vowelConsonantScore(s));
	}

	public static int vowelConsonantScore(String s) {
		int v = 0;
		int c = 0;
		for (char ch : s.toCharArray()) {
			if (ch >= 'a' && ch <= 'z') {
				if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
					v++;
				} else {
					c++;
				}
			}
		}
		return (c == 0) ? 0 : v / c;
	}

}
