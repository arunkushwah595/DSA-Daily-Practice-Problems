package LEETCODE;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Compute_Decimal_Representation_leetcode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 530907;
		for (int i : decimalRepresentation(n)) {
			System.out.println(i);
		}
	}

	public static int[] decimalRepresentation(int n) {
		List<Integer> ll = new ArrayList<Integer>();
		int c = 0;
		while (n != 0) {
			int v = n % 10;
			n /= 10;
			if (v == 0) {
				c++;
				continue;
			}
			ll.add(v * (int) Math.pow(10, c));
			c++;
		}
		Collections.sort(ll, (a, b) -> b - a);
		int[] arr = new int[ll.size()];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = ll.get(i);
		}
		return arr;
	}

}
