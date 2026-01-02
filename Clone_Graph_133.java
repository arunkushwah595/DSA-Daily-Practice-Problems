package LEETCODE;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Clone_Graph_133 {

	class Node {
		public int val;
		public List<Node> neighbors;

		public Node() {
			val = 0;
			neighbors = new ArrayList<Node>();
		}

		public Node(int _val) {
			val = _val;
			neighbors = new ArrayList<Node>();
		}

		public Node(int _val, ArrayList<Node> _neighbors) {
			val = _val;
			neighbors = _neighbors;
		}
	}

	class Solution {
		public Node cloneGraph(Node node) {
			if (node == null) {
				return null;
			}
			HashMap<Node, Node> map = new HashMap<>();
			Queue<Node> q = new LinkedList<>();
			map.put(node, new Node(node.val));
			q.add(node);
			while (!q.isEmpty()) {
				Node r = q.poll();
				for (Node nbrs : r.neighbors) {
					if (!map.containsKey(nbrs)) {
						map.put(nbrs, new Node(nbrs.val));
						q.add(nbrs);
					}
					map.get(r).neighbors.add(map.get(nbrs));
				}
			}
			return map.get(node);
		}
	}

}
