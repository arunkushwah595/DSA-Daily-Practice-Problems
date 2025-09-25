package CODEFORCES;

import java.util.HashMap;
import java.util.Scanner;

public class MEX_rose {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			int k = sc.nextInt();
			HashMap<Integer, Integer> hm = new HashMap<>();
			while (n-- > 0) {
				int val = sc.nextInt();
				hm.put(val, hm.getOrDefault(val, 0) + 1);
			}
			int c = 0;
			for (int i = 0; i < k; i++) {
				if (!hm.containsKey(i)) {
					c++;
				}
			}
			c = Math.max(hm.getOrDefault(k, 0), c);
			System.out.println(c);
		}

	}

}
