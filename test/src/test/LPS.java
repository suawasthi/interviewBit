package test;

import java.util.ArrayList;

public class LPS {

	public static void main(String[] args) {
		String s = "babb";
		System.out.println(solve(s));
		
		//System.out.println(arrr);
	//	System.out.println(arrr.get(arrr.size()-1));
	}

	static ArrayList<Integer> arrr = new ArrayList<Integer>();


    public static int solve(String A) {
        int len= A.length();
        StringBuilder sb = new StringBuilder(A);
        String rev= sb.reverse().toString();
        sb.reverse().append("$").append(rev);
        //sb.append(rev);
        
        LPS(sb.toString());
        
        //System.out.println(arrr);
        //System.out.println(sb);
        int ken=arrr.get(arrr.size()-1);
        //System.out.println(len-ken);

        
        return len-ken;
    }
    
    
	
	private static void LPS(String s) {

		int j = 0;
		int i = 1;
		arrr.add(0);
		while (i < s.length()) {

			if (s.charAt(i) == s.charAt(j)) {

				int len = arrr.size() - 1;
				j++;
				arrr.add(i, j);
				i++;
				
			} else {

				if (j == 0) {
					arrr.add(0);
					i++;
		
		
				} else {
					j = arrr.get(j - 1);
				}
			}

		}

	}
}
