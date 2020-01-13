package Strings;

import java.util.ArrayList;

public class PrettyJsonString {

	public static void main(String[] args) {
		String s = "[\"foo\", {\"bar\":[\"baz\",null,1.0,2]}]";
		prettyJSON(s);
	}

	public static ArrayList<String> prettyJSON(String A) {
		ArrayList<String> resArr = new ArrayList<String>();
		int NosBolck = 0;
		String str2 = String.format("%c", ' ');
		if (A.length() <= 0) {
			return new ArrayList<String>();
		}
		resArr.add(String.valueOf(A.charAt(0)));

		System.out.print(A.charAt(0));
		System.out.println();
		NosBolck += 4;
		str2 = String.format("%" + NosBolck + "c", ' ');
		for (int i = 1; i < A.length(); i++) {
			if (A.charAt(i) == '{') {
				System.out.println();
				resArr.add("");
				resArr.add(str2 + A.charAt(i));
				System.out.print(str2 + A.charAt(i));
				resArr.add("");				
				System.out.println();
				NosBolck += 4;
				str2 = String.format("%" + NosBolck + "c", ' ');
			} else if (A.charAt(i) == '}') {
				System.out.println();
				resArr.add("");				
				NosBolck -= 4;
				if (NosBolck <= 0) {
					resArr.add(A.charAt(i) + "");
					System.out.print(A.charAt(i));

				} else {
					str2 = String.format("%" + NosBolck + "c", ' ');
					System.out.print(str2 + A.charAt(i));
					resArr.add(str2 + A.charAt(i));
				}
			} else if (A.charAt(i) == '[') {
				System.out.println();
				resArr.add("");
				System.out.print(str2 + A.charAt(i));
				resArr.add(str2 + A.charAt(i));
				System.out.println();
				resArr.add("");
				NosBolck += 4;
				str2 = String.format("%" + NosBolck + "c", ' ');
			} else if (A.charAt(i) == ']') {
				System.out.println();
				NosBolck -= 4;
				if (NosBolck <= 0) {
					System.out.print(A.charAt(i));

				} else {
					str2 = String.format("%" + NosBolck + "c", ' ');
					System.out.print(str2 + A.charAt(i));
				}
			} else if (A.charAt(i) == ',') {
				System.out.print(",");
				System.out.println(str2);
			} else if (A.charAt(i - 1) == '{' || A.charAt(i - 1) == '}' || A.charAt(i - 1) == ','
					|| A.charAt(i - 1) == '[' || A.charAt(i - 1) == ']') {
				System.out.print(str2 + A.charAt(i));
			} else {
				System.out.print(A.charAt(i));

			}

		}
		return resArr;
	}
}
