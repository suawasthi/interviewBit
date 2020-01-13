package test;

public class RepeatedString {

	public static void main(String[] args) {
		String input ="abcabcabcabc";
		int max=Integer.MIN_VALUE;
		for(int i=0;i<input.length();i++) {
			int count=-1;
			int current=i;
			for (int j = i+1; j < input.length(); j++) {
				System.out.println(input.charAt(current) +": :"+input.charAt(j));
				if(input.charAt(current)==input.charAt(j)) {
					count++;
					current++;
					max= Math.max(max, count);
					continue;
				}
				current=i;
				count=-1;
			}
		}
		System.out.println(max);
	}

}
