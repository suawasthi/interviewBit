import java.util.Arrays;

public class CatalanNumber {

	public static void main(String[] args) {
		System.out.println(catalanNumber(20));
	}

	public static int catalanNumber(int a) {

		long[] catalin = new long[a];
		long result = 1;
		catalin[0] = 1;
		catalin[1] = 1;

		for (int i = 2; i < a; i++) {
			catalin[i] = 0;
			for (int j = 0; j <= i - 1; j++) {
				catalin[i] += (catalin[j] % 1000000007) * (catalin[i - 1 - j] % 1000000007) % 1000000007;
			}
			result = (catalin[i] + 1000000007)% 1000000007;
		}
		return (int) (result+ 1000000007)% 1000000007;
	}
}
