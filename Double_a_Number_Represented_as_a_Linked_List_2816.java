package LEETCODE;

public class Double_a_Number_Represented_as_a_Linked_List_2816 {

	public class ListNode {
		int val;
		ListNode next;

		ListNode() {
		}

		ListNode(int val) {
			this.val = val;
		}

		ListNode(int val, ListNode next) {
			this.val = val;
			this.next = next;
		}
	}

	static int crr;

	public ListNode doubleIt(ListNode head) {
		crr = 0;
		rec(head);
		if (crr == 0) {
			return head;
		}

		ListNode temp = new ListNode(crr, head);
		return temp;
	}

	public static void rec(ListNode node) {
		if (node == null) {
			return;
		}
		rec(node.next);
		int n = node.val * 2;
		int d = n % 10;
		node.val = d + crr;
		crr = n / 10;
	}

}
