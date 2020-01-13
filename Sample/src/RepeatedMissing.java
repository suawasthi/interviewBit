import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RepeatedMissing {

	public static void main(String[] args) {
		Integer[] a= {3 ,1 ,2 ,5 ,3};
		System.out.println(repeatedNumber(Arrays.asList(a)));
	}
	 public static ArrayList<Integer> repeatedNumber(final List<Integer> A) {
    ArrayList<Integer> a= new ArrayList<Integer>();
    Long sum=0L;
    Long sumSqr=0L;
    for(int i=1;i<=A.size();i++){
        sum += (long)i;
        sum -= (long)A.get(i-1);
        
        
        sumSqr += (long)i*i;
        sumSqr -=(long)A.get(i-1) *A.get(i-1);
        
        
    }
    Long diff= sum ;
    Long sumF= sumSqr/sum;
    
     a.add((int) (long)((sumF-diff )/2));
    a.add((int) (long)((diff+ sumF)/2));
    
    return a;
    
    
	 }
    

}
