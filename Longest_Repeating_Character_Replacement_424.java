package LEETCODE;

public class Longest_Repeating_Character_Replacement_424 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "ABAB";
		int k = 2;
		System.out.println(characterReplacement(s, k));
	}

	public static int characterReplacement(String s, int k) {
		int[] freq = new int[26];
		int si = 0;
		int maxwindow = 0;
		int maxfreq = 0;

		for (int ei = 0; ei < s.length(); ei++) {

			freq[s.charAt(ei) - 'A']++; // update freq

			maxfreq = Math.max(maxfreq, freq[s.charAt(ei) - 'A']); // maxfreq ko update kiya hia

			int winlength = ei - si + 1; // window size

			if (winlength - maxfreq > k) {
				freq[s.charAt(si) - 'A']--;
				si++;
			}

			winlength = ei - si + 1;
			maxwindow = Math.max(maxwindow, winlength);

		}
		return maxwindow;

	}
}
