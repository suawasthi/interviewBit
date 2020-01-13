
public class FactorialZeroCount {

	public static void main(String[] args) {

		System.out.println(factorialZero(1));
	}
	
	public static int factorialZero(int A) {
		Integer rem = A/5;
		int sum =rem;
		while(rem >=1 ) {
			
			rem = rem/5;
			sum +=rem;
		}
		
		
		
		return sum;
	}

}
