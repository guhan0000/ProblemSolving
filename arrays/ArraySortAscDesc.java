package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraySortAscDesc {
	
	public static int[] optimized(int arr[]) {
		Arrays.sort(arr);
		int mid=(arr.length+1)/2;
		int index=0;
		// index is used to track the index in which the last element is added.
		int result[]=new int[arr.length];
		for(int i=0;i<mid;i++) {
			result[index++]=arr[i];
		}
		for(int i=arr.length-1;i>=mid;i--) {
			result[index++]=arr[i];
		}
		return result;
	}
	
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6};
		List<Integer>list=new ArrayList<>();
		Arrays.sort(arr);
		System.out.println("sorted array");
		for(int i:arr) {
			System.out.print(i+" ");
		}
		for(int i=0;i<arr.length/2;i++) {
			list.add(arr[i]);
		}
		System.out.println("\nArrayList");
		System.out.println(list);
		for(int i=arr.length-1;i>=arr.length/2;i--) {
			list.add(arr[i]);
		}
		System.out.println("final\n"+list);
		Object[] array = list.toArray();
//		for(int i=arr.length/2;i>=0;i--) {
//			System.out.println(arr[i]);
//			
//		}
		System.out.println("**************");
		System.out.println("Optimized soln");
		System.out.println(Arrays.toString(optimized(arr)));
	}

}
