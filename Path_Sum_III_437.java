package LEETCODE;

public class Path_Sum_III_437 {

	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode() {
		}

		TreeNode(int val) {
			this.val = val;
		}

		TreeNode(int val, TreeNode left, TreeNode right) {
			this.val = val;
			this.left = left;
			this.right = right;
		}
	}

	class Solution {
		public int pathSum(TreeNode root, int targetSum) {
			if (root == null) {
				return 0;
			}
			return sum(root, targetSum);
		}

		public static int sum(TreeNode root, int t) {
			if (root == null) {
				return 0;
			}
			if (t == 0) {
				return 1;
			}

			int il = sum(root.left, t - root.val);
			int el = sum(root.left, t);
			int ir = sum(root.right, t - root.val);
			int er = sum(root.right, t);
			return il + el + ir + er;
		}
	}

}
