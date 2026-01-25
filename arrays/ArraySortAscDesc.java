package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraySortAscDesc {
	public static void main(String[] args) {
		int arr[]= {1,4,2,6,7,5,3,9};
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
		
//		for(int i=arr.length/2;i>=0;i--) {
//			System.out.println(arr[i]);
//			
//		}
	}

}
