package hashing2;

import java.util.HashMap;
import java.util.Map;

public class WindowString {

	public static void main(String[] args) {
		String A = "w";
		String B = "o";
		System.out.println(minWindow(A, B));

	}

	public static String minWindow(String A, String B) {

		int[] ans = { 0, Integer.MAX_VALUE};
		int lastEnd=0;

		Map<Character, Integer> TF = new HashMap<Character, Integer>();
		char tChar[] = B.toCharArray();
		for (int i = 0; i < tChar.length; i++) {
			if (TF.get(tChar[i]) != null) {
				TF.put(tChar[i], TF.get(tChar[i]) + 1);
			} else {
				TF.put(tChar[i], 1);

			}
		}//Ni4KGIhjiiaPYl4f8YQ6U7PEYIwv6guxv3QGpUcVEtwsyd
		//NvTKppaXd
		//NvTKppaXd
		//NvTKppaXd
		//NvTKppaXd
		Map<Character, Integer> SF = new HashMap<Character, Integer>();
		int start = 0;
		int end = 0;

		char sChar[] = A.toCharArray();
		// find start and remove extra and unwanted element
		for (int i = 0; i < sChar.length; i++) {

			char key = sChar[i];
			char check = 0;
			if (TF.get(key) != null) {

				break;

			} else {
				start++;
				end++;
			}

		}

		for (int i = start; i < sChar.length; i++) {

			char key = sChar[i];
			if (TF.get(key) != null) {

				if (SF.get(key) != null) {
					SF.put(key, SF.get(key) + 1);

					end++;
					lastEnd=end;

					for (int k = start; k < i; k++) {

						if (TF.get(sChar[k]) == null) {
							if (SF.get(sChar[k]) != null) {
								SF.put(sChar[k], SF.get(sChar[k]) - 1);

							} else {
								SF.remove(sChar[k]);
							}
							start++;
						
							
						} else {
							if (SF.get(sChar[k]) > TF.get(sChar[k])) {
								start++;
								SF.put(sChar[k], SF.get(sChar[k]) - 1);
								
							} else {
								break;
							}
							

						}
						if (checkifCompleteandLength(SF, TF)) {
							if (ans[1] - ans[0] > end - start) {
								ans[0] = start;
								ans[1] = lastEnd;
								lastEnd=end;
							} 
						}

					}

					

				} else {
					if (SF.get(key) != null) {
						SF.put(key, SF.get(key) + 1);
					} else {
						SF.put(key, 1);
					}
					end++;
					if (checkifCompleteandLength(SF, TF)) {
						if (ans[1] - ans[0] > end - start) {
							ans[0] = start;
							ans[1] = end;
						} 
					}
				}

			} else {
				if (SF.get(key) != null) {
					SF.put(key, SF.get(key) + 1);
				} else {
					SF.put(key, 1);
				}
				end++;
				lastEnd=end;
			}

			if (checkifCompleteandLength(SF, TF)) {
				if (ans[1] - ans[0] > end - start) {
					ans[0] = start;
					ans[1] = lastEnd;
				} 
				
			}
			
		}

		
		if(ans[1]==Integer.MAX_VALUE) {
			return "";
		}

		return A.substring(ans[0], ans[1]);
	}

	private static boolean checkifCompleteandLength(Map<Character, Integer> sF, Map<Character, Integer> tF) {

		for (Map.Entry<Character, Integer> ent : tF.entrySet()) {
			if (sF.get(ent.getKey()) != null) {
				if (sF.get(ent.getKey()) >= ent.getValue()) {
					continue;
				} else
					return false;

			} else {
				return false;
			}
		}

		return true;

	}

}
