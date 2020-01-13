
public class AreaOverlapping {

	public static void main(String[] args) {
		int A = 0, B = 0;
		int C = 4, D = 4;
		int E = 2, F = 2;
		int G = 6, H = 6;
		System.out.println(solve(A, B, C, D, E, F, G, H));
	}

	public static int solve(int A, int B, int C, int D, int E, int F, int G, int H) {
		if (overlap(A, B, C, D, E, F, G, H)) {
			int x = solve(A, E, C, G);

			int y = solve(B, F, D, H);

			return x * y;
		} else
			return 0;

	}

	public static int solve(int l1x, int r1x, int l1y, int r1y) {

		return (Math.min(r1y, l1y) - Math.max(l1x, r1x));
	}

	public static boolean overlap(int A, int B, int C, int D, int E, int F, int G, int H) {

		if (B > H || F > D) {
			return false;
		}
		if (C < E || A > G) {
			return false;
		}

		return true;
	}
}
