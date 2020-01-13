
public class perfectSquare {

	public static void main(String[] args) {
		System.out.println(solve(120));
	}
	
	public static int solve(int A) {
		int count= 1;
		//floor(sqrt(b)) - ceil(sqrt(a)) + 1
		
		int sq= (int) (Math.floor(Math.sqrt(A)));
		for (int i = 2; i <= A; i++) {
			if(isPerfect(i)) {
				count++;
			}
		}
		System.out.println(sq);
		return count;
    }
	public static boolean isPerfect(int x) {
		
		double sq= Math.sqrt(x);
		
		return (sq-Math.floor(sq)==0);
	}
	
}
