
public class ArrayRank {

	public static void main(String[] args) {
		
		char s[]= "ZCSFLVHXRYJQKWABGT".toCharArray();
		long rank=1L;
		int count=0;
		int i=0;
		for(;i<s.length-1;i++)
		{
			count=0;
			for(int j=i+1;j<=s.length-1;j++)
			{
				if(s[i] > s[j] ) {
				count++;
				}
			}
			rank += count *(fact(s.length-1-i))%1000003;
		}
		
		System.out.println((int) rank%1000003);
	}

	private static long fact(long n) {
	return n<=2 ? n : n*fact(n-1) %1000003 ;	
	}
}
