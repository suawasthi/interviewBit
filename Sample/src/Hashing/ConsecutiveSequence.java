package Hashing;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ConsecutiveSequence {

	public static void main(String[] args) {

		Integer[] A= {100, 4, 200, 1, 3, 2};
		System.out.println(longestConsecutive(Arrays.asList(A)));
	}

	public static int longestConsecutive(final List<Integer> A) {
		int ans = 0;

		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		int leftStreak = 0;
		int rightStreak = 0;
		for (int i = 0; i < A.size(); i++) {

			if (map.get(A.get(i)) == null) {

				leftStreak = map.get(A.get(i) - 1) != null ? map.get(A.get(i) - 1) : 0;
				rightStreak = map.get(A.get(i) + 1) != null ? map.get(A.get(i) + 1) : 0;
				int streak = 1 + rightStreak + leftStreak;
				ans = Math.max(ans, streak);
				map.put(A.get(i) - leftStreak, streak);
				map.put(A.get(i) + rightStreak, streak);

			}

		}

		return ans;
	}

}
