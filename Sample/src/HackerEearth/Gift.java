package HackerEearth;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class Gift {

	public static void main(String[] args) {

		int[] input = {1,2,2,3,4,5};
		Map<Integer, cutom> map = new LinkedHashMap<Integer, Gift.cutom>();
		map.put(input[0], new cutom(0, input[0]));
		int max=Integer.MIN_VALUE;
		for (int i = 1; i < input.length; i++) {
			max= Math.max(max, input[i]);
			if (input[i] == input[i - 1]) {
				map.put(input[i], new cutom(i, map.get(input[i]).lastS + input[i]));
				input[i - 1] = -input[i - 1];
				continue;
			}
			map.put(input[i], new cutom(i, input[i]));
		}
		int maxAnswe = Integer.MIN_VALUE;
		for (int i = 0; i < input.length; i++) {
			if (input[i] < 0)
				continue;
			cutom temp = map.get(input[i]);
			int currentSum = temp.lastS;
			int index = temp.lastIndex;

			Queue<Custom2> queue = new LinkedList<Custom2>();
			queue.offer(new Custom2(currentSum, input[i], index));
			while(!queue.isEmpty()) {
				int multi=2;
				Custom2 cust= queue.poll();
				int currentElemt= cust.element;
				int perviosSum =cust.currentSum;
				int previousIntde= cust.index;
				int currentAnswer=perviosSum;
				while(multi * currentElemt <= max ) {
					if(map.get(multi * currentElemt)!=null &&  map.get(multi * currentElemt).lastIndex > previousIntde )
					{
						int ans=perviosSum + map.get(multi * currentElemt).lastS;
						queue.offer(new Custom2(ans , input[map.get(multi * currentElemt).lastIndex], index));
						currentAnswer= Math.max(currentAnswer, ans);
					}
					multi++;
				}
				maxAnswe = Math.max(maxAnswe, currentAnswer);

			}

		}

		System.out.println(maxAnswe);

	}

	static class cutom {
		int lastIndex;
		int lastS;

		public cutom(int lastIndex, int lastS) {
			super();
			this.lastIndex = lastIndex;
			this.lastS = lastS;
		}

		@Override
		public String toString() {
			return "cutom [lastIndex=" + lastIndex + ", lastS=" + lastS + "]";
		}

	}

	static class Custom2 {
		int currentSum;
		int element;
		int index;

		Custom2(int currentSum, int element, int index) {
			this.currentSum = currentSum;
			this.element = element;
			this.index = index;
		}

	}
}
