package arrays;

import java.util.*;
public class MedianOfArray {
	
	
	public static int findMedian(int arr[]) {
		Arrays.sort(arr);
		int n=arr.length;
		if(n%2!=0) {
			return arr[n/2];
		}
		else {
			return (arr[n/2]+arr[n/2-1])/2;
		}
		
	}
	
	public static void main(String args[]) {
		int arr[]= {1,3,5,7,11,13};
		System.out.println(findMedian(arr));
	}
}
