package test;

import java.util.ArrayList;

public class IPAddress {

	public static void main(String[] args) {
		System.out.println(restoreIpAddresses("25525511135"));
	}

	public static ArrayList<String> restoreIpAddresses(String A) {
		ArrayList<String> ans = new ArrayList<String>();
		for (int i = 0; i < 4; i++) {
			if (isValid(A.substring(0, i))) {
				String first = A.substring(0, i);
				System.out.print(first);
				int jL=i+4;
				for (int j = i + 1; j < jL && j<A.length(); j++) {
					if (isValid(A.substring(i, j))) {
						String second = A.substring(i, j);
						System.out.print(second);
						int Kl=j+4;
						for (int k = j + 1; k < Kl && k < A.length(); k++) {
							if (isValid(A.substring(j, k))) {
								String third = A.substring(j, k);
								System.out.print(third);
								if (isValid(A.substring(k, A.length() ))) {
									String as = first + "." + second + "." + third + "." + A.substring(k, A.length());
									ans.add(as);
								}
							}
						}
					}
				}

			}

		}
		return ans;

	}

	public static boolean isValid(String A) {
		if (A.equals(""))
			return false;
		if (A.length() == 0)
			return false;
		if(A.length() > 1 && Integer.valueOf(A)==0) return false;
		if (Integer.valueOf(A) == 0)
			return true;
		if (A.length() > 1 && A.substring(0, 1).equals("0"))
			return false;
		if (Integer.valueOf(A) > 0 && Integer.valueOf(A) < 256) {
			return true;
		}
		return false;

	}

}
