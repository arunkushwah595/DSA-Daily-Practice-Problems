package LEETCODE;

import java.util.Arrays;

public class Boats_to_Save_People_881 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] people = { 1, 1, 2, 3, 3 };
		int limit = 4;
		System.out.println(numRescueBoats(people, limit));
	}

	public static int numRescueBoats(int[] people, int limit) {
		Arrays.sort(people);
		int c = 0;
		int i = 0;
		int j = people.length - 1;
		while (i <= j) {
			int weight = people[i] + people[j];
			if (weight <= limit) {
				j--;
				i++;
				c++;
			} else {
				j--;
				c++;
			}
		}
		return c;
	}

}
