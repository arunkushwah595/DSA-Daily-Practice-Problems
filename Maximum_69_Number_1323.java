package LEETCODE;

public class Maximum_69_Number_1323 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 9669;
		System.out.println(maximum69Number(num));
	}

	public static int maximum69Number(int num) {
		StringBuilder sb = new StringBuilder("" + num);
		for (int i = 0; i < sb.length(); i++) {
			if (sb.charAt(i) == '6') {
				sb.setCharAt(i, '9');
				break;
			}
		}
		return Integer.parseInt(sb.toString());
	}

}
