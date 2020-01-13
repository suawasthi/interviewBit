package Strings;
import java.util.ArrayList;
import java.util.Arrays;

public class PrefixComputation {

	public static void main(String[] args) {
		String[] A= {"abcd", "abcd", "efgh" };
		System.out.println(longestCommonPrefix(Arrays.asList(A)));
	}

	public static  String longestCommonPrefix(java.util.List<String> A) {
		
		if (A.size()<0) {
			return "";
		}
		String first= A.get(0);
		for (int i = 1; i < A.size(); i++) {
			first= findprefix(first, A.get(i));
		}
		
		
		return first;
	}

	private static  String  findprefix(String str, String str1) {

		int i=0;
		int j=0;
		
		
		int n =str.length();
		int m= str1.length();
		StringBuilder sb = new StringBuilder();
		while(i<n && j<m) {
			
			while (str.charAt(i) ==str1.charAt(j)) {
				sb.append(str.charAt(i));
				i++;
				j++;
				if(i>=n || j>=m) {
					break;
				}
			}
			j++;
			if(j==m) {
				i++;
				j=0;
			}

		}
		
		
		return sb.toString();
	}
}
