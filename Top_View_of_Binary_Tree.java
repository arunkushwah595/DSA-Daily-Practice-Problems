package lec46;

import java.util.*;

public class Top_View_of_Binary_Tree {

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
		public List<Integer> TopView(TreeNode root) {
			TreeMap<Integer, Integer> map = new TreeMap<Integer, Integer>();
			List<Integer> ll = new ArrayList<Integer>();
			view(root, 0, map);
			for (int key : map.keySet()) {
				ll.add(map.get(key));
			}
			return ll;
		}

		public void view(TreeNode root, int curr, TreeMap<Integer, Integer> map) {
			if (root == null) {
				return;
			}
			if (!map.containsKey(curr)) {
				map.put(curr, root.val);
			}
			view(root.left, curr - 1, map);
			view(root.right, curr + 1, map);
		}
	}

}
