package arrays;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class MapTest {
	public static void main(String[] args) {
//		Map<Integer,Integer> map=new HashMap<Integer, Integer>();
//		map.put(5, 1);
//		System.out.println(map);
//		Integer integer = map.get(5);
//		System.out.println(integer);
//		map.put(5, integer+1);
//		System.out.println(map);
		int arr[]= {5,4,5,3,2,4,4,6,6,1,0};
		List<Integer> list=new ArrayList<>();
		Map<Integer, Integer>map=new HashMap<Integer, Integer>();
		
		for(int num:arr) {
			if(list.contains(num)) {
				Integer count = map.get(num);
				map.put(num, count+1);
			}
			else {
				list.add(num);
				map.put(num, 1);
			}
		}
		System.out.println(map);
		Set<Integer> keySet = map.keySet();	
		System.out.println(keySet);
		Collection<Integer> values = map.values();
		System.out.println(values);
		for(Map.Entry<Integer, Integer>entry:map.entrySet()) {
			System.out.println(entry.getKey()+": "+entry.getValue());
		}
	}

}
