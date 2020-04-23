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
		//int nos = scan.nextInt();
		int[] input = {2,2,3,21,2};
		//for (int i = 0; i < nos; i++) {
			//input[i] = scan.nextInt();
		//}
		//in
		//scan.close();
		// if(input.length > 0){
		HashMap<Integer, Integer> map = new HashMap();
		int maxElement = Integer.MIN_VALUE;

		for (int i = 0; i < input.length; i++) {
			map.put(input[i], i);
			maxElement = Math.max(input[i], maxElement);
		}
		// System.out.println(map +" : :"+ maxElement);
		int maxAnswe = Integer.MIN_VALUE;
		for (int i = 0; i < input.length; i++) {
			Queue<Custom> queue = new LinkedList<Custom>();
			queue.offer(new Custom(input[i], input[i], i));
			while (!queue.isEmpty()) {
				Custom temp = queue.poll();
				int currentSum = temp.currentSum;
				int currentElement = temp.element;
				int index = temp.index;
				int multFactor = 1;
				int currentAnswer = currentElement;
				while (multFactor * currentElement <= maxElement) {
					if (map.get(multFactor * currentElement) != null && index < map.get(multFactor * currentElement)) {
						int ans = currentSum + currentElement * multFactor;
						currentAnswer = Math.max(currentAnswer, ans);
						queue.offer(new Custom(ans, currentElement * multFactor, map.get(multFactor * currentElement)));
					}
					maxAnswe = Math.max(maxAnswe, currentAnswer);

					multFactor++;
				}
			}

			// }
		}
		System.out.print(maxAnswe);
	}

	static class Custom {
		int currentSum;
		int element;
		int index;

		Custom(int currentSum, int element, int index) {
			this.currentSum = currentSum;
			this.element = element;
			this.index = index;
		}

	}
}
