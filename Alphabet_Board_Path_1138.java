package LEETCODE;

public class Alphabet_Board_Path_1138 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String target = "zdz";
		System.out.println(alphabetBoardPath(target));
	}

	public static String alphabetBoardPath(String target) {
		return path(target);
	}

	private static String path(String s) {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder();
		int cr = 0;
		int cc = 0;
		for (char ch : s.toCharArray()) {
			int r = (ch - 'a') / 5;
			int c = (ch - 'a') % 5;

			int h = cr - r;
			int w = cc - c;

			String ud = "U";
			for (int i = 0; i < h; i++) {
				sb.append(ud);
			}

			String lr = "L";
			for (int i = 0; i < w; i++) {
				sb.append(lr);
			}

			ud = "D";
			int hdist = r - cr;
			for (int i = 0; i < hdist; i++) {
				sb.append(ud);
			}

			lr = "R";
			int wdist = c - cc;
			for (int i = 0; i < wdist; i++) {
				sb.append(lr);
			}

			sb.append('!');
			cr = r;
			cc = c;
		}

		return sb.toString();
	}

}
