package LEETCODE;

public class Concatenate_Non_Zero_Digits_and_Multiply_by_Sum_II_leetcode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "10203004";
		int[][] queries = { { 0, 7 }, { 1, 3 }, { 4, 6 } };
		for (int i : sumAndMultiply(s, queries)) {
			System.out.println(i);
		}
	}

	public static int[] sumAndMultiply(String s, int[][] queries) {
		int n = s.length();
		Pair[] arr = new Pair[n];
		arr[0] = new Pair(s.charAt(0) - '0', s.charAt(0) - '0');
		for (int i = 1; i < n; i++) {
			long prevn = arr[i - 1].num;
			long prevs = arr[i - 1].sum;
			int curr = s.charAt(i) - '0';
			if (curr == 0) {
				arr[i] = new Pair(prevn, prevs);
			} else {
				arr[i] = new Pair(prevn * 10 + curr, prevs + curr);
			}
			System.out.println(arr[i]);
		}
		int MOD = 1000000007;
		int ans[] = new int[queries.length];
		int i = 0;
		for (int[] q : queries) {
			int l = q[0];
			int r = q[1];
			if (l == 0) {
				long val = arr[r].sum * arr[r].num;
				ans[i++] = (int) (val % (long) MOD);
			} else {
				Pair p = arr[l - 1];
				Pair pp = arr[r];
				long summ = pp.sum - p.sum;
				String s1 = "" + p.num;
				if (s1.length() == 1 && s.charAt(0) == '0') {
					s1 = "";
				}
				String s2 = "" + pp.num;
				long numm = 0;
				if (s1.length() != s2.length()) {
					int len = s2.length() - s1.length();
					long pow = (long) Math.pow(10, len);
					long numm1 = p.num * pow;
					numm = pp.num - numm1;
				}
				long val = summ * numm;
				ans[i++] = (int) (val % (long) MOD);
			}
		}
		return ans;
	}

	static class Pair {
		long num;
		long sum;

		public Pair(long num, long sum) {
			this.num = num;
			this.sum = sum;
		}

		@Override
		public String toString() {
			return this.num + "   " + this.sum;
		}
	}

//	-----------------------------------------------------------------------------------

	public static int[] sumAndMultiply2(String s, int[][] queries) {
		int n = s.length();
		final long MOD = 1_000_000_007L;
		long[] prefixNum = new long[n];
		int[] cnt = new int[n];
		long[] sum = new long[n];
		long[] pow10 = new long[n + 1];
		pow10[0] = 1;
		for (int i = 1; i <= n; i++)
			pow10[i] = (pow10[i - 1] * 10) % MOD;

		int d0 = s.charAt(0) - '0';
		sum[0] = d0;
		if (d0 == 0) {
			prefixNum[0] = 0;
			cnt[0] = 0;
		} else {
			prefixNum[0] = d0 % MOD;
			cnt[0] = 1;
		}

		for (int i = 1; i < n; i++) {
			int d = s.charAt(i) - '0';
			sum[i] = sum[i - 1] + d;
			if (d == 0) {
				prefixNum[i] = prefixNum[i - 1];
				cnt[i] = cnt[i - 1];
			} else {
				prefixNum[i] = (prefixNum[i - 1] * 10 + d) % MOD;
				cnt[i] = cnt[i - 1] + 1;
			}
		}

		int m = queries.length;
		int[] ans = new int[m];
		for (int i = 0; i < m; i++) {
			int l = queries[i][0];
			int r = queries[i][1];

			long subsum = (l == 0) ? sum[r] : (sum[r] - sum[l - 1]);

			int k = (l == 0) ? cnt[r] : (cnt[r] - cnt[l - 1]);
			long subnum;
			if (k == 0) {
				subnum = 0;
			} else {
				if (l == 0) {
					subnum = prefixNum[r];
				} else {
					long leftNum = prefixNum[l - 1];
					subnum = (prefixNum[r] - (leftNum * pow10[k]) % MOD) % MOD;
					if (subnum < 0)
						subnum += MOD;
				}
			}

			long val = (subsum % MOD) * subnum % MOD;
			if (val < 0)
				val += MOD;
			ans[i] = (int) val;
		}
		return ans;
	}

}
