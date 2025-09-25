package CODEFORCES;

import java.util.Scanner;

public class Be_Positive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			boolean neg = false;
			int c = 0;
			while (n-- > 0) {
				int val = sc.nextInt();
				if (val == -1) {
					neg = !neg;
				} else if (val == 0) {
					c++;
				}
			}
			if (neg) {
				c += 2;
			}
			System.out.println(c);
		}

	}

}
