package searching;

import java.util.Arrays;

public class MatrixMedian {

	public static void main(String[] args) {
		int A[][] = { { 1, 3, 5 }, { 2, 6, 9 }, { 3, 6, 9 } };
		int B[][]= {{1, 1, 1, 2, 3}};
		int e[][] = {{1, 1, 2, 2, 2, 3, 3}};
		int[][] c= {{2, 2, 2, 2, 2, 3, 3}};
		int F [][]= 
			{
			  {2},
			  {1},
			  {4},
			  {1},
			  {2},
			  {2},
			  {5},
			};
		// odd No of element to be greater is
		// 1,2,3,3,5,6,6,9,9
		// Row * column /2
		System.out.println(findMedian(F));
	}

	public static int findMedian(int[][] A) {

		// min of all
		// max of all
		int row = A.length;
		int coulmn = A[0].length;
		int min = Integer.MAX_VALUE;
		;
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < A.length; i++) {

			if (A[i][0] <= min) {
				min = A[i][0];
			}

			if (A[i][coulmn - 1] > max) {
				max = A[i][coulmn - 1];
			}

		}
		int midm=0;
		int low = min;
		int high = max;
		int median = (row * coulmn + 1) / 2;
		while (low < high) {
			int currentGreater = 0;
			
			int mid = low + (high - low) / 2;

			for (int i = 0; i < A.length; i++) {

				int position = Arrays.binarySearch(A[i], mid);
				if (position < 0) {
					currentGreater += (Math.abs(position) - 1);
				} else {
					currentGreater+=position;
					while (position < A[i].length && A[i][position] == mid) {
						currentGreater++;
						position++;
					}
				}
			}
			
		
			if (currentGreater < median) 
				low = mid + 1; 
			else
				high = mid; 

		}
		return low;
	}

}
