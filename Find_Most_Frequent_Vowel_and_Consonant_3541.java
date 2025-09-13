package LEETCODE;

public class Find_Most_Frequent_Vowel_and_Consonant_3541 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "successes";
		System.out.println(maxFreqSum(s));
	}

	public static int maxFreqSum(String s) {
		int[] freq = new int[26];
		for (int i = 0; i < s.length(); i++) {
			freq[s.charAt(i) - 'a']++;
		}
		int mv = 0; // max vowel
		int mc = 0; // max consonenet
		for (int i = 0; i < freq.length; i++) {
			if (i == 0 || i == 4 || i == 8 || i == 14 || i == 20) {
				mv = Math.max(mv, freq[i]);
			} else {
				mc = Math.max(mc, freq[i]);
			}
		}
		return mc + mv;
	}
}
