package arrays;

import java.util.*;
public class LeftRotation {
	
	public static int[] leftRotate(int arr[],int k) {
		int n=arr.length;
		k=k%n;
		int res[]=new int[n];
		int index=0;
		for(int i=k;i<n;i++) {
			res[index++]=arr[i];
		}
		for(int i=0;i<k;i++) {
			res[index++]=arr[i];
		}
		return res;
	}
	public static void main(String ars[]) {
		int arr[]= {1,3,5,7,11};
		System.out.println(Arrays.toString(leftRotate(arr, 6)));
	}

}
