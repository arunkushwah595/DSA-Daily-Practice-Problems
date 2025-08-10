package LEETCODE;

public class Balanced_Binary_Tree_110 {

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
		public boolean isBalanced(TreeNode root) {
			if (ht(root) != -1) {
				return true;
			}
			return false;
		}

		private int ht(TreeNode node) {
			if (node == null) {
				return 0;
			}

			int lt = ht(node.left);
			if (lt == -1) {
				return -1;
			}
			int rt = ht(node.right);
			if (rt == -1) {
				return -1;
			}

			if (Math.abs(lt - rt) > 1) {
				return -1;
			}
			return Math.max(lt, rt) + 1;

		}
	}

}
