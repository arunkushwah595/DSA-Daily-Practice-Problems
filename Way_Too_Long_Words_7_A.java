package Daily_Questions;

import java.util.Scanner;

public class Way_Too_Long_Words_7_A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			String s = sc.next();
			int l = s.length();
			if (l > 10) {
				String ans = "";
				ans += s.charAt(0) + "" + (s.length() - 2) + s.charAt(l - 1);
				System.out.println(ans);
			} else {
				System.out.println(s);
			}
		}
		sc.close();
	}

}
