package hashing2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class LightSaber {

	public static void main(String[] args) {
		
		
		// TODO Auto-generated method stub
		Integer[] A = { 1, 2, 3, 4, 1};
		Integer[] B = {  2, 1, 1, 0};
		System.out.println(solve(Arrays.asList(A), Arrays.asList(B)));

	}

	public static int solve(List<Integer> A, List<Integer> B) {int m = B.size();
    int[] freq = new int[m + 1];
    int count = 0, min = Integer.MAX_VALUE;
    for(int i = 0; i < m; i++)
    {
        freq[i + 1] = freq[i + 1] - B.get(i);
        count = count - B.get(i);
    }
    int sum = -1 * count;
    int i = 0, j = 0, n = A.size();
    while(i < n)
    {
        if(freq[A.get(i)] < 0)
            count++;
        freq[A.get(i)]++;
        while(j < i && count == 0)
        {
            if((i - j + 1) < min)
            {
                min = i - j + 1;
            }
            if(freq[A.get(j)] == 0)
            {
                count--;
            }
            freq[A.get(j)]--;
            j++;
        }
        i++;
    }
    //System.out.println(min);
    return min == Integer.MAX_VALUE ? -1 : min - sum;
    }

}
