package HackerEearth;

public class SetNumber {
	
	public static void main(String[] args) {
		int input = 1; 
		char[] str= Integer.toString(input, 2).toCharArray();
		str[0]='0';
		boolean isperfect;
		String s= Integer.toString(input, 2);
		if(s.matches("1*")) {
			System.out.println(input);
		}
		
		for (int i = 1; i < str.length; i++) {
			if(str[i]=='0') {
				str[i]='1';
				
			}
			
		}
		Integer ab= Integer.parseInt(String.valueOf(str), 2);
		System.out.println(ab);
		
	}
	
	

}
