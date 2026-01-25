package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ElementFreqArray {
	public static void main(String[] args) {
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
		
	}

}
