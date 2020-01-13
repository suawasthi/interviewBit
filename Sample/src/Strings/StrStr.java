package Strings;

public class StrStr {

	public static void main(String[] args) {
		System.out.println(strStr("hellookljhf", "f"));
	}
	
	 public static int strStr(String A, String B) {
		 if(B.length()>A.length()) {
			 return -1;
		 }
		 
		 int threshold = B.length();
		 for (int i = 0; i < A.length()-threshold+1; i++) {
			 String prefix=A.substring(i, i+threshold);
			if(prefix.equals(B)) {
				return i;
			}
		}
		 return -1;
	 
	 }
	 

}
