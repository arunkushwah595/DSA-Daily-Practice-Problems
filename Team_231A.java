package Daily_Questions;

import java.util.*;

public class Team_231A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int t = 0;
		for (int i = 0; i < n; i++) {
			int c = 0;
			for (int j = 0; j < 3; j++) {
				int q = sc.nextInt();
				if (q == 1) {
					c++;
				}
			}
			if (c >= 2) {
				t++;
			}

		}
		System.out.println(t);
		sc.close();
	}
}
