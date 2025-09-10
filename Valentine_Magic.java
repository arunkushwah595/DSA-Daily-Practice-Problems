package CODESKILLER;

import java.util.Arrays;
import java.util.Scanner;

public class Valentine_Magic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int g = sc.nextInt();
		int b = sc.nextInt();
		int[] girls = new int[g];
		int[] boys = new int[b];
		for (int i = 0; i < girls.length; i++) {
			girls[i] = sc.nextInt();
		}
		for (int i = 0; i < boys.length; i++) {
			boys[i] = sc.nextInt();
		}
		Arrays.sort(boys);
		Arrays.sort(girls);
		System.out.println(Valentine(boys, girls, 0, 0));
	}

	public static int Valentine(int[] boys, int[] girls, int i, int j) {
		if (i == boys.length) {
			return 0;
		}
		if (j == girls.length) {
			return 999999999;
		}
		int sel = Math.abs(boys[i] - girls[j]) + Valentine(boys, girls, i + 1, j + 1); // selection
		int rej = Valentine(boys, girls, i, j + 1); // rejection
		return Math.min(sel, rej);
	}

}
