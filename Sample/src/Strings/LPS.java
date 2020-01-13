package Strings;

import java.util.Arrays;

public class LPS {

	public static void main(String[] args) {
		System.out.println((solve("NINN")));
	}

	  public static int solve(String A) {
		
		  StringBuilder sb = new StringBuilder(A);
		  
		  int [] lsp=  computeLPS(A+"$"+sb.reverse().toString());
		  
		  
		  return A.length()-lsp[lsp.length-1];
	    }
	public static int[] computeLPS(String s) {

		int[] lps = new int[s.length()];
		int i = 1;
		int j = 0;
		lps[0] = 0;

		while (i < s.length()) {

			if (s.charAt(i) == s.charAt(j)) {
				lps[i] = j + 1;
				i++;
				j++;

			} else {

				if (j != 0) {
					j = lps[j - 1];
				} else {
					lps[i] = 0;
					i++;
				}

			}

		}

		return lps;

	}

}
