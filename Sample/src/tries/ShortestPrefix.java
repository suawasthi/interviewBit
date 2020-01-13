package tries;

import java.util.ArrayList;

public class ShortestPrefix {

	static class Tries {
		Tries[] child = new Tries[256];
		int freq;

		Tries() {
			freq = 1;
			for (int i = 0; i < 256; i++) {
				child[i] = null;
			}
		}

	}

	static Tries root;

	public static void main(String[] args) {
		// insert function

		String arr[] = { "zebra", "dog", "duck", "dove" };
		root = new Tries();

		for (int i = 0; i < arr.length; i++) {
			Tries node = root;

			for (int j = 0; j < arr[i].length(); j++) {
				int index = arr[i].charAt(j);

				if (node.child[index] == null) {
					node.child[index] = new Tries();
				} else {
					(node.child[index].freq)++;
				}
				node = node.child[index];

			}

		}
		ArrayList<String> sResult = new ArrayList<String>();
		for (int i = 0; i < arr.length; i++) {
			Tries node1 = root;
			StringBuilder sb = new StringBuilder();
			for (int j = 0; j < arr[i].length(); j++) {
				int index = arr[i].charAt(j);
				sb.append(arr[i].charAt(j));
				if (node1.child[index] != null) {
					if (node1.child[index].freq == 1) {
						sResult.add(sb.toString());
						break;
					}
				}
				node1 = node1.child[index];

			}

		}

		System.out.println(sResult.toString());

	}
	
   
}
