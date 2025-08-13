package LEETCODE;

public class Find_the_Index_of_the_First_Occurrence_in_a_String_28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String haystack = "hello", needle = "ll";
		System.out.println(index(haystack, needle));

	}
	
	public static int index(String haystack,String needle) {
		int j=needle.length();
		for (int i = 0; j <= haystack.length(); i++) {
			if(haystack.substring(i,j).equals(needle)) {
				return i;
			}
			j++;
		}
		
		return -1;
	}

}
