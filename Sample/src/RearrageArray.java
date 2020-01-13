import java.util.Arrays;

public class RearrageArray {

	public static void main(String[] args) {
		Integer arr[] = { 1,0};
		arrange(Arrays.asList(arr));

	}

	public static void arrange(java.util.List<Integer> a) {

		for (int i = 0; i < a.size(); i++) {

			int current = i;
			int number = 0;
			if (a.get(i) <= -1) {
				continue;
			}
			int start = a.get(current);
			while (current >= 0) {
				int temp = a.get(current);
				if (temp >= 0) {

					number = a.get(a.get(current));
					if (number < 0) {
						a.set(current, -(start + 1));
						current = -1;
						continue;

					} else {
						a.set(current, -(number + 1));
						current = temp;
					}
				}

				else {
					current = -1;
				}

			}
		}
		for (int i = 0; i < a.size(); i++) {
			a.set(i, -(a.get(i)+1));
		}
		
		System.out.println(a);
	}

}
