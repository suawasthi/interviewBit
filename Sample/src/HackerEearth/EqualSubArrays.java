package HackerEearth;

public class EqualSubArrays {

	public static void main(String[] args) {

		int[] input = { 1, 4, 9, 3, 7, 8 };
		int k1 = 9;
		int ans =1;
		for (int i = 0; i < input.length; i++) {
			int[] max= new int[input.length];
			max[i]=input[i];
			for (int j3 = i+1; j3 < input.length; j3++) {
				max[j3]= Math.max(max[j3-1], input[j3]);
			}
			for (int j = i; j < input.length; j++) {
				int maxi=max[j];
				int remK1=k1;
				int count=0;
				for (int j2 = i; j2 <=j; j2++) {
					if(input[j2]==maxi) {count++; ans = Math.max(count, ans) ;continue;}
					remK1=  remK1-(maxi-input[j2]);
					if(remK1 >= 0) {
						count++;
						ans = Math.max(count, ans);
					}else {
						break;
					}
					
				}
			}
		}
		
		System.out.println(ans);
	}

}
