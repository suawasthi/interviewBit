package Bits;

import java.util.List;

public class HammingCode {

	public static void main(String[] args) {
		int[] A = { 2, 4, 6 ,7 };
		System.out.println(hammingDistance(A));
	}

	public static int hammingDistance(int[] A) {
		Gra
		int mask = 1;
		long ans = 0;
		for (int i = 0; i < 32; i++) {
			int oneCount = 0;
			int oddCount = 0;
			for (int j = 0; j < A.length; j++) {
				if ((mask & A[j]) != 0) {
					oneCount++;
				}

			}
			mask <<=1;
			ans += (int)oneCount * (A.length-oneCount);
		}

		return (int) ans*2;
	}

}
