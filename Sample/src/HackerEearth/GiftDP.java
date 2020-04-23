package HackerEearth;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

import HackerEearth.Gift.cutom;

public class GiftDP {

	public static void main(String[] args) {

		int[] input = { 2,2,2,2 };
		Map<Integer, cutom> map = new LinkedHashMap<Integer, Gift.cutom>();
		map.put(input[0], new cutom(0, input[0]));

		int max = Integer.MIN_VALUE;

		for (int i = 1; i < input.length; i++) {
			max = Math.max(max, input[i]);
			if (input[i] == input[i - 1]) {
				map.put(input[i], new cutom(i, map.get(input[i]).lastS + input[i]));
				input[i - 1] = -input[i - 1];
				continue;
			}
			map.put(input[i], new cutom(i, input[i]));
		}
		int[] dp = new int[input.length];
		Arrays.fill(dp, -1);
		if (input.length == 1)
			max = input[0];

		int ans = Integer.MIN_VALUE;
		for (int i = 0; i < input.length; i++) {
			if (input[i] > 0) {
				ans = Math.max(performDFS(map, input, max, i, map.get(input[i]).lastS, dp), max);
				System.out.println(ans);
			}

		}
		System.out.println(Arrays.toString(dp));
		System.out.println(total);

	}

	static int total = 0;

	private static int performDFS(Map<Integer, cutom> map, int[] input, int max, int current, int sumNow, int dp[]) {

		int mult = 2;
		int updatedSum = sumNow;
		
		while (mult * input[current] <= max) {
			if (map.get(input[current] * mult) != null && map.get(input[current] * mult).lastIndex > current) {
				int sum  = map.get(input[current] * mult).lastS + sumNow;
				 total =performDFS(map, input, max, map.get(input[current] * mult).lastIndex, sum, dp);
				 dp[current] = Math.max(dp[current], total) - input[current];
				//updatedSum -= map.get(input[current] * mult).lastS;

				}
			mult++;

		}
		System.out.println(input[current]);
		System.out.println(total);
		System.out.println(updatedSum);
		
		if(total==0) {
			return updatedSum;
		}
		
		//dp[current]=Math.abs(sumNow-total);
		return total;
	}

}
