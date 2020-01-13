package searching;

public class SquareRoot {

	
	public static void main(String[] args) {
		System.out.println(sqrt(2147483647));
	}
	
	
	public static int sqrt(int a) {
		int low = 0;
		int high = a;
		return binarySearch(low, high, a);
	}

	public static int binarySearch(long low, long high, long a) {

		while (low <= high) {
			long mid = low + (high - low) / 2;
			long m = mid * mid;
			if (m == a) {
				return (int)mid;
			}
			if (m > a) {
				high = mid - 1;
			}
			if (m < a ) {
				low = mid + 1;
			}

		}
		return (int)high;
	}
}
