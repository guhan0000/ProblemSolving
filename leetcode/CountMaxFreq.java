package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class CountMaxFreq {
	
	public static void main(String[] args) {
		int arr[]= {1,2,2,3,1,4};
		int max=0;
		int count=0;
		Map<Integer,Integer>map=new HashMap<>();
		List<Integer>list=new ArrayList<>();
		for(int i=0;i<arr.length;i++) {
			if(map.containsKey(arr[i])) {
				map.put(arr[i], map.get(arr[i])+1);
			}
			else {
				map.put(arr[i], 1);
			}
			if(map.get(arr[i])>max) {
				max=map.get(arr[i]);
			}
		}
		for(int i=0;i<arr.length;i++) {
			if(map.get(arr[i])==max) {
				count++;
			}
		}
		System.out.println(count);
	}

}
