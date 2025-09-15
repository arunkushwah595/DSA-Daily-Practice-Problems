package LEETCODE;

public class Cousins_in_Binary_Tree_993 {

	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}

	class Solution {
		static int xi = -1;
		static int yi = -1;
		static int xl = 0;
		static int yl = 0;

		public boolean isCousins(TreeNode root, int x, int y) {
			check(root, x, y, 0, 0);
			if (xl == yl) {
				if ((xi - 1) / 2 != (yi - 1) / 2) {
					return true;
				}
			}
			return false;
		}

		public static void check(TreeNode root, int x, int y, int i, int l) {
			if (root == null) {
				return;
			}
			if (root.val == x) {
				xi = i;
				xl = l;
			} else if (root.val == y) {
				yi = i;
				yl = l;
			}
			check(root.left, x, y, i * 2 + 1, l + 1);
			check(root.right, x, y, i * 2 + 2, l + 1);
		}

	}

}
