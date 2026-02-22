package tcs;

import java.util.ArrayList;
import java.util.Arrays;

public class MoveZeroesToEndArray {
	
	static void moveZeros(int arr[] ){
		int j=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=0) {
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				j++;
				
			}
		}
		System.out.println("*******************");
		System.out.println(Arrays.toString(arr));
	}
	
	public static void main(String[] args) {
		int arr[]= {4,5,0,1,9,0,5,0};
		int count=0;
		ArrayList<Integer>list=new ArrayList();
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=0) {
				list.add(arr[i]);
			}
			else {
				count++;
			}
		}
		System.out.println(list);
		System.out.println(count);
		for(int i=0;i<count;i++) {
			list.add(0);
		}
		int[] array = list.stream().mapToInt(n->n).toArray();
		System.out.println(Arrays.toString(array));
		moveZeros(arr);
	}

}
