package Strings;

public class PrettyJSON {

	public static void main(String[] args) {
		String s = "{A:"B,C:{D:\"E\",F:{G:\"H\",I:\"J\"}}}";
		prettyJSON(s);
	}

	public static void prettyJSON(String A) {
		int NosBolck = 0;
		String ind = String.format("%c", ' ');
		System.out.println(ind);
		System.out.print(A.charAt(0));
		System.out.println();
		NosBolck += 4;
		ind = String.format("%" + NosBolck + "c", ' ');
		for (int i = 1; i < A.length(); i++) {
			if (A.charAt(i) == '{') {
				System.out.println( A.charAt(i));
				NosBolck += 4;
				ind = String.format("%" + NosBolck + "c", ' ');
			} else if (A.charAt(i) == '}') {
				System.out.println();
				NosBolck -= 4;
				if (NosBolck <= 0) {
					System.out.print(A.charAt(i));

				} else {
					ind = String.format("%" + NosBolck + "c", ' ');
					System.out.print(ind + A.charAt(i));
				}
			} 
			else if(A.charAt(i) == '[') {
				System.out.println();
				System.out.print(ind + A.charAt(i));
				System.out.println();
				NosBolck += 4;
				ind = String.format("%" + NosBolck + "c", ' ');
			}
			else if (A.charAt(i) == ']') {
				System.out.println();
				NosBolck -= 4;
				if (NosBolck <= 0) {
					System.out.print(A.charAt(i));

				} else {
					ind = String.format("%" + NosBolck + "c", ' ');
					System.out.print(ind + A.charAt(i));
				}
			} else if (A.charAt(i) == ',') {
				System.out.print(",");
				System.out.println(ind);
			} else if (A.charAt(i) == ',') {
				System.out.print(",");
				System.out.print(ind);
			} else if (A.charAt(i - 1) == '{' || A.charAt(i - 1) == '}' || A.charAt(i - 1) == ',' || A.charAt(i - 1) == '['|| A.charAt(i - 1) == ']') {
				System.out.print(ind + A.charAt(i));
			} else {
				System.out.print(A.charAt(i));

			}

		}

	}
}