package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CountElementsWithMaxFrequency {
	public static void main(String[] args) {
		int arr[]= {1,2,2,3,1,4};
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
	
	for(Integer value:map.values()) {
		System.out.print(value+" "+"\n");
	}
	int maxFreq=Integer.MIN_VALUE;
	int sum=0;
	Collection<Integer> values = map.values();
	System.out.println(values);
//	List<Collection<Integer>> asList = Arrays.asList(values);
//	Object[] array = values.toArray();
	List<Integer> valuesArr=new ArrayList<>();
//	Arrays.sort(array);
	for(int value:map.values()) {
		valuesArr.add(value);
	}
	Collections.sort(valuesArr);
	for(int i=valuesArr.size()-1;i>=0;i--) {
		if(maxFreq<=valuesArr.get(i)) {
			maxFreq=valuesArr.get(i);
			sum+=maxFreq;
			
		}
		
	}
//	System.out.println(array);
	

	
	System.out.println(sum);
	}
	

}
