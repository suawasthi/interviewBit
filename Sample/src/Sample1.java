
public class Sample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int solve(int A) {
		long num = A;
		int mod = 100000007;
		return (int) ((fact(2 * num) % mod) / (fact(num + 1) % mod * fact(num) % mod) % mod);

	}

	public static long fact(long i) {
		if (i <= 1) {
			return 1;
		}
		return i % 100000007 * fact(i - 1) % 100000007;
	}

}
