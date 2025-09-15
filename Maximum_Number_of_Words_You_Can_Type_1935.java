package LEETCODE;

public class Maximum_Number_of_Words_You_Can_Type_1935 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text = "hello world", brokenLetters = "ad";
		System.out.println(canBeTypedWords(text, brokenLetters));
	}

	public static int canBeTypedWords(String text, String brokenLetters) {
		String[] arr = text.split(" ");
		int count = 0;
		for (String s : arr) {
			boolean isitpossible = true;
			for (char c : brokenLetters.toCharArray()) {
				if (s.indexOf(c) != -1) {
					isitpossible = false;
					break;
				}
			}
			if (isitpossible == true) {
				count++;
			}
		}
		return count;

	}

}
