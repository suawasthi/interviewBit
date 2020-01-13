import java.util.Arrays;
import java.util.List;

public class RotatedSorted {

	public static void main(String[] args) {
		Integer a[] = { 101, 103, 106, 109, 158, 164, 182, 187, 202, 205, 2, 3, 32, 57, 69, 74, 81, 99, 100 };
		int b = 100;
		System.out.println(search(Arrays.asList(a), b));
	}

	public static int search(final List<Integer> a, int b) {
		int low = 0;
		int high = a.size() - 1;
		return performBinary(a, low, high, b);

	}

	private static int performBinary(List<Integer> a, int low, int high, int b) {
		while (low <= high) {

			int mid = low + (high - low) / 2;
			if (low == high) {
				if (a.get(low) <b) {
					return -1;
				}
			}

			if (a.get(mid) == b) {
				return mid;
			}
			if (a.get(mid) > a.get(low)) {
				if (b <= a.get(mid) && b >= a.get(low)) {
					high = mid - 1;
				} else {
					low = mid + 1;
				}
			} else if (a.get(mid) < a.get(high)) {

				if (b >= a.get(mid) && b <= a.get(high)) {
					low = mid + 1;
				} else {
					high = mid - 1;
				}
			}

		}
		return -1;
	}

}
