package CODEFORCES;

import java.util.Arrays;
import java.util.Scanner;

public class Unconventional_Pairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			int[] arr = new int[n];
			for (int i = 0; i < arr.length; i++) {
				arr[i] = sc.nextInt();
			}
			Arrays.sort(arr);
			int diff = Integer.MIN_VALUE;
			for (int i = 0; i < arr.length; i += 2) {
				diff = Math.max(diff, Math.abs(arr[i] - arr[i + 1]));
			}
			System.out.println(diff);
		}
		
	}

}
