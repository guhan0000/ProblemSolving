package leetcode;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
	public static void main(String[] args) {
		int arr[]= {3,2,3};
		int res=0;
//		System.out.println(arr.length/2);
		Map<Integer, Integer>map=new HashMap<Integer, Integer>();
		for(int i=0;i<arr.length;i++) {
			if(map.containsKey(arr[i])) {
				map.put(arr[i], map.get(arr[i])+1);
			}
			else {
				map.put(arr[i], 1);
			}
			if(map.get(arr[i])>arr.length/2) {
				res=arr[i];
			}
		}
		System.out.println(res);
		System.out.println(3/2);
		
	}

}
