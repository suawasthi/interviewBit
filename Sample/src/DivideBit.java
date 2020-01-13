
public class DivideBit {

	public static void main(String[] args) {
		int A=-50 , B=10;
		System.out.println(extract(A, B));
		
	}

	private static int extract(int A, int B) {

		if(A==Integer.MIN_VALUE && B==-1) {
			return Integer.MAX_VALUE;
		}
		
		int  a= Math.abs(A);
		int b = Math.abs(B);
		int result =0;
		while(a-b >=0) {
			int x =0;
			while(a-(b<<1<<x)>0) {
				x++;
			}
			
			result += 1<<x;
			a-= b<<x;
		}
		
		if(A <=0 && B<=0) {
			return result;
		}
		else 
		{
			return -result;
		}
		
	
	}

}
