package LEETCODE;

import java.util.ArrayList;
import java.util.List;

public class Palindrome_Linked_List_234 {

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

	class Solution {
		public boolean isPalindrome(ListNode head) {
			List<Integer> ll = new ArrayList<>();
			while (head != null) {
				ll.add(head.val);
				head = head.next;
			}
			int i = 0;
			int j = ll.size() - 1;
			while (i < j) {
				if (ll.get(i) != ll.get(j)) {
					return false;
				}
				i++;
				j--;
			}
			return true;
		}

	}

}
