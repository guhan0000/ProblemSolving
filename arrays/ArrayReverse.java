package arrays;

import java.util.Arrays;
import java.util.List;

public class ArrayReverse {
	
	static int[] reversedArray(int arr[]) {
		int res[]=new int[arr.length];
		for(int i=0;i<arr.length;i++) {
			res[i]=arr[arr.length-1-i];
		}
		return res;
	}
	
	public static void main(String[] args) {
//		List<Integer> arr=Arrays.asList(1,3,5,7,9,11);
		int arr[]= {1,3,5,7,9,11};
		int[] reversedArray = reversedArray(arr);
		for(int i:reversedArray) {
			System.out.print(i+" ");
		}
		
	}

}
