package arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class RepeatingElements {
	
	
	public static void main(String[] args) {
		int arr[]= {10, 30, 40, 20, 10, 20, 50, 10};
		Map<Integer,Integer>map=new HashMap<Integer, Integer>();
		Set<Integer>set=new TreeSet();;
		for(int i=0;i<arr.length;i++) {
			if(map.containsKey(arr[i])) {
				map.put(arr[i], map.get(arr[i])+1);
				set.add(arr[i]);
				
			}
			else {
				map.put(arr[i], 1);
				
			}
		}

		for(Map.Entry<Integer, Integer>entry:map.entrySet()) {
			if(entry.getValue()>1) {
				System.err.println(entry.getKey());
			}
		}
		System.out.println(set);
	}

}
