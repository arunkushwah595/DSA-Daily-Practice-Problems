package LEETCODE;

import java.lang.module.FindException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Word_Search_II_212 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[][] board = { { 'o', 'a', 'a', 'n' }, { 'e', 't', 'a', 'e' }, { 'i', 'h', 'k', 'r' },
				{ 'i', 'f', 'l', 'v' } };

		String[] words = { "oath", "pea", "eat", "rain" };
		System.out.println(findWords(board, words));
	}

	static List<String> ll;

	public static List<String> findWords(char[][] board, String[] words) {
		Trie t = new Trie();
		for (String s : words) {
			t.insert(s);
		}
		ll = new ArrayList<String>();
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[0].length; j++) {
				if (t.root.child.containsKey(board[i][j])) {
					t.Search(board, i, j, t.root);
				}
			}
		}

		return ll;
	}

	static class Trie {
		class Node {
			char ch;
			String isTerminal;
			HashMap<Character, Node> child;

			public Node(char ch) {
				// TODO Auto-generated constructor stub
				this.ch = ch;
				child = new HashMap<>();
			}
		}

		private Node root = new Node('*');

		public void insert(String word) {
			Node curr = root;
			for (int i = 0; i < word.length(); i++) {
				char ch = word.charAt(i);
				if (curr.child.containsKey(ch)) {
					curr = curr.child.get(ch);
				} else {
					Node nn = new Node(ch);
					curr.child.put(ch, nn);
					curr = nn;
				}
			}
			curr.isTerminal = word;
		}

		public String search(String word) {
			Node curr = root;
			for (int i = 0; i < word.length(); i++) {
				char ch = word.charAt(i);
				if (curr.child.containsKey(ch)) {
					curr = curr.child.get(ch);
					if (curr.isTerminal != null) {
						return curr.isTerminal;
					}
				} else {
					return word;
				}
			}
			return word;
		}

		public void Search(char[][] board, int i, int j, Node node) {
			// TODO Auto-generated method stub
			if (i < 0 || j < 0 || i >= board.length || j >= board[0].length || !node.child.containsKey(board[i][j])) {
				return;
			}
			char ch = board[i][j];
			node = node.child.get(ch);
			if (node.isTerminal != null) {
				ll.add(node.isTerminal);
				node.isTerminal = null;
			}
			board[i][j] = '*';
			Search(board, i + 1, j, node);
			Search(board, i - 1, j, node);
			Search(board, i, j + 1, node);
			Search(board, i, j - 1, node);
			board[i][j] = ch;
		}
	}

}
