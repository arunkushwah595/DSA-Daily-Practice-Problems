package LEETCODE;

public class Calculate_Money_in_Leetcode_Bank_1716 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 20;
		System.out.println(totalMoney(n));
	}

	public static int totalMoney(int n) {
		int w = n / 7;
		int d = n % 7;
		int ans = 0;
		if (w >= 1) {
			ans += (w * 28 + w * (w - 1) / 2 * 7);
		}
		ans += w * d + d * (d + 1) / 2;
		return ans;
	}
}
