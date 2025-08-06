package Daily_Questions;

public class Number_of_Substrings_Containing_All_Three_Characters_1358 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "aaacb";
		System.out.println(numberOfSubstrings(s));
	}

	public static int numberOfSubstrings(String s) {
		int c = 0;
		int l = 0;
		int[] freq = new int[3];
		for (int i = 0; i < s.length(); i++) {
			freq[s.charAt(i) - 'a']++;
			while (freq[0] > 0 && freq[1] > 0 && freq[2] > 0) {
				c += s.length() - i;
				freq[s.charAt(l) - 'a']--;
				l++;
			}
		}
		return c;
	}

}
