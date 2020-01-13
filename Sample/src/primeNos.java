
public class primeNos {

	public static void main(String[] args) {
		System.out.println(Integer.toString(14, 14));
		countPrimes(10);

	}
	 public static int countPrimes(int n) {
	       
		 int ans=0;
	        for(int i=1;i<=n;i++){
	            int sqr= (int)Math.sqrt(i);
	            if(isPrime(i, sqr)) ans++;
	        }
	        System.out.println(ans);
	        return ans;
	    }
	    public static boolean isPrime(int n, int sqr){
	      
	        int factor=1;
	        for(int i=2;i<sqr;i++){
	            if(n%i==0) factor++;
	        }
	        System.out.println(n + "::" + factor);
	        return factor ==2 ? true : false;
	    }

}
