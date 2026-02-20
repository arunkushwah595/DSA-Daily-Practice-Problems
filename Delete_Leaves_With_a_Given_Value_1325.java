package LEETCODE;

public class Delete_Leaves_With_a_Given_Value_1325 {

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
		public TreeNode removeLeafNodes(TreeNode root, int target) {
			return deleteNode(root, target);
			// return root;
		}

		private TreeNode deleteNode(TreeNode root, int target) {
			// TODO Auto-generated method stub
			if (root == null) {
				return null;
			}
			root.left = deleteNode(root.left, target);
			root.right = deleteNode(root.right, target);
			if (root.left == null && root.right == null && root.val == target) {
				return null;
			}
			return root;
		}
	}

}
