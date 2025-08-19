package lec41;

public class Binary_Tree_Cameras_968 {

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
		int camera = 0;

		public int minCameraCover(TreeNode root) {
			int c = minCamera(root);
			if (c == -1) {
				camera++;
			}
			return camera;
		}

		public int minCamera(TreeNode root) {
			// -1 ---> need Camera
			// 0 ---> Covered
			// 1 ---> has Camera

			if (root == null) {
				return 0;
			}

			int left = minCamera(root.left);
			int right = minCamera(root.right);
			if (left == -1 || right == -1) { // -1 ---> is node pe Camera ki need hai
				camera++;
				return 1; // 1 ---> Camera setup kara hai is node pe
			}
			if (left == 1 || right == 1) { // inme se koi ek ke paas ya dono ke paas camera hai
				return 0; // Node camera se covered hai
			} else {
				return -1; // need camera
			}
		}
	}

}
