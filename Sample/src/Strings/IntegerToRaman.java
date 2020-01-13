package Strings;

public class IntegerToRaman {

	public static void main(String[] args) {
		System.out.println(intToRoman(41));
	}

	public static String intToRoman(int A) {
		int[] arabicNumer = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };
		String[] romanCharacter = { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };
		StringBuilder s = new StringBuilder();
		for (int i = 0; i < arabicNumer.length; i++) {

			while (A - arabicNumer[i] >= 0) {
				s.append(romanCharacter[i]);
				A = A - arabicNumer[i];
			}

		}

		return s.toString();
	}

}
