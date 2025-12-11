package LEETCODE;

public class Verify_Preorder_Serialization_of_a_Binary_Tree_331 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String preorder = "9,3,4,#,#,1,#,#,2,#,6,#,#";
		System.out.println(isValidSerialization(preorder));
	}

	public static boolean isValidSerialization(String preorder) {
		String[] nodes = preorder.split(",");
		int diff = 1;
		for (String node : nodes) {
			if (--diff < 0)
				return false;
			if (!node.equals("#"))
				diff += 2;
		}
		return diff == 0;
	}

}
