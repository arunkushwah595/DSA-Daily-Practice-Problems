package LEETCODE;

public class Total_Waviness_of_Numbers_in_Range_I_leetcode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 120, num2 = 130;
		System.out.println(totalWaviness(num1, num2));
	}

	public static int totalWaviness(int num1, int num2) {
		int c = 0;
		for (int n = num1; n <= num2; n++) {
			if (n < 100)
				continue;

			int[] digits = new int[6];
			int idx = 0;
			int num = n;

			while (num > 0) {
				digits[idx++] = num % 10;
				num /= 10;
			}
			for (int i = idx - 2; i >= 1; i--) {
				int left = digits[i + 1];
				int cur = digits[i];
				int right = digits[i - 1];

				if ((cur > left && cur > right) || (cur < left && cur < right)) {
					c++;
				}
			}
		}
		return c;
	}
}
