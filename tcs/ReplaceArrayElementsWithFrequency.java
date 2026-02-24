package tcs;

import java.util.*;
public class ReplaceArrayElementsWithFrequency {
	
	
	public static int[] replace(int arr[]) {
		HashMap<Integer,Integer>map=new HashMap<>();
		for(int num:arr) {
			if(map.containsKey(num)) {
				map.put(num,map.get(num)+1);
			}
			else {
				map.put(num,1);
			}
		}
		for(int i=0;i<arr.length;i++) {
			arr[i]=map.get(arr[i]);
		}
		return arr;
	}
	
	public static void main(String args[]) {
		int arr[]= {1,2,2,6};
		int[] replace = replace(arr);
		System.out.println(Arrays.toString(replace));
	}
	

}
