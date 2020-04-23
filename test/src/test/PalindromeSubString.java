package test;

public class PalindromeSubString {
	
	static int count=0;
	public static void main(String[] args) {
		String str=  "aba";
		//int count=0;
		for(int i=0;i<str.length();i++) {
			checkAround(str,i , i);
			checkAround(str, i, i+1);
		}
		
		System.out.println(count);
	}

	private static void checkAround(String str, int left, int right) {
		while(left >= 0 && right <str.length() && str.charAt(left)==str.charAt(right)) {
			left--;
			right++;
			count++;
		}
		
	}
	
	


}
