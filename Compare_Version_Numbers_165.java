package LEETCODE;

public class Compare_Version_Numbers_165 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String version1 = "1.2", version2 = "1.10";

		System.out.println(compareVersion(version1, version2));

	}

	public static int compareVersion(String version1, String version2) {
		String[] p1 = version1.split("\\.");
		String[] p2 = version2.split("\\.");

		int maxLength = Math.max(p1.length, p2.length);

		for (int i = 0; i < maxLength; i++) {
			Integer val1 = (i < p1.length) ? Integer.parseInt(p1[i]) : 0;

			Integer val2 = (i < p2.length) ? Integer.parseInt(p2[i]) : 0;

			int compare = val1.compareTo(val2);

			if (compare != 0) {
				return compare;
			}
		}
		return 0;
	}
}
