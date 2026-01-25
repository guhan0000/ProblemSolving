package arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class DistinctElementsCount {
	
	public static void main(String[] args) {
		int arr[]= {1,4,2,0,1,4,5};
		
		Map<Integer, Integer>map=new HashMap<Integer, Integer>();
		for(int i=0;i<arr.length;i++) {
			if(map.containsKey(arr[i])) {
				map.put(arr[i], map.get(arr[i])+1);
			}
			else {
				map.put(arr[i], 1);
			}
		}
		System.out.println(map);
		
		
			// simply print map size
			System.out.println(map.size());
//			alternate using set by default set doesn't allow duplicates
			Set<Integer>set=new TreeSet<Integer>();
			for(int num:arr) {
				set.add(num);
			}
			System.out.println("set "+set);
			System.out.println(set.size());
		}

}
