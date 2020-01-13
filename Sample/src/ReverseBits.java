
public class ReverseBits {

	public static void main(String[] args) {
//1879048192
		
		//011
		//0101  => 536870912
		long x=4		;
		long i=j;
		while(i<30) {
			
			if((x & (1 << (i - 1)))==1) {
				
			}
			else {
			x=x<<1;
			}
			System.out.println(x);
			
			i++;
		}
		System.out.println(x);
	}

}
