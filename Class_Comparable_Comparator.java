package LEETCODE;

import java.util.*;

public class Class_Comparable_Comparator {

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);

		System.out.println();

		ArrayList<Person> ll = new ArrayList<>();
		Person p1 = new Person(2, 1, "A");
		Person p2 = new Person(3, 5, "B");
		Person p3 = new Person(1, 6, "C");
		Person p4 = new Person(7, 5, "D");
		Person p5 = new Person(2, 1, "E");
		Person p6 = new Person(9, 4, "F");
		Person p7 = new Person(3, 9, "G");

		ll.add(p1);
		ll.add(p2);
		ll.add(p3);
		ll.add(p4);
		ll.add(p5);
		ll.add(p6);
		ll.add(p7);

		System.out.println("Before Sort");
		for (int i = 0; i < ll.size(); i++) {
			System.out.println(ll.get(i).toString());
		}

		System.out.println();

		Collections.sort(ll, (a, b) -> a.h - b.h);

		System.out.println("After Sort");

		for (int i = 0; i < ll.size(); i++) {
			System.out.println(ll.get(i).toString());
		}

		System.out.println();
		System.out.println();

		Person[] arr = { p1, p2, p3, p4, p5, p6, p7 };
		Arrays.sort(arr);
		for (Person p : arr) {
			System.out.println(p.toString());
		}

	}

	static class Person implements Comparable<Person> {
		int h;
		int a;
		String name;

		public Person(int h, int a, String name) {
			this.h = h;
			this.a = a;
			this.name = name;
		}

		@Override
		public String toString() {
			String s = "[Name:- " + name + "    Height:- " + h + "    Age:- " + a;
			return s;

		}

		public int compareTo(Person other) {
			// age
			if (this.a != other.a) {
				return this.a - other.a;
			}

			// Height
			if (this.h != other.h) {
				return this.h - other.h;
			}

			// name
			return this.name.compareTo(other.name);
		}

	}

}
