package LEETCODE;

public class Final_Value_of_Variable_After_Performing_Operations_2011 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] operations = { "--X", "X++", "X++" };
		System.out.println(find_value(operations));
	}

	public static int find_value(String[] arr) {
		int ans = 0;
		for (String s : arr) {
			if (s.equals("--X") || s.equals("X--")) {
				ans--;
			} else {
				ans++;
			}
		}
		return ans;
	}

}
