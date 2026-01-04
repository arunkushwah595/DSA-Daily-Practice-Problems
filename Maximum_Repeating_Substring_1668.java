package LEETCODE;

public class Maximum_Repeating_Substring_1668 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sequence = "ababc", word = "ac";
		System.out.println(maxRepeating(sequence, word));
	}

	public static int maxRepeating(String sequence, String word) {
		int k = 0;
		String temp = "";
		for (int i = 1; i <= (sequence.length() / word.length()); i++) {
			temp += word;
			if (sequence.indexOf(temp) != -1) {
				k = i;
			}
		}
		return k;
	}

}
