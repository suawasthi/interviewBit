package test;

import java.util.Arrays;

public class RotateList {

	public static void main(String[] args) {
		int arr[] = {2,2,2,1,1,1,0,0,0}; 
        int arr_size = arr.length; 
        sort012(arr, arr_size); 
        System.out.println("Array after seggregation ");
        System.out.println(Arrays.toString(arr));
        }
	
	
	static void sort012(int a[], int arr_size) 
    { 
        int lo = 0; 
        int hi = arr_size - 1; 
        int mid = 0, temp = 0; 
        while (mid <= hi) { 
            switch (a[mid]) { 
            case 0: { 
                temp = a[lo]; 
                a[lo] = a[mid]; 
                a[mid] = temp; 
                lo++; 
                mid++; 
                break; 
            } 
            case 1: 
                mid++; 
                break; 
            case 2: { 
                
            	temp= a[hi];
            	a[hi]=a[mid];
            	a[mid]=temp;
                hi--; 
                break; 
            } 
            } 
        } 
    } 
  

}
