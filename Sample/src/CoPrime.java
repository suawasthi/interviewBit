public class CoPrime {

	public static void main(String[] args) {
		System.out.println(cpFact(100, 26));
	}

	public static int cpFact(int A, int B) {

		int X = A;
		int y = gcd(X, B);
		while (y > 1) {
			X = X / y;
			y=gcd(X, B);
			
		}
		return X;

	}

	public static int gcd(int x, int y) {

		int min = Math.min(x, y);
		int max = Math.max(x, y);

		if (max % min == 0) {
			return min;
		}

		return gcd((max % min), min);

	}

}
