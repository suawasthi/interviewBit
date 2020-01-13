package Strings;

import java.util.Arrays;

public class version {

	public static void main(String[] args) {
		System.out.println(compareVersion("1.0.0.0", "1"));
	}

	public static int compareVersion(String A, String B) {

		int ans = 0;
		A = A.replace(".", "@");
		B = B.replace(".", "@");
		String[] version1a = A.split("@");
		String[] version2a = B.split("@");
		int m = version1a.length;
		int n = version2a.length;

		int max = Math.max(version1a.length, version2a.length);
		String[] version1 = new String[max];
		String[] version2 = new String[max];
		// version1a = Arrays.copyOfRange(version1, 0, version1.length);
		version2 = Arrays.copyOfRange(version2a, 0, max);
		if (version1a.length > version2a.length) {
			int diff = max - version2a.length;
			while (diff != 0) {
				version2[n] = new String();
				version2[n] = "0";
				n++;
				diff--;
			}
		}
		version1 = Arrays.copyOfRange(version1a, 0, max);
		if (version1a.length < version2a.length) {
			int diff = max - version1a.length;
			while (diff != 0) {
				version1[m] = new String();
				version1[m] = "0";
				m++;
				diff--;
			}
		}
		int i = 0;
		int j = 0;
		while (i < version1.length && j < version2.length) {
			int k = 0;
			while (version1[i] != null && !version1[i].isEmpty() && version1[i].charAt(k) == '0'
					&& version1[i].length() > 1) {
				k++;
				version1[i] = version1[i].substring(k);
				k--;

			}
			k = 0;
			while (version2[j] != "" && !version2[j].isEmpty() && version2[j].charAt(k) == '0'
					&& version2[j].length() > 1) {
				k++;
				version2[j] = version2[j].substring(k);
				k--;
			}

			if (!version1[i].isEmpty() && !version2[j].isEmpty() && version1[i].equals(version2[j])) {
				if (j == version2.length - 1 || i == version1.length - 1) {
					if (version1.length > version2.length) {
						return 1;
					} else if (version1.length < version2.length) {
						return -1;
					} else {
						return 0;
					}
				}
				i++;
				j++;
			} else {

				if (version1[i].length() > version2[j].length()) {
					return 1;
				}
				if (version1[i].length() < version2[j].length()) {
					return -1;
				} else {
					int res = version1[i].compareTo(version2[j]);
					if (res == 0) {
						return 0;
					}
					if (res > 0) {
						return 1;
					} else {
						return -1;
					}
				}
			}

		}
		return 0;
	}

}
