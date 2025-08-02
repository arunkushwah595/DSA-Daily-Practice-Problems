package Daily_Questions;

public class Minimum_Recolors_to_Get_K_Consecutive_Black_Blocks_2379 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String blocks = "WBBWWBBWBW";
		int k = 7;
		System.out.println(minimumRecolors(blocks, k));
	}

	public static int minimumRecolors(String blocks, int k) {
		int min = 0;
		int left = 0, right = 0;
		while (right < k) {
			if (blocks.charAt(right) == 'W') {
				min++;
			}
			right++;
		}
		int ans = min;
		while (right < blocks.length()) {
			if (blocks.charAt(left++) == 'W') {
				min--;
			}
			if (blocks.charAt(right++) == 'W') {
				min++;
			}
			ans = Math.min(ans, min);
		}
		return ans;
	}

}
