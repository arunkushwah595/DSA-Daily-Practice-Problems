package LEETCODE;

import java.util.HashMap;

public class Copy_List_with_Random_Pointer_138 {

	class Node {
		int val;
		Node next;
		Node random;

		public Node(int val) {
			this.val = val;
			this.next = null;
			this.random = null;
		}
	}

	public Node copyRandomList(Node head) {
		if (head == null) {
			return null;
		}
		HashMap<Node, Node> map = new HashMap<>();
		Node temp = head;
		while (temp != null) {
			map.put(temp, new Node(temp.val));
			temp = temp.next;
		}
		for (Node n : map.keySet()) {
			Node nn = map.get(n);
			if (n.next != null) {
				Node new_next = map.get(n.next);
				nn.next = new_next;
			}
			if (n.random != null) {
				Node new_ran = map.get(n.random);
				nn.random = new_ran;
			}
		}
		return map.get(head);
	}

}
