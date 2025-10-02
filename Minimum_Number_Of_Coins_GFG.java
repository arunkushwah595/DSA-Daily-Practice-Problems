package GFG;

import java.util.Arrays;

public class Minimum_Number_Of_Coins_GFG {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 121;
		int coin[] = { 1, 2, 5, 10 };
		System.out.println(min_coin(n, coin));
	}

	public static int min_coin(int n, int[] coin) {
		Arrays.sort(coin);
		int c = 0;
		for (int i = coin.length - 1; i >= 0; i--) {
			c += n / coin[i];
			n %= coin[i];
			if (n == 0) {
				return c;
			}
		}
		return c;
	}

}
