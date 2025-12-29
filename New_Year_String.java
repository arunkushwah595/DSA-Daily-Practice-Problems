package CODEFORCES;

import java.util.Scanner;

public class New_Year_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			String s = sc.next();
			fn(s);

		}
	}

	public static void fn(String s) {
		if (s.contains("2026") || !s.contains("2025")) {
			System.out.println(0);
		} else {
			System.out.println(1);
		}
	}
}
