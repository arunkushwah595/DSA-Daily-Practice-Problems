package LEETCODE;

public class Find_the_Highest_Altitude_1732 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] gain = { -5, 1, 5, 0, -7 };
		System.out.println(largestAltitude(gain));
	}

	public static int largestAltitude(int[] gain) {
		int max = Math.max(0, gain[0]);
		for (int i = 1; i < gain.length; i++) {
			gain[i] += gain[i - 1];
			max = Math.max(max, gain[i]);
		}
		return max;
	}
}
