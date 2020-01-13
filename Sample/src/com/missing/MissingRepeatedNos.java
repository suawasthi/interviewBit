package com.missing;

public class MissingRepeatedNos {

	public static void main(String[] args) {
		System.out.println(2 & (1<<2));
		
		
		Long squareSum=0L;
		Long sum=0L;
		int[] l= { 1,1,2,3,4,6 };
		for(int i=1;i<=l.length;i++) {
			squareSum += (i)*(i);
			squareSum -= l[i-1] *l[i-1];
	
			sum += (i);
			sum -= l[i-1];
		
		}
		
	
		
		//Long diff = sumTotal-sum;
		Long sum1 = squareSum/sum;
		
		/*
		 * System.out.println(sum); System.out.println(sum1);
		 * 
		 * 
		 * System.out.println((sum+sum1)/2); System.out.println((sum1-sum)/2);
		 */


	}

}
