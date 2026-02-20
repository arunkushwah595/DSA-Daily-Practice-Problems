package LEETCODE;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Closest_Nodes_Queries_in_a_Binary_Search_Tree_2476 {

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
		public List<List<Integer>> closestNodes(TreeNode root, List<Integer> queries) {
			List<Integer> arr = new ArrayList<>();
			inorder(root, arr);
			List<List<Integer>> nl = new ArrayList<List<Integer>>();
			for (int q : queries) {
				int a = min(arr, q);
				int b = max(arr, q);
				nl.add(new ArrayList<>(Arrays.asList(a, b)));
			}
			return nl;
		}

		public static void inorder(TreeNode root, List<Integer> arr) {
			if (root == null) {
				return;
			}
			inorder(root.left, arr);
			arr.add(root.val);
			inorder(root.right, arr);
		}

		public static int min(List<Integer> arr, int target) {
			int ans = -1;
			int si = 0;
			int ei = arr.size() - 1;
			while (si <= ei) {
				int mid = (si + ei) / 2;
				if (arr.get(mid) == target) {
					return target;
				} else if (arr.get(mid) < target) {
					ans = arr.get(mid);
					si = mid + 1;
				} else {
					ei = mid - 1;
				}
			}
			return ans;
		}

		public static int max(List<Integer> arr, int target) {
			int ans = -1;
			int si = 0;
			int ei = arr.size() - 1;
			while (si <= ei) {
				int mid = (si + ei) / 2;
				if (arr.get(mid) == target) {
					return target;
				}
				if (arr.get(mid) > target) {
					ans = arr.get(mid);
					ei = mid - 1;
				} else {
					si = mid + 1;
				}
			}
			return ans;
		}
	}
}
