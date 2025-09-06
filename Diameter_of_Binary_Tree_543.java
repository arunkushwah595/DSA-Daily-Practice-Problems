package LEETCODE;

public class Diameter_of_Binary_Tree_543 {

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

	public int diameterOfBinaryTree(TreeNode root) {
		
		if(root==null) {
			return 0;
		}
		
		int ld = diameterOfBinaryTree(root.left);  // ld --> left diameter
		int rd = diameterOfBinaryTree(root.right);  // rd --> right diameter
		int sd = ht(root.left) + ht(root.right) + 2;  // sd--> self diameter
		return Math.max(Math.max(rd, ld), sd);
	}

	public int ht(TreeNode nn) {
		if (nn == null) {
			return -1;
		}

		int lh = ht(nn.left);
		int rh = ht(nn.right);
		return Math.max(lh, rh) + 1;
	}
}
