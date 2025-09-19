package LEETCODE;

import java.util.Arrays;

public class Reverse_Words_in_String_151 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "   the  sky is    blue        ";
		System.out.println(s);
//		s=s.trim();
//		System.out.println(s);
//		
//		String [] arr=s.split(" +");
//		System.out.println(Arrays.toString(arr));
		
		System.out.println(reverseWord(s));
		
	}
	
	public static String reverseWord(String s) {
		s=s.trim();
		String [] arr=s.split(" +");
		String ans="";
		for (int i = arr.length-1	;i >=0; i--) {
			ans=ans+arr[i]+" ";
		}
		return ans.trim();
	}

}
