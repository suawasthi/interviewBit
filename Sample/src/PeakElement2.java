
public class PeakElement2 {

	public static void main(String[] args) {
		int[] A = {0,3,4,1};
		System.out.println(performBinary(0, A.length, A));
	}

	public static int performBinary(int low, int high, int[] arr) {

		int mid = low + (high - low) / 2;

		if(high>arr.length)
		{
			return arr[arr.length];
		}
		if(mid==0) {
			return arr[0];
		}
		
		if(low >=high) {
			return arr[low];
		}
		
		if (mid - 1 >= 0 && mid + 1 < arr.length && arr[mid] > arr[mid - 1] && arr[mid] > arr[mid + 1]) {

			return arr[mid];
		}
		else if (mid - 1 >= 0 && arr[mid - 1] >= arr[mid]) {
			high = mid - 1;
		} 

		else if (mid + 1 < arr.length && arr[mid + 1] >= arr[mid]) {
			low = mid + 1;
		} 
		else if(mid + 1 <= arr.length) {
			return arr[arr.length-1];
		}
		else if (mid-1 <=0) {
			return arr[0];
		}

		return performBinary(low, high, arr);

	}
}
