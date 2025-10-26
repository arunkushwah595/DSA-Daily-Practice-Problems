package LEETCODE;

public class Maximize_Sum_of_Squares_of_Digits_leetcode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 2, sum = 3;
		System.out.println(maxSumOfSquares(num, sum));
	}

	public static String maxSumOfSquares(int num, int sum) {
		if (sum < 1 || sum > 9 * num) {
			return "";
		}
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < num; i++) {
			int rem_digit = num - i - 1;
			int digit = Math.min(9, sum);
			int min_need = sum - 9 * rem_digit;
			if (digit < min_need) {
				digit = min_need;
			}
			sb.append(digit);
			sum -= digit;
		}

		return sb.toString();
	}

}
