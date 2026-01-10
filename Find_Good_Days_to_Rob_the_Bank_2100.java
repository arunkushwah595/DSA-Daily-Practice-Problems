package LEETCODE;

import java.util.ArrayList;
import java.util.List;

public class Find_Good_Days_to_Rob_the_Bank_2100 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] security = { 5, 3, 3, 3, 5, 6, 2 };
		int time = 2;
		System.out.println(goodDaysToRobBank(security, time));
	}

	public static List<Integer> goodDaysToRobBank(int[] security, int time) {
		List<Integer> ll = new ArrayList<Integer>();
		int[] pre = new int[security.length];
		int[] suff = new int[security.length];
		for (int i = 1; i < suff.length; i++) {
			if (security[i] <= security[i - 1]) {
				pre[i] = pre[i - 1] + 1;
			}
		}
		for (int i = security.length - 2; i >= 0; i--) {
			if (security[i] <= security[i + 1]) {
				suff[i] = suff[i + 1] + 1;
			}
		}

		for (int i = 0; i < suff.length; i++) {
			if (pre[i] >= time && suff[i] >= time) {
				ll.add(i);
			}
		}
		return ll;
	}
}
