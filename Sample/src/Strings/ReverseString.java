package Strings;

public class ReverseString {

	public static void main(String[] args) {
		String a="My name  is suraj";
		System.out.println(reverseWords(a));
	}
	public static String reverseWords(String a) {
		
		String[] s= a.trim().split("");
		StringBuilder sb = new StringBuilder();
		for (int i = s.length-1; i >=0; i--) {
			if(!s[i].equals("")) {
			sb.append(s[i]);
			sb.append(" ");
			}
		}
		return sb.toString().trim();
	}
	
	

}
