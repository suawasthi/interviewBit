package graphs;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Scanner;

import javax.print.attribute.HashAttributeSet;

public class Girft {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Element nos");

		int[] input =  {2,6,8,9,12,16};
		
		scan.close();
		System.out.println("aasd");
		int maxElement = Integer.MIN_VALUE;
		Map<Integer, Integer> map = new HashMap();
		for (int i = 0; i < input.length; i++) {
			map.put(input[i], i);
			maxElement=Math.max(maxElement, input[i]);
		}
		Queue<Custom> queue = new LinkedList<Custom>();
		queue.add(new Custom(input[0], input[0]));
		int cache[] = new int[input.length];
		int maxAns=Integer.MIN_VALUE;
		while(!queue.isEmpty()) {
			int mult=2;
			Custom x1=  queue.poll();
			int x= x1.element;
			int currentSum=x1.currentSum;
			int currentAns=x;
			while(x * mult <= maxElement) {
				if(map.get(x*mult)!=null) {
					int ans= currentSum + x*mult;
					queue.offer(new Custom(ans,x*mult ));
					currentAns= Math.max(currentAns, ans);
				}
				mult++;
			}
			maxAns= Math.max(maxAns, currentAns);
			
		}
		System.out.println(maxAns);
	
	}
	static class Custom{
		
		int currentSum;
		int element;
		public Custom(int currentSum, int element) {
			this.currentSum=currentSum;
			this.element=element;
		}
		
		
	}

}
