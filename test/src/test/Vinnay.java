package test;

import java.util.Arrays;

public class Vinnay {

	public static void main(String[] args) throws CloneNotSupportedException {
		int[] input = {200,6,36, 23,612,121,66,63,39,661};
		Vinnay vin= new Vinnay();
		vin.clone();
		int k=0;
		int currentSum=0;
		boolean flag=false;
		for(int i=0;i<input.length;i++) {
		
			if(input[i] > 99) {
				if(flag) {
					k++;
					flag=false;
				}
				
				input[k]= input[i];
				currentSum=0;
				k++;
				continue;
				
			}
			
			currentSum+=input[i];
			input[k]=currentSum;
			flag=true;
			
			
		}
		
		if(flag==false) {
			System.out.println("here");
			System.out.println(k);
		}else{
			System.out.println(k+1);
		}
		System.out.println(Arrays.toString(input));
	}
}
