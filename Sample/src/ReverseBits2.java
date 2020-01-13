
public class ReverseBits2 {

	public static void main(String[] args) {

		reverse(3L);
	}
	
	public static long reverse(long a) {
	
		Long result=0L;
		int times =32;
		System.out.println(Long.toBinaryString(a));
		while(times>0) {
			long i= a & 1;
		    long j= a >> times;
		    System.out.println(i);
		    System.out.println(j);
			result = result <<1 | i ^j;
			System.out.println(Long.toBinaryString(result));
			times--;
			a=a>>1;
		}
		
		
		System.out.println(result);
		
		return -1L;
	}
	

}
