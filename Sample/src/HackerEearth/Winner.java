package HackerEearth;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Winner {
	// x & n==0
	// 1 <= x <=n
	public static void main(String[] args) {

		int a =2;
		System.out.println(~(a));
		
		
		Scanner scan = new Scanner(System.in);
		int nos = 1;
		long[] input = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};

		for (int i = 0; i < input.length; i++) {
			//input[i] = scan.nextLong();
		}
		int val=10;
		ArrayList<Integer> arr = new ArrayList<Integer>();
		System.out.println(arr.size());
		arr.add(1);
		arr.add(3);
		arr.add(1,2);
		arr.remove(2);
		arr.remov
		

		Long currentSize = 0l;
		for (int i = 0; i < input.length; i++) {
			currentSize = input[i];
			long currentElement = input[i];
			String turn= "Jatin";
			String currentWinner="Pranshu";
			while(true) {
				if(currentElement==0) {
					break;
				}
				if((currentElement & currentSize) ==0) {
					String temp= new String(turn);
					turn=currentWinner;
					currentWinner=temp;
					currentSize -= currentElement;
					currentElement=currentSize;
					continue;
				} else if((currentElement & currentSize) !=0){
					currentElement  = nextNo(currentElement);
					
				}
				
				
			}
			
			//System.out.println(turn);
			System.out.println(currentWinner);
			
			

		}

	}

	private static long nextNo(long currentElement) {
		Long l = currentElement; // 101
		char[] ch = Long.toBinaryString(l).toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] == '0') {
				ch[i] = '1';
			} else {
				ch[i] = '0';
			}
		}
		
		
		return Long.parseLong(String.valueOf(ch), 2);
		//return 0;
	}

}
