package Bits;

import java.util.HashSet;
import java.util.Set;

import javax.print.attribute.standard.Finishings;

public class XOrs {
	
	public static void main(String[] args) {
		int nums[] = {1, 2, 3, 4, 5};
		System.out.println(findMaximumXOR(nums));
	}

	public static int findMaximumXOR(int[] nums) {
        int mask = 0, max = 0;
        for (int i = 3; i >= 0; i--) {
            mask |= (1 << i);
            System.out.println(Integer.toBinaryString(mask));
            Set<Integer> prefixes = new HashSet<>();
            for (int n : nums) {
                prefixes.add(mask & n);
            }
            int tmp = max | (1 << i);
            for (int pre : prefixes) {
                if (prefixes.contains(tmp ^ pre)) {
                    max = tmp;
                    break;
                }
            }
        }
        return max;
    }
}
