package LEETCODE;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Replace_Words_648 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> dictionary = Arrays.asList("cat", "bat", "rat");
		String sentence = "the cattle was rattled by the battery";
		System.out.println(replaceWords(dictionary, sentence));
	}

	public static String replaceWords(List<String> dictionary, String sentence) {

		Trie t = new Trie();

		for (String s : dictionary) {
			t.insert(s);
		}

		String[] arr = sentence.split(" ");
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < arr.length; i++) {
			String get = t.search(arr[i]);
			sb.append(get + " ");
		}
		return sb.toString().trim();
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
	}

}
