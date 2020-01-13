package Strings;

import java.util.HashMap;
import java.util.HashSet;

public class SameFormatString {

	public static void main(String[] args) {
		String A = "WHMSNCBXCO";
		String B = "HHHHHHHHMMMMMMMSSSSSSSNNNNNNNNCCCBBBBBBBBXXXCCCCCCCO";
		System.out.println(solve(A, B));

	}

	public static int solve(final String A, final String B) {

		int i = 0;
		int j = 0;
		
		
		if(A.length()>B.length()) {
			return 0;
		}
		
		
		while (j < B.length() && i < A.length()) {

			if(i==0 && j==0 && B.charAt(j) != A.charAt(i)) {
				return  0;
			}
			
			
			if (B.charAt(j) == A.charAt(i)) {
				j++;
				continue;
			}
			i++;
			
			if (i < A.length() && B.charAt(j) == A.charAt(i)) {
				continue;
			} else if (i < A.length() && B.charAt(j) != A.charAt(i)) {
				return 0;
			}
			
			if(i==A.length() && j!=B.length()) {
				return 0;
			}

		}
		if(i!=A.length()-1 && j==B.length()) {
			return 0;
		}
		return 1;
	}

}
