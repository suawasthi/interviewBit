
public class SingleElementBinarySearch {

	public static void main(String[] args) {
		int[] Arr = { 5, 5,11, 11,100, 100,105,120, 120};
		System.out.println(solve(Arr));

	}

	public static int solve(int[] A) {
		int k = performBinary(0, A.length - 1, A);
		return k;
	}

	public static int performBinary(int low, int high, int[] arr) {

		int mid = low + (high - low) / 2;
		if (low >= high) {
			return arr[low];
		}
		if (mid % 2 != 0) {

			if (arr[mid] == arr[mid - 1]) {
				low = mid + 1;
			} else {
				high = mid - 1;

			}

		}
		if (mid % 2 == 0) {
			if (arr[mid] == arr[mid + 1]) {
				low = mid+2;
			} else {

				high = mid - 1;
			}

		}
		return performBinary(low, high, arr);
	}

}
