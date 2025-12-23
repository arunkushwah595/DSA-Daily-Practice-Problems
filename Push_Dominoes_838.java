package LEETCODE;

public class Push_Dominoes_838 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String dominoes = "RR.L";
		System.out.println(pushDominoes(dominoes));
	}

	public static String pushDominoes(String dominoes) {
		int n = dominoes.length();
		int[] leftCloseR = new int[n];
		int[] rightCloseL = new int[n];

		for (int i = 0; i < rightCloseL.length; i++) {
			if (dominoes.charAt(i) == 'R') {
				leftCloseR[i] = i;
			} else if (dominoes.charAt(i) == '.') {
				leftCloseR[i] = i > 0 ? leftCloseR[i - 1] : -1;
			} else {
				leftCloseR[i] = -1;
			}
		}

		for (int i = n - 1; i >= 0; i--) {
			char ch = dominoes.charAt(i);
			if (ch == 'L') {
				rightCloseL[i] = i;
			} else if (ch == '.') {
				rightCloseL[i] = i < n - 1 ? rightCloseL[i + 1] : -1;
			} else {
				rightCloseL[i] = -1;
			}
		}

		char[] arr = new char[n];
		for (int i = 0; i < arr.length; i++) {
			if (rightCloseL[i] == leftCloseR[i]) {
				arr[i] = '.';
			} else if (rightCloseL[i] == -1) {
				arr[i] = 'R';
			} else if (leftCloseR[i] == -1) {
				arr[i] = 'L';
			} else {
				int distL = Math.abs(i - rightCloseL[i]);
				int distR = Math.abs(i - leftCloseR[i]);
				if (distL == distR) {
					arr[i] = '.';
				} else {
					arr[i] = distL < distR ? 'L' : 'R';
				}
			}
		}
		String ans = "";
		for (char ch : arr) {
			ans += ch;
		}
		return ans;
	}

}
