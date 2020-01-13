package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class Non_repeating_character {

	public static void main(String[] args) {

		String str = "aaaaaaacbcdr";
		//a -1 b b
		System.out.println(solve(str));
	}

		public static String solve(String A) {
			StringBuilder sb = new StringBuilder();
			int[] chFreq = new int[26];
			Queue<Character> que = new LinkedList<Character>();
			for (int i = 0; i < A.length(); i++) {
				que.add(A.charAt(i));
				chFreq[A.charAt(i) - 'a']++;
				
				 while (!que.isEmpty()) { 
			            if (chFreq[que.peek() - 'a'] > 1) 
			                que.remove(); 
			            else { 
			                sb.append(que.peek()); 
			                break; 
			            } 
			        } 
				if(que.isEmpty()) {
					sb.append(-1);
				}
				
				
	
			}
			return sb.toString();
		}

}
