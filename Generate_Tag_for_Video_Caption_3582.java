package LEETCODE;

public class Generate_Tag_for_Video_Caption_3582 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String caption = "   Leetcode    daily streak achieved";
		System.out.println(generateTag(caption));
	}

	public static String generateTag(String caption) {
		StringBuilder sb = new StringBuilder();
		String[] arr = caption.trim().split(" +");
		for (int i = 0; i < arr.length; i++) {
			if (i == 0) {
				sb.append(arr[i].toLowerCase());
			} else {
				sb.append(capitalized(arr[i]));
			}
		}
		String ans = "#" + sb.toString();
		if (ans.length() > 100) {
			return ans.substring(0, 100);
		}
		return ans;
	}

	private static String capitalized(String s) {
		// TODO Auto-generated method stub
		String ans = s.substring(0, 1).toUpperCase() + s.substring(1).toLowerCase();
		return ans;
	}

}
