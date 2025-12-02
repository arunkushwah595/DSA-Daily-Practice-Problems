package LEETCODE;

public class Valid_Word_3136 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String word = "a3$e";
		System.out.println(isittrue(word));
	}

	public static boolean isittrue(String s) {
		int n = s.length();
		if (n < 3) {
			return false;
		}

		int vowels = 0;
		int consonants = 0;

		for (char c : s.toCharArray()) {
			if (Character.isLetter(c)) {
				if ("aeiouAEIOU".indexOf(c) != -1) {
					vowels++;
				} else {
					consonants++;
				}
			} else if (!Character.isDigit(c)) {
				return false;
			}
		}
		return vowels >= 1 && consonants >= 1;
	}

}
