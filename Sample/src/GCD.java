
public class GCD {

	public static void main(String[] args) {

		System.out.println(gcd(9,6));
	}
	public static int gcd(int x, int y) {
		
		int min = Math.min(x, y);
		int max= Math.max(x, y);
		
		if(max %min==0) {
			return min;
		}
		
		return gcd((max%min), min);
		
	}

}
